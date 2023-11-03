// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The URL of the masked live comment data. Set the value to **danmu**.</p>
     * <br>
     * <p>> This parameter takes effect only when the outputType parameter is set to **cdn**.</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The validity period of the playback URL. Unit: seconds.</p>
     * <br>
     * <p>*   If you set OutputType to **cdn**:</p>
     * <br>
     * <p>    *   The playback URL has a validity period only if URL signing is enabled. Otherwise, the playback URL is permanently valid. For more information about how to enable and configure URL signing, see [URL signing](~~86090~~).</p>
     * <p>    *   Minimum value: **1**.</p>
     * <p>    *   Maximum value: unlimited.</p>
     * <p>    *   Default value: The default validity period that is specified in URL signing is used.</p>
     * <br>
     * <p>*   If you set OutputType to **oss**:</p>
     * <br>
     * <p>    *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.</p>
     * <p>    *   Minimum value: **1**.</p>
     * <p>    *   Maximum value: If the media file is stored in the VOD bucket, the maximum validity period is **2592000** (30 days). If the media file is stored in an OSS bucket, the maximum validity period is **129600** (36 hours). This limit is imposed to reduce security risks of the origin server. If you require a longer validity period, set OutputType to **cdn** and configure URL signing to specify a longer validity period.</p>
     * <p>    *   Default value: **3600**.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The quality of the video stream. Separate multiple qualities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **FD**: low definition</p>
     * <p>*   **LD**: standard definition</p>
     * <p>*   **SD**: high definition</p>
     * <p>*   **HD**: ultra-high definition</p>
     * <p>*   **OD**: original definition</p>
     * <p>*   **2K**: 2K</p>
     * <p>*   **4K**: 4K</p>
     * <p>*   **SQ**: standard sound quality</p>
     * <p>*   **HQ**: high sound quality</p>
     * <p>*   **AUTO**: adaptive bitrate</p>
     * <br>
     * <p>> By default, ApsaraVideo VOD returns video streams in all preceding qualities. However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the [PackageSetting parameter in the TranscodeTemplate](~~52839~~) table.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The type of the digital watermark. Valid values:</p>
     * <br>
     * <p>*   TraceMark: tracing watermark</p>
     * <p>*   CopyrightMark: copyright watermark</p>
     */
    @NameInMap("DigitalWatermarkType")
    public String digitalWatermarkType;

    /**
     * <p>The format of the media stream. Separate multiple formats with commas (,). Valid values:</p>
     * <br>
     * <p>*   **mp4**</p>
     * <p>*   **m3u8**</p>
     * <p>*   **mp3**</p>
     * <p>*   **mpd**</p>
     * <br>
     * <p>> By default, ApsaraVideo VOD returns video streams in all the preceding formats. However, video streams in the MPD format are returned only if the MPD container format is specified in the transcoding template. For more information, see the [Container parameter in the TranscodeTemplate](~~52839~~) table.</p>
     */
    @NameInMap("Formats")
    public String formats;

    /**
     * <p>The type of the output URL. Default value: oss. Valid values:</p>
     * <br>
     * <p>*   **oss**</p>
     * <p>*   **cdn**</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom playback configuration. The value is a JSON string. For more information, see [PlayConfig](~~86952~~).</p>
     * <br>
     * <p>>-   If you do not specify PlayConfig or `PlayDomain` in PlayConfig, the default domain name configured in ApsaraVideo VOD is used in this operation. If no default domain name is configured, the domain names are queried in reverse chronological order based on the time when the domain names were modified. The domain name that was last modified is used as the streaming domain name. To prevent domain name issues, we recommend that you specify the default streaming domain name. You can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Configuration Management** > **Media Management** > **Storage** > **Manage** > **Origin Domain Name** to set the default streaming domain name.</p>
     * <p>>-   If the `EncryptType` parameter in PlayConfig is set to `AliyunVoDEncryption`, the playback URL of the stream encrypted by using proprietary cryptography is not returned to ensure video security. If you want to return such URL, you must set the `ResultType` parameter to `Multiple`.</p>
     */
    @NameInMap("PlayConfig")
    public String playConfig;

    /**
     * <p>The CDN reauthentication configuration. The value is a JSON string. If CDN reauthentication is enabled, you can use this parameter to specify the UID and rand fields for URL authentication. For more information, see [URL authentication](~~57007~~).</p>
     */
    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    /**
     * <p>The type of the data to return. Default value: Single. Valid values:</p>
     * <br>
     * <p>*   **Single**: Only one latest transcoded stream is returned for each quality and format.</p>
     * <p>*   **Multiple**: All transcoded streams are returned for each quality and format.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The type of the media stream. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **video**</p>
     * <p>*   **audio**</p>
     * <br>
     * <p>By default, video and audio streams are returned.</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The custom digital watermark.</p>
     * <br>
     * <p>*   If you set `DigitalWatermarkType` to `TraceMark`, specify this parameter to configure the video tracing watermark and return the video stream that contains the watermark. The value can be up to 1,024 characters in length and can contain letters and digits.</p>
     * <p>*   If you set `DigitalWatermarkType` to `CopyrightMark`, specify the **watermark text** that you created for the watermark template for this parameter.`` You can specify this parameter to query and return the video stream that contains the specified watermark text.</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the media ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [CreateUploadVideo](~~55407~~) operation.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoRequest self = new GetPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

    public GetPlayInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetPlayInfoRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetPlayInfoRequest setDigitalWatermarkType(String digitalWatermarkType) {
        this.digitalWatermarkType = digitalWatermarkType;
        return this;
    }
    public String getDigitalWatermarkType() {
        return this.digitalWatermarkType;
    }

    public GetPlayInfoRequest setFormats(String formats) {
        this.formats = formats;
        return this;
    }
    public String getFormats() {
        return this.formats;
    }

    public GetPlayInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetPlayInfoRequest setPlayConfig(String playConfig) {
        this.playConfig = playConfig;
        return this;
    }
    public String getPlayConfig() {
        return this.playConfig;
    }

    public GetPlayInfoRequest setReAuthInfo(String reAuthInfo) {
        this.reAuthInfo = reAuthInfo;
        return this;
    }
    public String getReAuthInfo() {
        return this.reAuthInfo;
    }

    public GetPlayInfoRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public GetPlayInfoRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public GetPlayInfoRequest setTrace(String trace) {
        this.trace = trace;
        return this;
    }
    public String getTrace() {
        return this.trace;
    }

    public GetPlayInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
