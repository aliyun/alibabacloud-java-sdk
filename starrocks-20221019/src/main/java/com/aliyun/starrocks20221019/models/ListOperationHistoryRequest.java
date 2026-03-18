// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1742179008000</p>
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
     * <p>op-f49743caa809****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("OperationStatus")
    public String operationStatus;

    /**
     * <strong>example:</strong>
     * <p>update_configuration</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1742179008000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListOperationHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHistoryRequest self = new ListOperationHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListOperationHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationHistoryRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListOperationHistoryRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public ListOperationHistoryRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListOperationHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
