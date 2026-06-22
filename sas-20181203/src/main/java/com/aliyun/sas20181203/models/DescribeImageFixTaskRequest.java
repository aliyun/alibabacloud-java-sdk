// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskRequest extends TeaModel {
    /**
     * <p>The page number of the results to return. Default value: <strong>1</strong>, which indicates that the results start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp of the repair task that you want to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635575219000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries per page in a paginated query. Default value: <strong>20</strong>, which indicates that up to 20 entries are returned per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start timestamp of the repair task that you want to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1634725571000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the image repair task that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Repairing</li>
     * <li><strong>2</strong>: Repaired</li>
     * <li><strong>3</strong>: Repair failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeImageFixTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixTaskRequest self = new DescribeImageFixTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageFixTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeImageFixTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageFixTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeImageFixTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
