// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>Obtains the URL of the China-accessible bullet screen mask data. Valid values: <strong>danmu</strong>.</p>
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
     * <li><p>If OutputType is set to <strong>cdn</strong>:</p>
     * <ul>
     * <li>The playback URL expires periodically only when URL authentication is enabled. Otherwise, the URL is permanently valid. For information about how to enable and configure URL authentication, refer to <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a>.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If this parameter is not specified, the default validity period configured in URL authentication is used.</li>
     * </ul>
     * </li>
     * <li><p>If OutputType is set to <strong>oss</strong>:</p>
     * <ul>
     * <li>The playback URL expires periodically only when the storage permission is private. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: To reduce security risks to the origin server, when audio or video files are stored in an ApsaraVideo VOD system bucket, the maximum value is <strong>604800</strong> (7 days). When audio or video files are stored in your own OSS bucket, the maximum value is <strong>129600</strong> (36 hours). If the maximum value does not meet your requirements, set OutputType to <strong>cdn</strong> and configure URL authentication to set a longer validity period.</li>
     * <li>Default value: If this parameter is not specified, the default value is <strong>3600</strong>.</li>
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
     * <strong>example:</strong>
     * <p>H264</p>
     */
    @NameInMap("CodecName")
    public String codecName;

    /**
     * <p>The definition of the video stream. Separate multiple definitions with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>FD</strong>: low definition.</li>
     * <li><strong>LD</strong>: standard definition.</li>
     * <li><strong>SD</strong>: high definition.</li>
     * <li><strong>HD</strong>: ultra-high definition.</li>
     * <li><strong>OD</strong>: original definition.</li>
     * <li><strong>2K</strong>: 2K.</li>
     * <li><strong>4K</strong>: 4K.</li>
     * <li><strong>SQ</strong>: standard sound quality.</li>
     * <li><strong>HQ</strong>: high sound quality.</li>
     * <li><strong>AUTO</strong>: adaptive bitrate streaming.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>By default, streams of all definitions are returned.</li>
     * <li>When generating tracing watermarks, this parameter is required and must be consistent with the definition configured during tracing watermark transcoding.</li>
     * <li>The AUTO definition is returned only when transcoding packaging is configured in the transcoding template. For more information, refer to <a href="~~52839#title-4fk-cg8-gzx~~">PackageSetting: transcoding packaging settings</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The digital watermarking type. Valid values:</p>
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
     * <p>The media stream format. Separate multiple formats with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>mp4</strong></li>
     * <li><strong>m3u8</strong></li>
     * <li><strong>mp3</strong></li>
     * <li><strong>flv</strong></li>
     * <li><strong>mpd</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>By default, streams in all formats are returned.</li>
     * <li>The mpd format is returned only when the <code>dash</code> container format is configured in the transcoding template. For more information, refer to <a href="~~52839#title-7rr-3hj-gy5~~">Container: container format</a>.</li>
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
     * <li><strong>oss</strong>: back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): accelerated URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom playback settings. The value is a JSON string that supports specifying domain name playback settings. For details about parameter construction, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If PlayConfig is not set or <code>PlayDomain</code> within it is not set, the operation uses the default domain name configured in ApsaraVideo VOD. If no default domain name is configured, the most recently modified domain name is used as the playback domain name based on reverse chronological order of modification time. To prevent an unexpected domain name from being returned, set a default playback domain name. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong> &gt; <strong>Manage</strong> &gt; <strong>Domain names that perform origin fetch from this storage address</strong> to set the default playback domain name.</li>
     * <li>When the <code>EncryptType</code> parameter in PlayConfig is set to <code>AliyunVoDEncryption</code>, the playback URL of the privately encrypted stream is not returned by default to ensure video security. To return the playback URL of the privately encrypted stream, set the <code>ResultType</code> parameter to <code>Multiple</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PlayDomain&quot;:&quot;vod.test_domain&quot;,&quot;XForwardedFor&quot;:&quot;yqCD7Fp1uqChoVj/sl/p5Q==&quot;,&quot;PreviewTime&quot;:&quot;20&quot;,&quot;MtsHlsUriToken&quot;:&quot;yqCD7Fp1uqChoVjslp5Q&quot;}</p>
     */
    @NameInMap("PlayConfig")
    public String playConfig;

    /**
     * <p>The CDN reauthentication parameter. The value is a JSON string. When type A signing is enabled for URL authentication, you can use this parameter to set the <code>uid</code> and <code>rand</code> of the authentication URL. For more information, refer to <a href="https://help.aliyun.com/document_detail/2249352.html">Type A signing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;uid&quot;:&quot;12345&quot;,&quot;rand&quot;:&quot;abckljd&quot;}</p>
     */
    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. The length is 6 to 64 characters. The ID is unique per user.</p>
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
     * <p>The media stream type. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video.</li>
     * <li><strong>audio</strong>: audio.</li>
     * </ul>
     * <p>By default, streams of all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The custom digital watermarking settings.</p>
     * <ul>
     * <li>When <code>DigitalWatermarkType</code> is set to <code>TraceMark</code>, pass in this parameter to set the tracing watermark information for the video and return the video stream that contains the watermark information. Only English letters, digits, and Chinese characters are supported. A maximum of 1024 characters are supported.</li>
     * <li>When <code>DigitalWatermarkType</code> is set to <code>CopyrightMark</code>, <code>Trace</code> corresponds to the <strong>watermark text</strong> configured when the watermark template was created. Pass in this parameter to query and return the video stream with the specified watermark text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test mark</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The audio or video ID. Only a single audio or video ID is supported. You can obtain the ID by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When uploading audio or video files by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
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
