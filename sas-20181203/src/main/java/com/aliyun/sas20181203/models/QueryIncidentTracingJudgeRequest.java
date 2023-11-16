// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingJudgeRequest extends TeaModel {
    /**
     * <p>The event ID.</p>
     */
    @NameInMap("IncidentId")
    public String incidentId;

    public static QueryIncidentTracingJudgeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingJudgeRequest self = new QueryIncidentTracingJudgeRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingJudgeRequest setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

}
