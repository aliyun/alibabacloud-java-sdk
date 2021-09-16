// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    @NameInMap("Width")
    public String width;

    @NameInMap("Height")
    public String height;

    @NameInMap("Count")
    public Long count;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitSnapshotJobRequest setSpecifiedOffsetTime(Long specifiedOffsetTime) {
        this.specifiedOffsetTime = specifiedOffsetTime;
        return this;
    }
    public Long getSpecifiedOffsetTime() {
        return this.specifiedOffsetTime;
    }

    public SubmitSnapshotJobRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public SubmitSnapshotJobRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public SubmitSnapshotJobRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public SubmitSnapshotJobRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public SubmitSnapshotJobRequest setSpriteSnapshotConfig(String spriteSnapshotConfig) {
        this.spriteSnapshotConfig = spriteSnapshotConfig;
        return this;
    }
    public String getSpriteSnapshotConfig() {
        return this.spriteSnapshotConfig;
    }

    public SubmitSnapshotJobRequest setSnapshotTemplateId(String snapshotTemplateId) {
        this.snapshotTemplateId = snapshotTemplateId;
        return this;
    }
    public String getSnapshotTemplateId() {
        return this.snapshotTemplateId;
    }

    public SubmitSnapshotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
