// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosRequest extends TeaModel {
    /**
     * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static GetVideoInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosRequest self = new GetVideoInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoInfosRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
