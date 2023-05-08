// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogosRequest extends TeaModel {
    @NameInMap("AuthorityType")
    public String authorityType;

    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("ColorStyle")
    public String colorStyle;

    @NameInMap("Description")
    public String description;

    @NameInMap("FontStyle")
    public String fontStyle;

    @NameInMap("IndustryId")
    public String industryId;

    @NameInMap("IndustryName")
    public String industryName;

    @NameInMap("LogoVersion")
    public String logoVersion;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Slogan")
    public String slogan;

    @NameInMap("StyleId")
    public String styleId;

    /**
     * <p>type</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>UserId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListLogosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogosRequest self = new ListLogosRequest();
        return TeaModel.build(map, self);
    }

    public ListLogosRequest setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
        return this;
    }
    public String getAuthorityType() {
        return this.authorityType;
    }

    public ListLogosRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public ListLogosRequest setColorStyle(String colorStyle) {
        this.colorStyle = colorStyle;
        return this;
    }
    public String getColorStyle() {
        return this.colorStyle;
    }

    public ListLogosRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListLogosRequest setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }
    public String getFontStyle() {
        return this.fontStyle;
    }

    public ListLogosRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public ListLogosRequest setIndustryName(String industryName) {
        this.industryName = industryName;
        return this;
    }
    public String getIndustryName() {
        return this.industryName;
    }

    public ListLogosRequest setLogoVersion(String logoVersion) {
        this.logoVersion = logoVersion;
        return this;
    }
    public String getLogoVersion() {
        return this.logoVersion;
    }

    public ListLogosRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogosRequest setSlogan(String slogan) {
        this.slogan = slogan;
        return this;
    }
    public String getSlogan() {
        return this.slogan;
    }

    public ListLogosRequest setStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }
    public String getStyleId() {
        return this.styleId;
    }

    public ListLogosRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListLogosRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
