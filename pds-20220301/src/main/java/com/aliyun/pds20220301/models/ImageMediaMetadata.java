// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageMediaMetadata extends TeaModel {
    @NameInMap("address_line")
    public String addressLine;

    @NameInMap("city")
    public String city;

    @NameInMap("country")
    public String country;

    @NameInMap("district")
    public String district;

    @NameInMap("exif")
    public String exif;

    @NameInMap("faces")
    @Deprecated
    public String faces;

    @NameInMap("faces_thumbnail")
    public java.util.List<FaceThumbnail> facesThumbnail;

    @NameInMap("height")
    public Long height;

    @NameInMap("image_quality")
    public ImageQuality imageQuality;

    @NameInMap("image_tags")
    public java.util.List<SystemTag> imageTags;

    @NameInMap("location")
    public String location;

    @NameInMap("province")
    public String province;

    @NameInMap("time")
    public String time;

    @NameInMap("township")
    public String township;

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

    public ImageMediaMetadata setFaces(String faces) {
        this.faces = faces;
        return this;
    }
    public String getFaces() {
        return this.faces;
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
