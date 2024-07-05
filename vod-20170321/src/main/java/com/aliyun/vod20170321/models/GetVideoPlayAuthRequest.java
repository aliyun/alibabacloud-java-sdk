// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthRequest extends TeaModel {
    /**
     * <p>The API version. Set the value to <strong>1.0.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The validity period of the playback credential. Unit: <strong>seconds</strong>. You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</p>
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
     * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the ID of the file:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation.</li>
     * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
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

    public GetVideoPlayAuthRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
