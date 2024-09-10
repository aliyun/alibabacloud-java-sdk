// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailRequest extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2621307.html">DescribeCloudSiemEvents</a> operation to query the IDs of events.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>184892fc5245b3ce8c3316434c94261f</p>
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
