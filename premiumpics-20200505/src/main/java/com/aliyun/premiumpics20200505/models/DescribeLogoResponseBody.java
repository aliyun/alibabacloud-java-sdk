// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeLogoResponseBody extends TeaModel {
    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("ColorDescription")
    public String colorDescription;

    @NameInMap("ColorOne")
    public String colorOne;

    @NameInMap("ColorThree")
    public String colorThree;

    @NameInMap("ColorTwo")
    public String colorTwo;

    @NameInMap("FontDescription")
    public String fontDescription;

    @NameInMap("Images")
    public java.util.List<String> images;

    @NameInMap("NamePath")
    public String namePath;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogoResponseBody self = new DescribeLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogoResponseBody setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public DescribeLogoResponseBody setColorDescription(String colorDescription) {
        this.colorDescription = colorDescription;
        return this;
    }
    public String getColorDescription() {
        return this.colorDescription;
    }

    public DescribeLogoResponseBody setColorOne(String colorOne) {
        this.colorOne = colorOne;
        return this;
    }
    public String getColorOne() {
        return this.colorOne;
    }

    public DescribeLogoResponseBody setColorThree(String colorThree) {
        this.colorThree = colorThree;
        return this;
    }
    public String getColorThree() {
        return this.colorThree;
    }

    public DescribeLogoResponseBody setColorTwo(String colorTwo) {
        this.colorTwo = colorTwo;
        return this;
    }
    public String getColorTwo() {
        return this.colorTwo;
    }

    public DescribeLogoResponseBody setFontDescription(String fontDescription) {
        this.fontDescription = fontDescription;
        return this;
    }
    public String getFontDescription() {
        return this.fontDescription;
    }

    public DescribeLogoResponseBody setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public DescribeLogoResponseBody setNamePath(String namePath) {
        this.namePath = namePath;
        return this;
    }
    public String getNamePath() {
        return this.namePath;
    }

    public DescribeLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
