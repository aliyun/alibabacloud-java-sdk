// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDynamicImageRequest extends TeaModel {
    // The IDs of the animated stickers.
    // 
    // - Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.
    // - If you do not set this parameter, the system finds the video specified by the VideoId parameter and deletes the information about the animated stickers associated with the video. If more than 10 animated stickers are associated with the video specified by the VideoId parameter, the deletion request is denied.
    @NameInMap("DynamicImageIds")
    public String dynamicImageIds;

    // The ID of the video associated with the animated stickers whose information you want to delete.
    @NameInMap("VideoId")
    public String videoId;

    public static DeleteDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicImageRequest self = new DeleteDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicImageRequest setDynamicImageIds(String dynamicImageIds) {
        this.dynamicImageIds = dynamicImageIds;
        return this;
    }
    public String getDynamicImageIds() {
        return this.dynamicImageIds;
    }

    public DeleteDynamicImageRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
