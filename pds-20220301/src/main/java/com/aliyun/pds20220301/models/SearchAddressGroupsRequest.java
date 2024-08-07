// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchAddressGroupsRequest extends TeaModel {
    /**
     * <p>The level of the location.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>country</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>province</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>city</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>district</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>township</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     */
    @NameInMap("address_level")
    public String addressLevel;

    /**
     * <p>The locations.</p>
     */
    @NameInMap("address_names")
    public java.util.List<String> addressNames;

    /**
     * <p>The coordinates of the bottom right vertex of the rectangle. Set the value in the format of latitude,longitude.</p>
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
     * <p>The method used to generate the thumbnail of an image.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,w_200</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The coordinates of the top left vertex of the rectangle. Set the value in the format of latitude,longitude.</p>
     * 
     * <strong>example:</strong>
     * <p>39.121,101.2121</p>
     */
    @NameInMap("tl_geo_point")
    public String tlGeoPoint;

    /**
     * <p>The method used to generate the thumbnail of a video.</p>
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
