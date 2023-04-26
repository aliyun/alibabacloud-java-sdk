// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamRequest extends TeaModel {
    /**
     * <p>Deletes one or more video or audio streams and their storage files at a time.</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("VideoId")
    public String videoId;

    public static DeleteStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamRequest self = new DeleteStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public DeleteStreamRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
