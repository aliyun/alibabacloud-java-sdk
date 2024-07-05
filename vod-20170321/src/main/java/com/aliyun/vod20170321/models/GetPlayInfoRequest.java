// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    /**
     * <p>The URL of the masked live comment data. Value: <strong>danmu</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <code>outputType</code> parameter is set to <code>cdn</code>.</p>
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
     * <li><p>If you set OutputType to <strong>cdn</strong>:</p>
     * <ul>
     * <li>The playback URL has a validity period only if URL signing is enabled. Otherwise, the playback URL is permanently valid. For more information about how to enable and configure URL signing, see <a href="https://help.aliyun.com/document_detail/86090.html">URL signing</a>.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: The default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li><p>If you set OutputType to <strong>oss</strong>:</p>
     * <ul>
     * <li>This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: If the media file is stored in the VOD bucket, the maximum validity period is <strong>2592000</strong> (30 days). If the media file is stored in an OSS bucket, the maximum validity period is <strong>129600</strong> (36 hours). This limit is imposed to reduce security risks of the origin server. If you require a longer validity period, set OutputType to <strong>cdn</strong> and configure URL signing to specify a longer validity period.</li>
     * <li>Default value: <strong>3600</strong>.</li>
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
     * <p>The quality of the video stream. Separate multiple qualities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>FD</strong>: low definition</li>
     * <li><strong>LD</strong>: standard definition</li>
     * <li><strong>SD</strong>: high definition</li>
     * <li><strong>HD</strong>: ultra-high definition</li>
     * <li><strong>OD</strong>: original definition</li>
     * <li><strong>2K</strong></li>
     * <li><strong>4K</strong></li>
     * <li><strong>SQ</strong>: standard sound quality</li>
     * <li><strong>HQ</strong>: high sound quality</li>
     * <li><strong>AUTO</strong>: adaptive bitrate</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>By default, ApsaraVideo VOD returns video streams in all the preceding qualities.</li>
     * <li>However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the <a href="~~52839#title-4fk-cg8-gzx~~">PackageSetting parameter in the TranscodeTemplate table</a>.</li>
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
     * <li>TraceMark: tracing watermark</li>
     * <li>CopyrightMark: copyright watermark</li>
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
     * <li>By default, ApsaraVideo VOD returns video streams in all the preceding formats.</li>
     * <li>However, video streams in the MPD format are returned only if the <code>dash</code> container format is specified in the transcoding template. For more information, see the <a href="~~52839#title-7rr-3hj-gy5~~">Container parameter in the TranscodeTemplate table</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mp4,m3u8</p>
     */
    @NameInMap("Formats")
    public String formats;

    /**
     * <p>The type of the output URL. Default value: oss. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong></li>
     * <li><strong>cdn</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom playback configuration. The value must be a JSON string. You can specify a domain name for playback. For more information, see <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the PlayConfig parameter or the <code>PlayDomain</code> parameter that is nested under the PlayConfig parameter, the default domain name specified in ApsaraVideo VOD is used in this operation. If no default domain name is specified, the domain names are queried in reverse chronological order based on the time when the domain names were last modified. To prevent domain name issues, we recommend that you perform the following steps to specify the default playback domain name: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. Find the domain name that you want to configure and click <strong>Manage</strong> in the Actions column. On the page that appears, set the default playback domain name in the <strong>Origin Domain Name</strong> section.</li>
     * <li>If you set the <code>EncryptType</code> parameter nested under the PlayConfig parameter to <code>AliyunVoDEncryption</code>, the playback URLs of videos encrypted by using Alibaba Cloud proprietary cryptography are not automatically returned to ensure video security. To return playback URLs of videos encrypted by using Alibaba Cloud proprietary cryptography, you must set the <code>ResultType</code> parameter to <code>Multiple</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PlayDomain&quot;:&quot;vod.test_domain&quot;,&quot;XForwardedFor&quot;:&quot;yqCD7Fp1uqChoVj/sl/p5Q==&quot;,&quot;PreviewTime&quot;:&quot;20&quot;,&quot;MtsHlsUriToken&quot;:&quot;yqCD7Fp1uqChoVjslp5Q&quot;}</p>
     */
    @NameInMap("PlayConfig")
    public String playConfig;

    /**
     * <p>The CDN reauthentication configuration. The value must be a JSON string. If CDN reauthentication is enabled, you can use this parameter to specify the <code>UID</code> and <code>rand</code> fields for URL authentication. For more information, see <a href="https://help.aliyun.com/document_detail/2249352.html">URL authentication</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;uid&quot;:&quot;12345&quot;,&quot;rand&quot;:&quot;abckljd&quot;}</p>
     */
    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    /**
     * <p>The type of the data to return. Default value: Single. Valid values:</p>
     * <ul>
     * <li><strong>Single</strong>: Only one latest transcoded stream is returned for each quality and format.</li>
     * <li><strong>Multiple</strong>: All transcoded streams are returned for each quality and format.</li>
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
     * <li><strong>video</strong></li>
     * <li><strong>audio</strong></li>
     * </ul>
     * <p>By default, video and audio streams are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    /**
     * <p>The custom digital watermark.</p>
     * <ul>
     * <li>If you set <code>DigitalWatermarkType</code> to <code>TraceMark</code>, specify this parameter to configure the video tracing watermark and return the video stream that contains the watermark. The value can be up to 1,024 characters in length and can contain letters and digits.</li>
     * <li>If you set <code>DigitalWatermarkType</code> to <code>CopyrightMark</code>, specify the <strong>watermark text</strong> that you created for the watermark template for this parameter.`` You can specify this parameter to query and return the video stream that contains the specified watermark text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test mark</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the page that appears, view the media ID.</li>
     * <li>Obtain the value of the VideoId parameter in the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to upload the audio or video file.</li>
     * <li>Obtain the value of VideoId by calling the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
