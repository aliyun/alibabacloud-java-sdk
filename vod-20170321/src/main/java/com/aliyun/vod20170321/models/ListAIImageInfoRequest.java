// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    public static ListAIImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIImageInfoRequest self = new ListAIImageInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAIImageInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
