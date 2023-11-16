// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailRequest extends TeaModel {
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
