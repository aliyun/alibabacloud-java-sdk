// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>The snapshot interval. The value must be **greater than or equal to 0**. Unit: seconds. If you set this parameter to **0**, snapshots are taken at even intervals based on the video duration divided by the value of the Count parameter. Default value: **1**.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The ID of the snapshot job.</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The custom configurations, including the configuration of transparent data transmission and callback configurations. The value is a JSON-formatted string. For more information, see [UserData](~~86952~~).</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Note** The callback configurations take effect only when you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video mezzanine file is used. Unit: pixel.</p>
     */
    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    /**
     * <p>The operation that you want to perform. Set the value to **SubmitSnapshotJob**.</p>
     */
    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    /**
     * <p>The maximum number of snapshots. Default value: **1**.</p>
     */
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
