// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSalesVolumeTopRequest extends TeaModel {
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

    public static GetStoreSalesVolumeTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSalesVolumeTopRequest self = new GetStoreSalesVolumeTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStoreSalesVolumeTopRequest setBrandNames(String brandNames) {
        this.brandNames = brandNames;
        return this;
    }
    public String getBrandNames() {
        return this.brandNames;
    }

    public GetStoreSalesVolumeTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetStoreSalesVolumeTopRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetStoreSalesVolumeTopRequest setEndingPrice(String endingPrice) {
        this.endingPrice = endingPrice;
        return this;
    }
    public String getEndingPrice() {
        return this.endingPrice;
    }

    public GetStoreSalesVolumeTopRequest setEndingSalesVolume(String endingSalesVolume) {
        this.endingSalesVolume = endingSalesVolume;
        return this;
    }
    public String getEndingSalesVolume() {
        return this.endingSalesVolume;
    }

    public GetStoreSalesVolumeTopRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetStoreSalesVolumeTopRequest setShopIds(String shopIds) {
        this.shopIds = shopIds;
        return this;
    }
    public String getShopIds() {
        return this.shopIds;
    }

    public GetStoreSalesVolumeTopRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetStoreSalesVolumeTopRequest setStartPrice(String startPrice) {
        this.startPrice = startPrice;
        return this;
    }
    public String getStartPrice() {
        return this.startPrice;
    }

    public GetStoreSalesVolumeTopRequest setStartSalesVolume(String startSalesVolume) {
        this.startSalesVolume = startSalesVolume;
        return this;
    }
    public String getStartSalesVolume() {
        return this.startSalesVolume;
    }

}
