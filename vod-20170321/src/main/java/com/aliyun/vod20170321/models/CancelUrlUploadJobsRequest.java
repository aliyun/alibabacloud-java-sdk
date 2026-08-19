// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsRequest extends TeaModel {
    /**
     * <p>The list of task IDs. You can obtain the task ID (JobId) from the PlayInfo struct returned by the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation.</p>
     * <ul>
     * <li>A maximum of 10 IDs are supported.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>You must specify either JobIds or UploadUrls. If both are specified, only JobIds is processed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>341c92e6c18dc435ee31253685****,0193d395194a83ad6ee2ef27a5b5****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The list of source video upload URLs. Separate multiple URLs with commas (,). A maximum of 10 URLs are supported.</p>
     * <blockquote>
     * <ul>
     * <li>URL-encode the URLs before use.</li>
     * <li>You must specify either JobIds or UploadUrls. If both are specified, only JobIds is processed.</li>
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
