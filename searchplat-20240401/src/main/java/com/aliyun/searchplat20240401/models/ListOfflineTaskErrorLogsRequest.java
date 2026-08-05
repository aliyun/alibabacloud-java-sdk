// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskErrorLogsRequest extends TeaModel {
    /**
     * <p>The end timestamp in seconds. If not specified, the current time is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1760530000</p>
     */
    @NameInMap("endTime")
    public Integer endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The start timestamp in seconds. If not specified, the time one hour before the current time is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1762946698</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    public static ListOfflineTaskErrorLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskErrorLogsRequest self = new ListOfflineTaskErrorLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskErrorLogsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListOfflineTaskErrorLogsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListOfflineTaskErrorLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOfflineTaskErrorLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOfflineTaskErrorLogsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
