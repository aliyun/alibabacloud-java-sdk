// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryActivityItemsRequest extends TeaModel {
    @NameInMap("ActivityId")
    public Integer activityId;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("FloorIndex")
    public Integer floorIndex;

    @NameInMap("Mock")
    public Boolean mock;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Refresh")
    public Boolean refresh;

    @NameInMap("UmId")
    public String umId;

    public static QueryActivityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsRequest self = new QueryActivityItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsRequest setActivityId(Integer activityId) {
        this.activityId = activityId;
        return this;
    }
    public Integer getActivityId() {
        return this.activityId;
    }

    public QueryActivityItemsRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public QueryActivityItemsRequest setFloorIndex(Integer floorIndex) {
        this.floorIndex = floorIndex;
        return this;
    }
    public Integer getFloorIndex() {
        return this.floorIndex;
    }

    public QueryActivityItemsRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    public QueryActivityItemsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryActivityItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryActivityItemsRequest setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
    public Boolean getRefresh() {
        return this.refresh;
    }

    public QueryActivityItemsRequest setUmId(String umId) {
        this.umId = umId;
        return this;
    }
    public String getUmId() {
        return this.umId;
    }

}
