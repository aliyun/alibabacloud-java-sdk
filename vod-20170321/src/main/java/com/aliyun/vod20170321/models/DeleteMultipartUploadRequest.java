// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadRequest extends TeaModel {
    /**
     * <p>The ID of the media file (VideoId). You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   After you upload a video in the [ApsaraVideo VOD console](https://vod.console.aliyun.com), you can log on to the ApsaraVideo VOD console and choose **Media Files** > **Audio/Video** to view the ID of the video.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain the upload URL and credential.</p>
     * <p>*   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file. Set the value to **video**. video indicates audio and video files.</p>
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
