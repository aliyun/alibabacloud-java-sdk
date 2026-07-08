// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ManageLoginRequest extends TeaModel {
    /**
     * <p>Name of the management action. Valid values:</p>
     * <ol>
     * <li><p>open — Activate the public key. This is the default value.</p>
     * </li>
     * <li><p>close — Deactivate the public key.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>Name of the public key group. If you do not specify KeyName, all public keys in this group are applied.</p>
     * 
     * <strong>example:</strong>
     * <p>mygroup</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Name of the public key. You must specify either KeyName or KeyGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>ID of the Cloud Application Service instance.</p>
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
