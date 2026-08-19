// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of snapshots. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The snapshot height. Valid values: <code>[8,4096]</code>. Default value: the source video height. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The snapshot interval. The value must be <strong>greater than or equal to 0</strong>.</p>
     * <ul>
     * <li>Unit: seconds.</li>
     * <li>Default value: <strong>1</strong>.</li>
     * <li>If Interval is set to <strong>0</strong>, snapshots are evenly captured based on the value of Count and the video duration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. Length: 6 to 64 characters. The value must be unique at the user level.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The snapshot template ID.</p>
     * <ul>
     * <li>We recommend that you create a snapshot template first and then pass the snapshot template ID. For more information about how to create a snapshot template, see <a href="https://help.aliyun.com/document_detail/99406.html">Add a snapshot template</a>.</li>
     * <li>If you pass the snapshot template ID, all request parameters except Action and VideoId are ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f5b228fe693bf55bd87b789****</p>
     */
    @NameInMap("SnapshotTemplateId")
    public String snapshotTemplateId;

    /**
     * <p>The start time for the snapshot.</p>
     * <ul>
     * <li>Unit: milliseconds.</li>
     * <li>Default value: <strong>0</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpecifiedOffsetTime")
    public Long specifiedOffsetTime;

    /**
     * <p>The points in time at which snapshots are captured. Unit: milliseconds. You can specify up to 30 points in time at a time.</p>
     */
    @NameInMap("SpecifiedOffsetTimes")
    public String specifiedOffsetTimesShrink;

    /**
     * <p>The sprite configuration. If this parameter is not empty, a sprite is generated. For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/86952.html">SpriteSnapshotConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;CellWidth\&quot;: 120, \&quot;CellHeight\&quot;: 68, \&quot;Columns\&quot;: 3,\&quot;Lines\&quot;: 10, \&quot;Padding\&quot;: 20, \&quot;Margin\&quot;: 50}</p>
     */
    @NameInMap("SpriteSnapshotConfig")
    public String spriteSnapshotConfig;

    /**
     * <p>The custom settings. Only JSON strings are supported. You can use this parameter to pass through custom data and specify callback URL settings. For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <p>To use the message callback in this parameter, configure the HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;http://.example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;example&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
     * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d3e680e618708efbf2cae7cc9312****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    /**
     * <p>The snapshot width. Valid values: <code>[8,4096]</code>. Default value: the source video width. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
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

    public SubmitSnapshotJobShrinkRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
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
