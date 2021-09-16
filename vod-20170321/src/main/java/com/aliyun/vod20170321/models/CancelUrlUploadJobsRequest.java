// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("UploadUrls")
    public String uploadUrls;

    public static CancelUrlUploadJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUrlUploadJobsRequest self = new CancelUrlUploadJobsRequest();
        return TeaModel.build(map, self);
    }

    public CancelUrlUploadJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public CancelUrlUploadJobsRequest setUploadUrls(String uploadUrls) {
        this.uploadUrls = uploadUrls;
        return this;
    }
    public String getUploadUrls() {
        return this.uploadUrls;
    }

}
