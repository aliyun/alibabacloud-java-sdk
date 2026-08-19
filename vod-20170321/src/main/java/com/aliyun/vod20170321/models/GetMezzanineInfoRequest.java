// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    /**
     * <p>The type of additional information. Separate multiple values with commas (,). By default, only basic information is returned. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video stream information.</li>
     * <li><strong>audio</strong>: audio stream information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The validity period of the signature for FileURL (source file URL). Unit: seconds. Default value: <strong>3600</strong>. The minimum value is <strong>1</strong>.</p>
     * <ul>
     * <li>If OutputType is set to <strong>cdn</strong>:<ul>
     * <li>FileURL expires periodically only if URL signing is enabled. Otherwise, FileURL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: <strong>3600</strong> if this parameter is not specified.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to <strong>oss</strong>:<ul>
     * <li>FileURL expires periodically only if the storage permission is set to private. Otherwise, FileURL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) when the audio or video file is stored in a bucket managed by ApsaraVideo VOD, and <strong>129600</strong> (36 hours) when the file is stored in your own OSS bucket.</li>
     * <li>Default value: <strong>3600</strong> if this parameter is not specified.</li>
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
     * <p>The type of the output URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): CDN URL.</li>
     * </ul>
     * <blockquote>
     * <p>If the bucket type of the source file is in, only the OSS URL is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_) are supported. The value must be 6 to 64 characters in length and is unique at the user level.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The audio or video ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation when you request an upload URL and credential.</li>
     * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of VideoId in the response.</li>
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
