// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendStatisticRequest extends TeaModel {
    @NameInMap("BrandNames")
    public String brandNames;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("ShopIds")
    public String shopIds;

    @NameInMap("StartDate")
    public String startDate;

    public static GetTrendStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendStatisticRequest self = new GetTrendStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendStatisticRequest setBrandNames(String brandNames) {
        this.brandNames = brandNames;
        return this;
    }
    public String getBrandNames() {
        return this.brandNames;
    }

    public GetTrendStatisticRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetTrendStatisticRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetTrendStatisticRequest setShopIds(String shopIds) {
        this.shopIds = shopIds;
        return this;
    }
    public String getShopIds() {
        return this.shopIds;
    }

    public GetTrendStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
