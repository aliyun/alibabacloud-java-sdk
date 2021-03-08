// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("ResultTypes")
    public String resultTypes;

    @NameInMap("AdditionType")
    public String additionType;

    public static GetVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoRequest self = new GetVideoInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public GetVideoInfoRequest setResultTypes(String resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public String getResultTypes() {
        return this.resultTypes;
    }

    public GetVideoInfoRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

}
