// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadRequest extends TeaModel {
    /**
     * <p>The ID of the media file, namely, the audio or video ID. You can use one of the following methods to obtain the audio or video ID:</p>
     * <p>* Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the audio or video ID. Use this method if the audio or video file is uploaded by using the ApsaraVideo VOD console.</p>
     * <p>* View the value of the VideoId parameter returned by the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.</p>
     * <p>* View the value of the VideoId parameter returned by the [SearchMedia](~~86044~~) operation that you called to query an audio or video ID after the audio or video file is uploaded.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file. Set the value to **video**, which indicates audio and video files.</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteMultipartUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipartUploadRequest self = new DeleteMultipartUploadRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultipartUploadRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMultipartUploadRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public DeleteMultipartUploadRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
