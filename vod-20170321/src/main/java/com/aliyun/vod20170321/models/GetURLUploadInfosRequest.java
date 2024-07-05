// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    /**
     * <p>The one or more IDs of upload jobs. You can obtain the job IDs in the response parameter JobId of the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
     * <ul>
     * <li>You can specify a maximum of 10 IDs.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86c1925fba0****,7afb201e7fa****,2cc4997378****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The one or more upload URLs of the source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.</p>
     * <blockquote>
     * <ul>
     * <li>You must encode the URLs before you use the URLs.</li>
     * <li>If a media file is uploaded multiple times, pass the URL of the media file to this parameter only once.</li>
     * <li>You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</li>
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
