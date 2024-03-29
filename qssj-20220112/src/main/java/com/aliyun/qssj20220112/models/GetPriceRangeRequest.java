// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetPriceRangeRequest extends TeaModel {
    @NameInMap("BrandNames")
    public String brandNames;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("EndingDate")
    public String endingDate;

    @NameInMap("Section")
    public Long section;

    @NameInMap("ShopIds")
    public String shopIds;

    @NameInMap("StartDate")
    public String startDate;

    public static GetPriceRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceRangeRequest self = new GetPriceRangeRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceRangeRequest setBrandNames(String brandNames) {
        this.brandNames = brandNames;
        return this;
    }
    public String getBrandNames() {
        return this.brandNames;
    }

    public GetPriceRangeRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetPriceRangeRequest setEndingDate(String endingDate) {
        this.endingDate = endingDate;
        return this;
    }
    public String getEndingDate() {
        return this.endingDate;
    }

    public GetPriceRangeRequest setSection(Long section) {
        this.section = section;
        return this;
    }
    public Long getSection() {
        return this.section;
    }

    public GetPriceRangeRequest setShopIds(String shopIds) {
        this.shopIds = shopIds;
        return this;
    }
    public String getShopIds() {
        return this.shopIds;
    }

    public GetPriceRangeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
