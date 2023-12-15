// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of snapshots. Default value: **1**.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video mezzanine file is used. Unit: pixel.</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The snapshot interval. The value must be **greater than or equal to 0**. Unit: seconds. If you set this parameter to **0**, snapshots are taken at even intervals based on the video duration divided by the value of the Count parameter. Default value: **1**.</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The ID of the snapshot template.</p>
     * <br>
     * <p>*   We recommend that you create a snapshot template before you specify the ID of the snapshot template.</p>
     * <p>*   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.</p>
     * <p>*   For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).</p>
     */
    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    /**
     * <p>The start time of the specified snapshot time period.</p>
     * <br>
     * <p>*   Unit: milliseconds.</p>
     * <p>*   Default value: **0**.</p>
     */
    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    @NameInMap("SpecifiedOffsetTimes")
    public String specifiedOffsetTimesShrink;

    /**
     * <p>The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).</p>
     */
    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    /**
     * <p>The custom configurations, including the configuration of transparent data transmission and callback configurations. The value is a JSON-formatted string. For more information, see [UserData](~~86952~~).</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Note** The callback configurations take effect only when you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    /**
     * <p>The width of each snapshot. Valid values: `[8,4096]`. By default, the width of the video mezzanine file is used. Unit: pixel.</p>
     */
    @NameInMap("Width")
    public String width;

    public static SubmitSnapshotJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobShrinkRequest self = new SubmitSnapshotJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobShrinkRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public SubmitSnapshotJobShrinkRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public SubmitSnapshotJobShrinkRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public SubmitSnapshotJobShrinkRequest setSnapshotTemplateId(String snapshotTemplateId) {
        this.snapshotTemplateId = snapshotTemplateId;
        return this;
    }
    public String getSnapshotTemplateId() {
        return this.snapshotTemplateId;
    }

    public SubmitSnapshotJobShrinkRequest setSpecifiedOffsetTime(Long specifiedOffsetTime) {
        this.specifiedOffsetTime = specifiedOffsetTime;
        return this;
    }
    public Long getSpecifiedOffsetTime() {
        return this.specifiedOffsetTime;
    }

    public SubmitSnapshotJobShrinkRequest setSpecifiedOffsetTimesShrink(String specifiedOffsetTimesShrink) {
        this.specifiedOffsetTimesShrink = specifiedOffsetTimesShrink;
        return this;
    }
    public String getSpecifiedOffsetTimesShrink() {
        return this.specifiedOffsetTimesShrink;
    }

    public SubmitSnapshotJobShrinkRequest setSpriteSnapshotConfig(String spriteSnapshotConfig) {
        this.spriteSnapshotConfig = spriteSnapshotConfig;
        return this;
    }
    public String getSpriteSnapshotConfig() {
        return this.spriteSnapshotConfig;
    }

    public SubmitSnapshotJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitSnapshotJobShrinkRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SubmitSnapshotJobShrinkRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
