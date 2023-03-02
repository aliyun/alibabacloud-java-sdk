// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    /**
     * <p>The one or more IDs of upload jobs. You can obtain the job IDs in the response parameter JobId of the [UploadMediaByURL](~~86311~~) operation.</p>
     * <br>
     * <p>- You can specify a maximum of 10 IDs.</p>
     * <p>- Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The one or more upload URLs of the source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.</p>
     * <br>
     * <p>> * You must encode the URLs before you use the URLs.</p>
     * <p>> * If a media file is uploaded multiple times, pass the URL of the media file to this parameter only once.</p>
     * <p>> * You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</p>
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
