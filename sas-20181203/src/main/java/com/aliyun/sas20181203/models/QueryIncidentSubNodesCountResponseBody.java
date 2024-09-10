// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentSubNodesCountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The child nodes.</p>
     */
    @NameInMap("SubNodesCount")
    public java.util.Map<String, Integer> subNodesCount;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryIncidentSubNodesCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentSubNodesCountResponseBody self = new QueryIncidentSubNodesCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentSubNodesCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentSubNodesCountResponseBody setSubNodesCount(java.util.Map<String, Integer> subNodesCount) {
        this.subNodesCount = subNodesCount;
        return this;
    }
    public java.util.Map<String, Integer> getSubNodesCount() {
        return this.subNodesCount;
    }

    public QueryIncidentSubNodesCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
