// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The URL of the live comment mask data. Valid value: <strong>danmu</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>outputType</code> is set to <code>cdn</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>danmu</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The validity period of the playback URL. Unit: seconds.</p>
     * <ul>
     * <li><p>When OutputType is set to <strong>cdn</strong>:</p>
     * <ul>
     * <li>The playback URL expires periodically only if URL authentication is enabled. Otherwise, the URL remains permanently valid. For more information about how to enable and configure URL authentication, refer to <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a>.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
     * </ul>
     * </li>
     * <li><p>When OutputType is set to <strong>oss</strong>:</p>
     * <ul>
     * <li>The playback URL expires periodically only if the storage permission is set to private. Otherwise, the URL remains permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>604800</strong> (7 days) when the audio or video file is stored in a VOD bucket, and <strong>129600</strong> (36 hours) when the file is stored in a user-owned OSS bucket. If the maximum value does not meet your requirements, you can set OutputType to <strong>cdn</strong> and configure URL authentication to set a longer validity period.</li>
     * <li>Default value: If this parameter is not specified, the value is <strong>3600</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The codec.</p>
     * 
     * <strong>example:</strong>
     * <p>H264</p>
     */
    @NameInMap("CodecName")
    public String codecName;

    /**
     * <p>The definition of the video stream. Separate multiple definitions with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>FD</strong>: fluent.</li>
     * <li><strong>LD</strong>: low definition.</li>
     * <li><strong>SD</strong>: standard definition.</li>
     * <li><strong>HD</strong>: high definition.</li>
     * <li><strong>OD</strong>: original definition.</li>
     * <li><strong>2K</strong>: 2K.</li>
     * <li><strong>4K</strong>: 4K.</li>
     * <li><strong>SQ</strong>: standard audio quality.</li>
     * <li><strong>HQ</strong>: high audio quality.</li>
     * <li><strong>AUTO</strong>: adaptive bitrate.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>By default, streams of all definitions are retrieved.</li>
     * <li>When you generate a tracing watermark, this parameter is required and must be consistent with the definition configured for tracing watermark transcoding.</li>
     * <li>The AUTO definition is output only when transcoding packaging is configured in the transcoding template. For more information, refer to <a href="~~52839#title-4fk-cg8-gzx~~">PackageSetting: Transcoding packaging settings</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The type of the digital watermark. Valid values:</p>
     * <ul>
     * <li>TraceMark: tracing watermark.</li>
     * <li>CopyrightMark: copyright watermark.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TraceMark</p>
     */
    @NameInMap("DigitalWatermarkType")
    public String digitalWatermarkType;

    /**
     * <p>The format of the media stream. Separate multiple formats with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>mp4</strong></li>
     * <li><strong>m3u8</strong></li>
     * <li><strong>mp3</strong></li>
     * <li><strong>flv</strong></li>
     * <li><strong>mpd</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>By default, streams of all formats are retrieved.</li>
     * <li>The mpd format is output only when the <code>dash</code> container format is configured in the transcoding template. For more information, refer to <a href="~~52839#title-7rr-3hj-gy5~~">Container: Container format</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mp4,m3u8</p>
     */
    @NameInMap("Formats")
    public String formats;

    /**
     * <p>The type of the output URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: the back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): the accelerated URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom playback settings. The value is a JSON string. You can specify the domain name for playback. For more information about how to construct the parameter, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If PlayConfig is not specified or the <code>PlayDomain</code> field in PlayConfig is not specified, the operation uses the default domain name configured for VOD. If no default domain name is configured, the operation queries domain names in descending order of modification time and uses the most recently modified domain name as the playback domain name. To prevent an unexpected domain name from being returned, we recommend that you configure a default playback domain name. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> &gt; <strong>Manage</strong> &gt; <strong>Domain names that redirect back-to-origin traffic to this storage address</strong> to configure the default playback domain name.</li>
     * <li>When the <code>EncryptType</code> field in PlayConfig is set to <code>AliyunVoDEncryption</code>, the playback URL of the privately encrypted stream is not returned by default to ensure video security. To return the playback URL of the privately encrypted stream, you must also set the <code>ResultType</code> parameter to <code>Multiple</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PlayDomain&quot;:&quot;vod.test_domain&quot;,&quot;XForwardedFor&quot;:&quot;yqCD7Fp1uqChoVj/sl/p5Q==&quot;,&quot;PreviewTime&quot;:&quot;20&quot;,&quot;MtsHlsUriToken&quot;:&quot;yqCD7Fp1uqChoVjslp5Q&quot;}</p>
     */
    @NameInMap("PlayConfig")
    public String playConfig;

    /**
     * <p>The CDN reauthentication parameter, which is a JSON string. When Type A signing of URL authentication is enabled, you can use this parameter to set the <code>uid</code> and <code>rand</code> fields of the authenticated URL. For more information, refer to <a href="https://help.aliyun.com/document_detail/2249352.html">Type A signing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;uid&quot;:&quot;12345&quot;,&quot;rand&quot;:&quot;abckljd&quot;}</p>
     */
    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    /**
     * <p>The custom ID. The ID must be 6 to 64 characters in length and can contain only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_). The ID must be unique per user.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The type of the returned data. Valid values:</p>
     * <ul>
     * <li><strong>Single</strong> (default): returns only the latest transcoded stream for each definition and format.</li>
     * <li><strong>Multiple</strong>: returns all transcoded streams for each definition and format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The type of the media stream. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video.</li>
     * <li><strong>audio</strong>: audio.</li>
     * </ul>
     * <p>By default, streams of all types are retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The custom digital watermark information.</p>
     * <ul>
     * <li>When <code>DigitalWatermarkType</code> is set to <code>TraceMark</code>, you can use this parameter to set the tracing watermark information for the video and return the video stream that contains the watermark information. Only English letters, digits, and Chinese characters are supported. A maximum of 1,024 characters are supported.</li>
     * <li>When <code>DigitalWatermarkType</code> is set to <code>CopyrightMark</code>, <code>Trace</code> corresponds to the <strong>Watermark Text</strong> configured when the watermark template is created. You can use this parameter to query and return the video stream with the specified watermark text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test mark</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The audio or video ID. You can specify only one ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to upload an audio or video file, the ID is the value of the VideoId response parameter.</li>
     * <li>After an audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the ID. The ID is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f654b6e91d24d81d44****</p>
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

    public GetPlayInfoRequest setCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }
    public String getCodecName() {
        return this.codecName;
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

    public GetPlayInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
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
