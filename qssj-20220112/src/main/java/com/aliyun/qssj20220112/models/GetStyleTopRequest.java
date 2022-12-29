// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleTopRequest extends TeaModel {
    @NameInMap("BrandNames")
    public String brandNames;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("EndingPrice")
    public String endingPrice;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("ShopIds")
    public String shopIds;

    @NameInMap("SortOrder")
    public Long sortOrder;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("StartPrice")
    public String startPrice;

    @NameInMap("TimeDisplay")
    public Long timeDisplay;

    public static GetStyleTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStyleTopRequest self = new GetStyleTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStyleTopRequest setBrandNames(String brandNames) {
        this.brandNames = brandNames;
        return this;
    }
    public String getBrandNames() {
        return this.brandNames;
    }

    public GetStyleTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetStyleTopRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetStyleTopRequest setEndingPrice(String endingPrice) {
        this.endingPrice = endingPrice;
        return this;
    }
    public String getEndingPrice() {
        return this.endingPrice;
    }

    public GetStyleTopRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetStyleTopRequest setShopIds(String shopIds) {
        this.shopIds = shopIds;
        return this;
    }
    public String getShopIds() {
        return this.shopIds;
    }

    public GetStyleTopRequest setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public Long getSortOrder() {
        return this.sortOrder;
    }

    public GetStyleTopRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetStyleTopRequest setStartPrice(String startPrice) {
        this.startPrice = startPrice;
        return this;
    }
    public String getStartPrice() {
        return this.startPrice;
    }

    public GetStyleTopRequest setTimeDisplay(Long timeDisplay) {
        this.timeDisplay = timeDisplay;
        return this;
    }
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

}
