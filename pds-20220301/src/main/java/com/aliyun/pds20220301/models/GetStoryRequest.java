// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetStoryRequest extends TeaModel {
    @NameInMap("cover_image_thumbnail_process")
    @Deprecated
    public String coverImageThumbnailProcess;

    @NameInMap("cover_video_thumbnail_process")
    @Deprecated
    public String coverVideoThumbnailProcess;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("image_thumbnail_process")
    @Deprecated
    public String imageThumbnailProcess;

    @NameInMap("image_url_process")
    @Deprecated
    public String imageUrlProcess;

    @NameInMap("story_id")
    public String storyId;

    @NameInMap("url_expire_sec")
    @Deprecated
    public Long urlExpireSec;

    @NameInMap("video_thumbnail_process")
    @Deprecated
    public String videoThumbnailProcess;

    public static GetStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoryRequest self = new GetStoryRequest();
        return TeaModel.build(map, self);
    }

    public GetStoryRequest setCoverImageThumbnailProcess(String coverImageThumbnailProcess) {
        this.coverImageThumbnailProcess = coverImageThumbnailProcess;
        return this;
    }
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

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

    public GetStoryRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

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

    public GetStoryRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public GetStoryRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
