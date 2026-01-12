// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEventsListRequest extends TeaModel {
    /**
     * <p>The start time of the query period.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-28 18:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-uf6ce0r08lr7xnriq2</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The end time of the query period.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>DescribeEventsList</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The RDS Supabase instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 18:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEventsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsListRequest self = new DescribeEventsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEventsListRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeEventsListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEventsListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
