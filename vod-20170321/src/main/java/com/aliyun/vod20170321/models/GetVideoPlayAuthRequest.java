// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthRequest extends TeaModel {
    /**
     * <p>The API version. Set the value to **1.0.0**.</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The validity period of the playback credential. Unit: **seconds**. You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</p>
     * <br>
     * <p>*   Default value: **100**.</p>
     * <p>*   Valid values: `[100,3000]`.</p>
     */
    @NameInMap("AuthInfoTimeout")
    public Long authInfoTimeout;

    /**
     * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the ID of the file:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [CreateUploadVideo](~~55407~~) operation.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.</p>
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
