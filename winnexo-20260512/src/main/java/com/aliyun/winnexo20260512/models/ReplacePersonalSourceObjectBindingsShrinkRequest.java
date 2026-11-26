// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplacePersonalSourceObjectBindingsShrinkRequest extends TeaModel {
    /**
     * <p>token</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The object bindings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The code of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The ID of the data source. The ID is unique within the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplacePersonalSourceObjectBindingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplacePersonalSourceObjectBindingsShrinkRequest self = new ReplacePersonalSourceObjectBindingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplacePersonalSourceObjectBindingsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
