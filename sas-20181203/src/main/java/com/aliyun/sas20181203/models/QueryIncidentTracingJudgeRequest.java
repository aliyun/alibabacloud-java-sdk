// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingJudgeRequest extends TeaModel {
    /**
     * <p>The ID of the event that you want to query.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudSiemEvents](https://help.aliyun.com/document_detail/2621307.html) operation to query the event ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
