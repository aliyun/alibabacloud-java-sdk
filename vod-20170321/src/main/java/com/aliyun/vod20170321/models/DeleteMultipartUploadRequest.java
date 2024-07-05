// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadRequest extends TeaModel {
    /**
     * <p>The ID of the media file (VideoId). You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>After you upload a video in the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, you can log on to the ApsaraVideo VOD console and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain the upload URL and credential.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61ccbdb06fa3012be4d8083f6****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file. Set the value to <strong>video</strong>. video indicates audio and video files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
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
