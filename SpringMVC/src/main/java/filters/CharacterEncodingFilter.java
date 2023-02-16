package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("EUC-KR");
		// web.xml에도 처리 해야함
		// 처리 끝났으니까 다음으로 가겠다
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	// 초기화 시킬때 씀
		
	}

	
	
	
}
