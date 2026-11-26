// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableOutputItemShareRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The output item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The name of the output item. This parameter must be used together with sessionId.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly Review.pptx</p>
     */
    @NameInMap("outputItemName")
    public String outputItemName;

    /**
     * <p>The session ID used for exact filtering. The value must be 1 to 128 characters in length. It applies to common sessions, skill sessions, and the execution ID of task executions.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static DisableOutputItemShareRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableOutputItemShareRequest self = new DisableOutputItemShareRequest();
        return TeaModel.build(map, self);
    }

    public DisableOutputItemShareRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public DisableOutputItemShareRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public DisableOutputItemShareRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public DisableOutputItemShareRequest setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public DisableOutputItemShareRequest setOutputItemName(String outputItemName) {
        this.outputItemName = outputItemName;
        return this;
    }
    public String getOutputItemName() {
        return this.outputItemName;
    }

    public DisableOutputItemShareRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DisableOutputItemShareRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
