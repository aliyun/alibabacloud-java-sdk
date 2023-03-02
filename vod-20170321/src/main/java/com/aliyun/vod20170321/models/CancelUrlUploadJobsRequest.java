// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsRequest extends TeaModel {
    /**
     * <p>The IDs of the upload jobs. You can obtain the job IDs in the response parameter PlayInfo of the [GetPlayInfo](~~56124~~) operation.</p>
     * <p>*   You can specify a maximum of 10 IDs.</p>
     * <p>*   Separate multiple IDs with commas (,).</p>
     * <p>> You must set one of the JobIds and the UploadUrls parameters. If you set both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The upload URLs of source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.</p>
     * <p>> *   You must encode the URLs before you use the URLs.</p>
     * <p>> *   You must set one of the JobIds and the UploadUrls parameters. If you set both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.</p>
     */
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
