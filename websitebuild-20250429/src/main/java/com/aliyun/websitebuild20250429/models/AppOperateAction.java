// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppOperateAction extends TeaModel {
    /**
     * <p>用于唯一标识一个操作行为</p>
     */
    @NameInMap("ActionKey")
    public String actionKey;

    /**
     * <p>用于在界面中展示操作名称</p>
     */
    @NameInMap("ActionText")
    public String actionText;

    /**
     * <p>标识该操作是否可用</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>点击操作时跳转的URL地址</p>
     */
    @NameInMap("Href")
    public String href;

    public static AppOperateAction build(java.util.Map<String, ?> map) throws Exception {
        AppOperateAction self = new AppOperateAction();
        return TeaModel.build(map, self);
    }

    public AppOperateAction setActionKey(String actionKey) {
        this.actionKey = actionKey;
        return this;
    }
    public String getActionKey() {
        return this.actionKey;
    }

    public AppOperateAction setActionText(String actionText) {
        this.actionText = actionText;
        return this;
    }
    public String getActionText() {
        return this.actionText;
    }

    public AppOperateAction setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AppOperateAction setHref(String href) {
        this.href = href;
        return this;
    }
    public String getHref() {
        return this.href;
    }

}
