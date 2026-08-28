// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListPatrolReportsRequest extends TeaModel {
    /**
     * <p>The end time of the query. Unit: milliseconds (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1718086400000</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Filters reports by inspection scope type. Valid values:</p>
     * <ul>
     * <li>ALL</li>
     * <li>TAGS</li>
     * <li>DEPLOYMENTS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The start time of the query. Unit: milliseconds (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1718000000000</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>Filters reports by status. Valid values:</p>
     * <ul>
     * <li>PENDING</li>
     * <li>IN_PROGRESS</li>
     * <li>COMPLETED</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Filters reports by trigger type. Valid values:</p>
     * <ul>
     * <li>CRON</li>
     * <li>MANUAL</li>
     * <li>INNER_API</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CRON</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static ListPatrolReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPatrolReportsRequest self = new ListPatrolReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListPatrolReportsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListPatrolReportsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListPatrolReportsRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public ListPatrolReportsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListPatrolReportsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public ListPatrolReportsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPatrolReportsRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
