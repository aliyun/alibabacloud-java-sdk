// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionJobRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    public static ListDetectionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionJobRequest self = new ListDetectionJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectionJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
