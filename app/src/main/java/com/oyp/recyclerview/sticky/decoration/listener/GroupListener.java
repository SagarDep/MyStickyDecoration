package com.oyp.recyclerview.sticky.decoration.listener;

/**
 * Created by OuyangPeng on 2017/6/25.
 * 显示自定义View的Group监听接口，根据position通过接口方法getGroupName获取当前组名
 */
public interface GroupListener {
    /**
     * 根据position通过接口方法getGroupName获取当前组名
     * @param position 位置
     * @return 组名
     */
    String getGroupName(int position);
}
