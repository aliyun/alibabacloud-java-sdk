// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    /**
     * <p>The type of additional information. Separate multiple values with commas (,). By default, only basic information is returned. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: the video stream information.</li>
     * <li><strong>audio</strong>: the audio stream information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The expiration time of the signature for the FileURL (source file URL). Unit: seconds. Default value: <strong>3600</strong>. Minimum value: <strong>1</strong>.</p>
     * <ul>
     * <li>If OutputType is set to <strong>cdn</strong>:<ul>
     * <li>The FileURL expires periodically only if URL authentication is enabled. Otherwise, the FileURL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: <strong>3600</strong> if not specified.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to <strong>oss</strong>:<ul>
     * <li>The FileURL expires periodically only if the storage permission is set to private. Otherwise, the FileURL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>2592000</strong> (30 days) when the audio or video file is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) when the audio or video file is stored in a user-owned OSS bucket.</li>
     * <li>Default value: <strong>3600</strong> if not specified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The output URL type. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: the back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): the accelerated URL.</li>
     * </ul>
     * <blockquote>
     * <p>If the bucket where the source file is stored is of the in type, only the OSS URL is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom ID. The ID must be 6 to 64 characters in length and can contain only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_). The ID must be unique per user.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The audio or video ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>For an audio or video file uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Obtain the upload URL and credential for a video</a> operation to obtain the upload URL and credential, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search media information</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1f1a6fc03ca04814031b8a6559e****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetMezzanineInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoRequest self = new GetMezzanineInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMezzanineInfoRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

    public GetMezzanineInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMezzanineInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetMezzanineInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public GetMezzanineInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
