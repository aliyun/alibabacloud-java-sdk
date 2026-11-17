// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableOutputItemShareRequest extends TeaModel {
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
