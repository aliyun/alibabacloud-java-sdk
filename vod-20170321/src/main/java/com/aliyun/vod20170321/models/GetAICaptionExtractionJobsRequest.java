// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAICaptionExtractionJobsRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIds;

    public static GetAICaptionExtractionJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICaptionExtractionJobsRequest self = new GetAICaptionExtractionJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetAICaptionExtractionJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
