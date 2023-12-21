// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailRequest extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudSiemEvents](~~DescribeCloudSiemEvents~~) operation to query the IDs of events.</p>
     */
    @NameInMap("IncidentId")
    public String incidentId;

    public static QueryIncidentTracingDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingDetailRequest self = new QueryIncidentTracingDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingDetailRequest setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

}
