// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsRequest extends TeaModel {
    /**
     * <p>The IDs of the upload jobs. You can obtain the job IDs from PlayInfo in the response to the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation.</p>
     * <ul>
     * <li>You can specify a maximum of 10 IDs.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p> You must specify either JobIds or UploadUrls. If you specify both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>341c92e6c18dc435ee31253685****,0193d395194a83ad6ee2ef27a5b5****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The upload URLs of source video files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.</p>
     * <blockquote>
     * <ul>
     * <li>You must encode the URLs before you use the URLs.</li>
     * <li>You must specify either JobIds or UploadUrls. If you specify both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.</li>
     * </ul>
     * </blockquote>
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
