// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullTryOnShoesEventRequest extends TeaModel {
    @NameInMap("SkuId")
    public String skuId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Date")
    public String date;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Name")
    public String name;

    public static PullTryOnShoesEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PullTryOnShoesEventRequest self = new PullTryOnShoesEventRequest();
        return TeaModel.build(map, self);
    }

    public PullTryOnShoesEventRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public PullTryOnShoesEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PullTryOnShoesEventRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PullTryOnShoesEventRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public PullTryOnShoesEventRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public PullTryOnShoesEventRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
