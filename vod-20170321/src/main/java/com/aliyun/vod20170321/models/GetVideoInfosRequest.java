// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosRequest extends TeaModel {
    @NameInMap("VideoIds")
    public String videoIds;

    @NameInMap("AdditionType")
    public String additionType;

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

    public GetVideoInfosRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

}
