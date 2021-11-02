// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("VideoId")
    public String videoId;

    public static DescribePlayVideoStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisRequest self = new DescribePlayVideoStatisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayVideoStatisRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePlayVideoStatisRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePlayVideoStatisRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePlayVideoStatisRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
