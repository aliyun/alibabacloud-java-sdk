// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEventsListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD HH:mm:ss format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-28 18:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance IDs. You can specify one or more instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>r-uf6ce0r08lr7xn****</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD HH:mm:ss format. The time must be in UTC.</p>
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
