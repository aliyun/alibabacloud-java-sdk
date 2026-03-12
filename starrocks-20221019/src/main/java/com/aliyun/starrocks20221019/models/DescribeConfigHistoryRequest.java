// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>effective</p>
     */
    @NameInMap("EffectStatuses")
    public String effectStatuses;

    /**
     * <strong>example:</strong>
     * <p>1742178604000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTotal")
    public Boolean needTotal;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1742178604000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeConfigHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigHistoryRequest self = new DescribeConfigHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigHistoryRequest setEffectStatuses(String effectStatuses) {
        this.effectStatuses = effectStatuses;
        return this;
    }
    public String getEffectStatuses() {
        return this.effectStatuses;
    }

    public DescribeConfigHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeConfigHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeConfigHistoryRequest setNeedTotal(Boolean needTotal) {
        this.needTotal = needTotal;
        return this;
    }
    public Boolean getNeedTotal() {
        return this.needTotal;
    }

    public DescribeConfigHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConfigHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfigHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
