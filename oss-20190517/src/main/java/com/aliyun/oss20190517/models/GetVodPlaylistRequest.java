// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetVodPlaylistRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    public static GetVodPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodPlaylistRequest self = new GetVodPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public GetVodPlaylistRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVodPlaylistRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
