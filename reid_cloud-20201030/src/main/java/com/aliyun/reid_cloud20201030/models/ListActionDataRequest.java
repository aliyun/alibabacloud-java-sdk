// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListActionDataRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FilterInvalidData")
    public Boolean filterInvalidData;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListActionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionDataRequest self = new ListActionDataRequest();
        return TeaModel.build(map, self);
    }

    public ListActionDataRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ListActionDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListActionDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActionDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListActionDataRequest setFilterInvalidData(Boolean filterInvalidData) {
        this.filterInvalidData = filterInvalidData;
        return this;
    }
    public Boolean getFilterInvalidData() {
        return this.filterInvalidData;
    }

    public ListActionDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
