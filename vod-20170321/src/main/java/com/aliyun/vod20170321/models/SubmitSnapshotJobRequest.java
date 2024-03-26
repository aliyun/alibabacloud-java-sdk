// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>The maximum number of snapshots. Default value: **1**.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video source is used. Unit: pixels.</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The snapshot interval. The value must be **greater than or equal to 0**.</p>
     * <br>
     * <p>*   Unit: seconds.</p>
     * <p>*   Default value: **1**.</p>
     * <p>*   If you set this parameter to **0**, snapshots are captured at even intervals based on the video duration divided by the value of the Count parameter.</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The ID of the snapshot template.</p>
     * <br>
     * <p>*   We recommend that you create a snapshot template before you specify the template ID. For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).</p>
     * <p>*   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.</p>
     */
    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    /**
     * <p>The point in time when the first snapshot is captured.</p>
     * <br>
     * <p>*   Unit: milliseconds.</p>
     * <p>*   Default value: **0**.</p>
     */
    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    /**
     * <p>The playback positions at which you want to capture snapshots. Unit: milliseconds. You can specify up to 30 playback positions in a request.</p>
     */
    @NameInMap("SpecifiedOffsetTimes")
    public java.util.List<Long> specifiedOffsetTimes;

    /**
     * <p>The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).</p>
     */
    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    /**
     * <p>The custom configurations including the configuration of transparent data transmission and callback configurations. The value must be a JSON string. For more information, see [UserData](~~86952~~).</p>
     * <br>
     * <p>>  To use the message callback feature, you must specify an HTTP callback URL and the callback events in the ApsaraVideo VOD console. Otherwise, the callback settings do not take effect.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   After you upload a video in the ApsaraVideo VOD console, you can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Media Files** > **Audio/Video** to view the ID of the video.</p>
     * <p>*   Obtain the video ID from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain the upload URL and credential.</p>
     * <p>*   Obtain the video ID from the response to the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    /**
     * <p>The width of each snapshot. Valid values: `[8,4096]`. By default, the width of the video source is used. Unit: pixels.</p>
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

    public SubmitSnapshotJobRequest setSpecifiedOffsetTimes(java.util.List<Long> specifiedOffsetTimes) {
        this.specifiedOffsetTimes = specifiedOffsetTimes;
        return this;
    }
    public java.util.List<Long> getSpecifiedOffsetTimes() {
        return this.specifiedOffsetTimes;
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
