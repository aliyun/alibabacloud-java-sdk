// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CanceledJobs")
    public java.util.List<String> canceledJobs;

    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    public static CancelUrlUploadJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelUrlUploadJobsResponseBody self = new CancelUrlUploadJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelUrlUploadJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelUrlUploadJobsResponseBody setCanceledJobs(java.util.List<String> canceledJobs) {
        this.canceledJobs = canceledJobs;
        return this;
    }
    public java.util.List<String> getCanceledJobs() {
        return this.canceledJobs;
    }

    public CancelUrlUploadJobsResponseBody setNonExists(java.util.List<String> nonExists) {
        this.nonExists = nonExists;
        return this;
    }
    public java.util.List<String> getNonExists() {
        return this.nonExists;
    }

}
