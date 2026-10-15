// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppOperateAction extends TeaModel {
    /**
     * <p>The key used to uniquely identify an action.</p>
     * 
     * <strong>example:</strong>
     * <p>BeginDialogue</p>
     */
    @NameInMap("ActionKey")
    public String actionKey;

    /**
     * <p>The text used to display the action name in the user interface.</p>
     */
    @NameInMap("ActionText")
    public String actionText;

    /**
     * <p>Indicates whether the action is available.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The URL to navigate to when the action is clicked.</p>
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
