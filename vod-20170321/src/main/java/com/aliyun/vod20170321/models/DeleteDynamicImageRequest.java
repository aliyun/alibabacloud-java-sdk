// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDynamicImageRequest extends TeaModel {
    /**
     * <p>The list of animated sticker IDs. The animated sticker ID is the value of the DynamicImageId response parameter returned by the <a href="https://help.aliyun.com/document_detail/180958.html">ListDynamicImage</a> operation.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.</li>
     * <li><strong>If you do not specify this parameter, all animated stickers associated with the specified VideoId are deleted. However, if the video has more than 10 animated stickers, the deletion request is rejected.</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>beafec3834a4e52ea52042a4****,8281c8519847fd8970e79e80b6****</p>
     */
    @NameInMap("DynamicImageIds")
    public String dynamicImageIds;

    /**
     * <p>The ID of the video associated with the animated stickers that you want to delete. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
     * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2321077d460b028700ef6c2f4d****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static DeleteDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicImageRequest self = new DeleteDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicImageRequest setDynamicImageIds(String dynamicImageIds) {
        this.dynamicImageIds = dynamicImageIds;
        return this;
    }
    public String getDynamicImageIds() {
        return this.dynamicImageIds;
    }

    public DeleteDynamicImageRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
