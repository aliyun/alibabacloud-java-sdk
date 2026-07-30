// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListHivesRequest extends TeaModel {
    /**
     * <p>The time range filter parameter. Specify the time in the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-14T15:20:37+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The cloud application service group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>g-xxxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the query list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-14T15:20:37+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListHivesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHivesRequest self = new ListHivesRequest();
        return TeaModel.build(map, self);
    }

    public ListHivesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListHivesRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public ListHivesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHivesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHivesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHivesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
