// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryRequest extends TeaModel {
    @NameInMap("VideoIds")
    public String videoIds;

    public static GetTranscodeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryRequest self = new GetTranscodeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeSummaryRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
