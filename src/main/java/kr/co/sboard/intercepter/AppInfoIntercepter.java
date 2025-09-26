package kr.co.sboard.intercepter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.sboard.config.AppInfo;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.plugin.Intercepts;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
public class AppInfoIntercepter implements HandlerInterceptor {

    private final AppInfo appInfo;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(modelAndView != null) {
            modelAndView.addObject("appInfo", appInfo);
        }
    }
}
