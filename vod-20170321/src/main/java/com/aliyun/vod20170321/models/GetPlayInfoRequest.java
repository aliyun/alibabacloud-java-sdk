// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The ID of the media transcoding job. This ID uniquely identifies a media stream.</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The frame rate of the media stream. Unit: frames per second.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The type of Narrowband HD transcoding. Valid values:</p>
     * <br>
     * <p>*   **0**: regular</p>
     * <p>*   **1.0**: Narrowband HD 1.0</p>
     * <p>*   **2.0**: Narrowband HD 2.0</p>
     * <br>
     * <p>This parameter is returned only when a quality that is available in the built-in Narrowband HD 1.0 transcoding template is specified. For more information, see the [Definition parameter in the TranscodeTemplate](~~52839~~) table.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The update time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("Formats")
    public String formats;

    /**
     * <p>The URL of the masked live comment data. Set the value to **danmu**.</p>
     * <br>
     * <p>> This parameter takes effect only when the outputType parameter is set to **cdn**.</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The quality of the video stream. Valid values:</p>
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
     */
    @NameInMap("PlayConfig")
    public String playConfig;

    /**
     * <p>The playback URL of the video stream.</p>
     */
    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    /**
     * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>Details of the audio or video file.</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The basic information about the audio or video file.</p>
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

    public GetPlayInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
