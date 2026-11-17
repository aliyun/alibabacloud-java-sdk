// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ConvertDirectConversationToWorkRequest extends TeaModel {
    /**
     * <p>The source direct session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ConvertDirectConversationToWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertDirectConversationToWorkRequest self = new ConvertDirectConversationToWorkRequest();
        return TeaModel.build(map, self);
    }

    public ConvertDirectConversationToWorkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ConvertDirectConversationToWorkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
