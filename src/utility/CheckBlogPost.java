package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] offensiveWords= {"babeland","apeshit","ar5e","areola", "a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","	alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus"," aryan","ass", "ass fuck", " ass fuck"," ass hole","areole","arian", "arrse", "arse"," arsehole"};
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		for(int i=0;i<offensiveWords.length;i++) {
			if(blog.getBlogTitle()==offensiveWords[i])
				return false;
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		for(String offensivewords : offensiveWords) {
			if (blog.getBlogDescription().contains(offensivewords))
	            return false;
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		return false;
	}
	
}