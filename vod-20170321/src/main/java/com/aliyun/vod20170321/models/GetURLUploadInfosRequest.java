// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    /**
     * <p>The list of upload task IDs (JobId). The list consists of one or more JobId values. A JobId is the value of the JobId parameter returned when you call the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
     * <ul>
     * <li>A maximum of 10 IDs are supported.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>You must specify either JobIds or UploadURLs. If both are specified, only JobIds is processed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86c1925fba0****,7afb201e7fa****,2cc4997378****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The list of source video file URLs. Separate multiple URLs with commas (,). A maximum of 10 URLs are supported.</p>
     * <blockquote>
     * <ul>
     * <li>URL-encode the URLs before use.</li>
     * <li>If the same URL video is uploaded multiple times, pass in a single URL for the query.</li>
     * <li>You must specify either JobIds or UploadURLs. If both are specified, only JobIds is processed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http://****.mp4</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    public static GetURLUploadInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetURLUploadInfosRequest self = new GetURLUploadInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetURLUploadInfosRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public GetURLUploadInfosRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

}
