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
		// web.xml���� ó�� �ؾ���
		// ó�� �������ϱ� �������� ���ڴ�
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	// �ʱ�ȭ ��ų�� ��
		
	}

	
	
	
}
