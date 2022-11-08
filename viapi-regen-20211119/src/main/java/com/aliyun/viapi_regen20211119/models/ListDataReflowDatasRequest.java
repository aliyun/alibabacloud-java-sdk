// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDataReflowDatasRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListDataReflowDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataReflowDatasRequest self = new ListDataReflowDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListDataReflowDatasRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListDataReflowDatasRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDataReflowDatasRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDataReflowDatasRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListDataReflowDatasRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataReflowDatasRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ListDataReflowDatasRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
