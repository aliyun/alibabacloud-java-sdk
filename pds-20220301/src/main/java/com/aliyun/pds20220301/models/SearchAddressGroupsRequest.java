// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchAddressGroupsRequest extends TeaModel {
    /**
     * <p>The address level for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>city</p>
     */
    @NameInMap("address_level")
    public String addressLevel;

    /**
     * <p>A list of address names.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hangzhou&quot;,&quot;Beijing&quot;]</p>
     */
    @NameInMap("address_names")
    public java.util.List<String> addressNames;

    /**
     * <p>The bottom-right point of the rectangle (latitude, longitude).</p>
     * 
     * <strong>example:</strong>
     * <p>40.121,105.2121</p>
     */
    @NameInMap("br_geo_point")
    public String brGeoPoint;

    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The processing style for image thumbnails.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,w_200</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The top-left point of the rectangle (latitude, longitude).</p>
     * 
     * <strong>example:</strong>
     * <p>39.121,101.2121</p>
     */
    @NameInMap("tl_geo_point")
    public String tlGeoPoint;

    /**
     * <p>The processing style for video thumbnails.</p>
     * 
     * <strong>example:</strong>
     * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
     */
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
