// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateStreamInfoRequest extends TeaModel {
    // 视频流ID
    @NameInMap("JobId")
    public String jobId;

    // 视频ID
    @NameInMap("MediaId")
    public String mediaId;

    public static UpdateStreamInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamInfoRequest self = new UpdateStreamInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStreamInfoRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateStreamInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
