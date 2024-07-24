// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageMediaMetadata extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>浙江省杭州市滨江区西兴街道江陵路</p>
     */
    @NameInMap("address_line")
    public String addressLine;

    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("country")
    public String country;

    /**
     * <strong>example:</strong>
     * <p>滨江区</p>
     */
    @NameInMap("district")
    public String district;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Compression&quot;:{&quot;value&quot;:&quot;6&quot;},&quot;DateTime&quot;:{&quot;value&quot;:&quot;2020:08:19 17:11:11&quot;}}</p>
     */
    @NameInMap("exif")
    public String exif;

    @NameInMap("faces_thumbnail")
    public java.util.List<FaceThumbnail> facesThumbnail;

    /**
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("height")
    public Long height;

    @NameInMap("image_quality")
    public ImageQuality imageQuality;

    @NameInMap("image_tags")
    public java.util.List<SystemTag> imageTags;

    /**
     * <strong>example:</strong>
     * <p>30.185453,120.218522</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05.000Z07:00</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <strong>example:</strong>
     * <p>西兴街道</p>
     */
    @NameInMap("township")
    public String township;

    /**
     * <strong>example:</strong>
     * <p>1920</p>
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
