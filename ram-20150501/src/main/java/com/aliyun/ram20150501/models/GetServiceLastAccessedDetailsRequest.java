// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetServiceLastAccessedDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ba536aab-84c6-43af-8bcb-aa2cae2a34eb</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>CgxMaXN0UmFtVXNlcnMSEDExNzkxNDgwMzgyMTQyNTUaATIgZA==</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    public static GetServiceLastAccessedDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLastAccessedDetailsRequest self = new GetServiceLastAccessedDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLastAccessedDetailsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetServiceLastAccessedDetailsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetServiceLastAccessedDetailsRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
