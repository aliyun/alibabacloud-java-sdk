// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageMediaMetadata extends TeaModel {
    /**
     * <p>The full address.</p>
     * 
     * <strong>example:</strong>
     * <p>Jiangling Road, Xixing Street, Binjiang District, Hangzhou, Zhejiang</p>
     */
    @NameInMap("address_line")
    public String addressLine;

    /**
     * <p>The city in which the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <p>The country or region in which the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("country")
    public String country;

    /**
     * <p>The district in which the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>Binjiang District</p>
     */
    @NameInMap("district")
    public String district;

    /**
     * <p>The EXIF information about the image.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Compression&quot;:{&quot;value&quot;:&quot;6&quot;},&quot;DateTime&quot;:{&quot;value&quot;:&quot;2020:08:19 17:11:11&quot;}}</p>
     */
    @NameInMap("exif")
    public String exif;

    /**
     * <p>The thumbnails of the faces.</p>
     */
    @NameInMap("faces_thumbnail")
    public java.util.List<FaceThumbnail> facesThumbnail;

    /**
     * <p>The height of the image. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("height")
    public Long height;

    /**
     * <p>The rating of the image.</p>
     */
    @NameInMap("image_quality")
    public ImageQuality imageQuality;

    /**
     * <p>The details of the image tags.</p>
     */
    @NameInMap("image_tags")
    public java.util.List<SystemTag> imageTags;

    /**
     * <p>The location of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>30.185453,120.218522</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The province in which the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("province")
    public String province;

    /**
     * <p>The time when the image was taken. The time follows the RFC3339 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05.000Z07:00</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <p>The street in which the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>Xixing Street</p>
     */
    @NameInMap("township")
    public String township;

    /**
     * <p>The width of the image. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("width")
    public Long width;

    public static ImageMediaMetadata build(java.util.Map<String, ?> map) throws Exception {
        ImageMediaMetadata self = new ImageMediaMetadata();
        return TeaModel.build(map, self);
    }

    public ImageMediaMetadata setAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }
    public String getAddressLine() {
        return this.addressLine;
    }

    public ImageMediaMetadata setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ImageMediaMetadata setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ImageMediaMetadata setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public ImageMediaMetadata setExif(String exif) {
        this.exif = exif;
        return this;
    }
    public String getExif() {
        return this.exif;
    }

    public ImageMediaMetadata setFacesThumbnail(java.util.List<FaceThumbnail> facesThumbnail) {
        this.facesThumbnail = facesThumbnail;
        return this;
    }
    public java.util.List<FaceThumbnail> getFacesThumbnail() {
        return this.facesThumbnail;
    }

    public ImageMediaMetadata setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ImageMediaMetadata setImageQuality(ImageQuality imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public ImageQuality getImageQuality() {
        return this.imageQuality;
    }

    public ImageMediaMetadata setImageTags(java.util.List<SystemTag> imageTags) {
        this.imageTags = imageTags;
        return this;
    }
    public java.util.List<SystemTag> getImageTags() {
        return this.imageTags;
    }

    public ImageMediaMetadata setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ImageMediaMetadata setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ImageMediaMetadata setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ImageMediaMetadata setTownship(String township) {
        this.township = township;
        return this;
    }
    public String getTownship() {
        return this.township;
    }

    public ImageMediaMetadata setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
