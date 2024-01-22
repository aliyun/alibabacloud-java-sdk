// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingJudgeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The request result.</p>
     */
    @NameInMap("TracingJudge")
    public java.util.Map<String, Integer> tracingJudge;

    public static QueryIncidentTracingJudgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingJudgeResponseBody self = new QueryIncidentTracingJudgeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingJudgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentTracingJudgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncidentTracingJudgeResponseBody setTracingJudge(java.util.Map<String, Integer> tracingJudge) {
        this.tracingJudge = tracingJudge;
        return this;
    }
    public java.util.Map<String, Integer> getTracingJudge() {
        return this.tracingJudge;
    }

}
