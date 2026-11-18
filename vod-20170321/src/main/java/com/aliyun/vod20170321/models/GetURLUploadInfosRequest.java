// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    /**
     * <p>The list of upload task IDs (JobIds). It consists of one or more JobIds. A JobId is the value of the JobId response parameter returned when you call the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
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
     * <p>The list of URLs of the video source files to upload. Separate multiple URLs with commas (,). A maximum of 10 URLs are supported.</p>
     * <blockquote>
     * <ul>
     * <li>URL-encode the URLs before you use them.</li>
     * <li>If the same video URL is uploaded multiple times, specify a single URL for the query.</li>
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
