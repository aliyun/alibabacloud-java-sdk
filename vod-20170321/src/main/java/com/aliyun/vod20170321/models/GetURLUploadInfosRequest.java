// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIds;

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
