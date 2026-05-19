// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientEventDashboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>1656038940435</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>1648438617000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetFileProtectClientEventDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientEventDashboardRequest self = new GetFileProtectClientEventDashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientEventDashboardRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public GetFileProtectClientEventDashboardRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetFileProtectClientEventDashboardRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetFileProtectClientEventDashboardRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
