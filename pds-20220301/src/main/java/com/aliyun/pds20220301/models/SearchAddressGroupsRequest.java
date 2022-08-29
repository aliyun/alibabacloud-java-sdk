// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchAddressGroupsRequest extends TeaModel {
    @NameInMap("address_level")
    public String addressLevel;

    @NameInMap("address_names")
    public java.util.List<String> addressNames;

    @NameInMap("br_geo_point")
    public String brGeoPoint;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    @NameInMap("tl_geo_point")
    public String tlGeoPoint;

    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static SearchAddressGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAddressGroupsRequest self = new SearchAddressGroupsRequest();
        return TeaModel.build(map, self);
    }

    public SearchAddressGroupsRequest setAddressLevel(String addressLevel) {
        this.addressLevel = addressLevel;
        return this;
    }
    public String getAddressLevel() {
        return this.addressLevel;
    }

    public SearchAddressGroupsRequest setAddressNames(java.util.List<String> addressNames) {
        this.addressNames = addressNames;
        return this;
    }
    public java.util.List<String> getAddressNames() {
        return this.addressNames;
    }

    public SearchAddressGroupsRequest setBrGeoPoint(String brGeoPoint) {
        this.brGeoPoint = brGeoPoint;
        return this;
    }
    public String getBrGeoPoint() {
        return this.brGeoPoint;
    }

    public SearchAddressGroupsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public SearchAddressGroupsRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public SearchAddressGroupsRequest setTlGeoPoint(String tlGeoPoint) {
        this.tlGeoPoint = tlGeoPoint;
        return this;
    }
    public String getTlGeoPoint() {
        return this.tlGeoPoint;
    }

    public SearchAddressGroupsRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
