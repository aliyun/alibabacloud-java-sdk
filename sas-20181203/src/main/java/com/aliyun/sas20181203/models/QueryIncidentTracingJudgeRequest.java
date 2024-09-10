// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingJudgeRequest extends TeaModel {
    /**
     * <p>The ID of the event that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2621307.html">DescribeCloudSiemEvents</a> operation to query the event ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d1d7a612-0dc2-413a-aa8e-9c7c88d8d12a</p>
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
