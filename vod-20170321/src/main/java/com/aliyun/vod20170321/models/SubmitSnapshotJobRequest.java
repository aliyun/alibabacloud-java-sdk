// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    // The maximum number of snapshots. Default value: **1**.
    @NameInMap("Count")
    public Long count;

    // The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video mezzanine file is used. Unit: pixel.
    @NameInMap("Height")
    public String height;

    // The snapshot interval. The value must be **greater than or equal to 0**. Unit: seconds. If you set this parameter to **0**, snapshots are taken at even intervals based on the video duration divided by the value of the Count parameter. Default value: **1**.
    @NameInMap("Interval")
    public Long interval;

    // The ID of the snapshot template.
    // 
    // *   We recommend that you create a snapshot template before you specify the ID of the snapshot template.
    // *   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.
    // *   For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).
    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    // The start time of the specified snapshot time period.
    // 
    // *   Unit: milliseconds.
    // *   Default value: **0**.
    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    // The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).
    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    // The custom configurations, including the configuration of transparent data transmission and callback configurations. The value is a JSON-formatted string. For more information, see [UserData](~~86952~~).
    // 
    // **
    // 
    // **Note** The callback configurations take effect only when you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.
    @NameInMap("UserData")
    public String userData;

    // The ID of the video.
    @NameInMap("VideoId")
    public String videoId;

    // The width of each snapshot. Valid values: `[8,4096]`. By default, the width of the video mezzanine file is used. Unit: pixel.
    @NameInMap("Width")
    public String width;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public SubmitSnapshotJobRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public SubmitSnapshotJobRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public SubmitSnapshotJobRequest setSnapshotTemplateId(String snapshotTemplateId) {
        this.snapshotTemplateId = snapshotTemplateId;
        return this;
    }
    public String getSnapshotTemplateId() {
        return this.snapshotTemplateId;
    }

    public SubmitSnapshotJobRequest setSpecifiedOffsetTime(Long specifiedOffsetTime) {
        this.specifiedOffsetTime = specifiedOffsetTime;
        return this;
    }
    public Long getSpecifiedOffsetTime() {
        return this.specifiedOffsetTime;
    }

    public SubmitSnapshotJobRequest setSpriteSnapshotConfig(String spriteSnapshotConfig) {
        this.spriteSnapshotConfig = spriteSnapshotConfig;
        return this;
    }
    public String getSpriteSnapshotConfig() {
        return this.spriteSnapshotConfig;
    }

    public SubmitSnapshotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitSnapshotJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitSnapshotJobRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
