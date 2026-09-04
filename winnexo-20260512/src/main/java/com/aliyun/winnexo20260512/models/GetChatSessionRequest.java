// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetChatSessionRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. If not specified, the default value is 20. The maximum value is 100. The actual number of returned results may be less than the specified value but will not exceed it.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The session ID to filter by. If specified, all Active/Expired status information associated with this session is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetChatSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionRequest self = new GetChatSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetChatSessionRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetChatSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetChatSessionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
