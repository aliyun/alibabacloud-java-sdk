// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PostVodPlaylistRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    public static PostVodPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        PostVodPlaylistRequest self = new PostVodPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public PostVodPlaylistRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PostVodPlaylistRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
