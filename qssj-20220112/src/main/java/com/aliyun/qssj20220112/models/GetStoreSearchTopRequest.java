// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSearchTopRequest extends TeaModel {
    @NameInMap("BrandNames")
    public String brandNames;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("EndingPrice")
    public String endingPrice;

    @NameInMap("EndingSalesVolume")
    public String endingSalesVolume;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("ShopIds")
    public String shopIds;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("StartPrice")
    public String startPrice;

    @NameInMap("StartSalesVolume")
    public String startSalesVolume;

    public static GetStoreSearchTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSearchTopRequest self = new GetStoreSearchTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStoreSearchTopRequest setBrandNames(String brandNames) {
        this.brandNames = brandNames;
        return this;
    }
    public String getBrandNames() {
        return this.brandNames;
    }

    public GetStoreSearchTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetStoreSearchTopRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetStoreSearchTopRequest setEndingPrice(String endingPrice) {
        this.endingPrice = endingPrice;
        return this;
    }
    public String getEndingPrice() {
        return this.endingPrice;
    }

    public GetStoreSearchTopRequest setEndingSalesVolume(String endingSalesVolume) {
        this.endingSalesVolume = endingSalesVolume;
        return this;
    }
    public String getEndingSalesVolume() {
        return this.endingSalesVolume;
    }

    public GetStoreSearchTopRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetStoreSearchTopRequest setShopIds(String shopIds) {
        this.shopIds = shopIds;
        return this;
    }
    public String getShopIds() {
        return this.shopIds;
    }

    public GetStoreSearchTopRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetStoreSearchTopRequest setStartPrice(String startPrice) {
        this.startPrice = startPrice;
        return this;
    }
    public String getStartPrice() {
        return this.startPrice;
    }

    public GetStoreSearchTopRequest setStartSalesVolume(String startSalesVolume) {
        this.startSalesVolume = startSalesVolume;
        return this;
    }
    public String getStartSalesVolume() {
        return this.startSalesVolume;
    }

}
