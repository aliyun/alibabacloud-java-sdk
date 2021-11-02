// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDynamicImageRequest extends TeaModel {
    @NameInMap("DynamicImageIds")
    public String dynamicImageIds;

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
