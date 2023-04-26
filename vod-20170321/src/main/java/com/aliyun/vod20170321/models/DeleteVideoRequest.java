// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DeleteVideo**.</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static DeleteVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoRequest self = new DeleteVideoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
