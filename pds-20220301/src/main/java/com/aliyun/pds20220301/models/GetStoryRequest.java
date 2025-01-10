// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetStoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0/format,jpg</p>
     */
    @NameInMap("cover_image_thumbnail_process")
    @Deprecated
    public String coverImageThumbnailProcess;

    /**
     * <strong>example:</strong>
     * <p>video/snapshot,t_1000,f_jpg,w_0,h_0,m_fast,ar_auto</p>
     */
    @NameInMap("cover_video_thumbnail_process")
    @Deprecated
    public String coverVideoThumbnailProcess;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0/format,jpg</p>
     */
    @NameInMap("image_thumbnail_process")
    @Deprecated
    public String imageThumbnailProcess;

    /**
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0/format,jpg</p>
     */
    @NameInMap("image_url_process")
    @Deprecated
    public String imageUrlProcess;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    /**
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("url_expire_sec")
    @Deprecated
    public Long urlExpireSec;

    /**
     * <strong>example:</strong>
     * <p>video/snapshot,t_1000,f_jpg,w_0,h_0,m_fast,ar_auto</p>
     */
    @NameInMap("video_thumbnail_process")
    @Deprecated
    public String videoThumbnailProcess;

    public static GetStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoryRequest self = new GetStoryRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetStoryRequest setCoverImageThumbnailProcess(String coverImageThumbnailProcess) {
        this.coverImageThumbnailProcess = coverImageThumbnailProcess;
        return this;
    }
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

    @Deprecated
    public GetStoryRequest setCoverVideoThumbnailProcess(String coverVideoThumbnailProcess) {
        this.coverVideoThumbnailProcess = coverVideoThumbnailProcess;
        return this;
    }
    public String getCoverVideoThumbnailProcess() {
        return this.coverVideoThumbnailProcess;
    }

    public GetStoryRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    @Deprecated
    public GetStoryRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    @Deprecated
    public GetStoryRequest setImageUrlProcess(String imageUrlProcess) {
        this.imageUrlProcess = imageUrlProcess;
        return this;
    }
    public String getImageUrlProcess() {
        return this.imageUrlProcess;
    }

    public GetStoryRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    @Deprecated
    public GetStoryRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    @Deprecated
    public GetStoryRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
