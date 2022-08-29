// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAddressGroupsRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static ListAddressGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddressGroupsRequest self = new ListAddressGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAddressGroupsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListAddressGroupsRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public ListAddressGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAddressGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListAddressGroupsRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
