// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ManageLoginRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <strong>example:</strong>
     * <p>mygroup</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static ManageLoginRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageLoginRequest self = new ManageLoginRequest();
        return TeaModel.build(map, self);
    }

    public ManageLoginRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ManageLoginRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public ManageLoginRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ManageLoginRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
