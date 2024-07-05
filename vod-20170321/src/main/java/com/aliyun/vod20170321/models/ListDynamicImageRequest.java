// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDynamicImageRequest extends TeaModel {
    /**
     * <p>The ID of the video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e114f1100590c3193918fd449a****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static ListDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageRequest self = new ListDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
