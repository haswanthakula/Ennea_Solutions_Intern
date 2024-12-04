/*3. Given a string A representing an absolute path for a file (Unix-style). Return the string A after
simplifying the absolute path.
a. In Unix-style file system:
	i. A period'.' refers to the current directory.
	ii. A double period ' .. ' refers to the directory up a level.
	iii. Any multiple consecutive slashes '//' are treated as a single slash '/'.
b. In Simplified Absolute path:
	i.  The path starts with a single slash '/'.
	ii.  Any two directories are separated by a single slash '/'.
	iii. The path doesn't end with trailing slashes '/'
	iv. The path only contains the directories on the path from the root directory tothe target file or directory (i.e., no period '.' or double period ' .. ')
	v. Path will not have whitespace characters.
c. Input format: the only argument given is a string.
d. Output format: Return a string denoting the simplified absolute path for a file (Unix-style).
e. Example 1
	i. Input: "/home/"
	ii. Output: "/home"
f. Example 2
	i. Input: "/a/./b/ .. / .. /c/"
	ii. Output: "/c"    */


//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        
        String[] directories = path.split("/");
        
        for (String dir : directories) { 
            
            if (dir.equals(".") || dir.isEmpty()) { 
                
                continue;
                
            } else if (dir.equals("..")) { 
                
                if (!stack.isEmpty()) {
                    
                    stack.pop();
                }
            } else { 
                
                
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); 
    }
}
