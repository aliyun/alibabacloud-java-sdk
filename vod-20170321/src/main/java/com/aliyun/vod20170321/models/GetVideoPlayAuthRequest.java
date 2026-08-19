// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthRequest extends TeaModel {
    /**
     * <p>The API version number. Set the value to <strong>1.0.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The expiration time of the playback credential. Unit: <strong>seconds</strong>. If the credential expires, the playback URL cannot be obtained. You must obtain a new credential.</p>
     * <ul>
     * <li>Default value: <strong>100</strong>.</li>
     * <li>Valid values: <code>[100,3000]</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AuthInfoTimeout")
    public Long authInfoTimeout;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. Length: 6 to 64 characters. The ID is unique per user.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The audio or video ID. Only a single audio or video ID is supported. You can obtain the ID by using the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When uploading audio or video files by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dfde02284a5c46622a097adaf44a****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetVideoPlayAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayAuthRequest self = new GetVideoPlayAuthRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayAuthRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetVideoPlayAuthRequest setAuthInfoTimeout(Long authInfoTimeout) {
        this.authInfoTimeout = authInfoTimeout;
        return this;
    }
    public Long getAuthInfoTimeout() {
        return this.authInfoTimeout;
    }

    public GetVideoPlayAuthRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public GetVideoPlayAuthRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
