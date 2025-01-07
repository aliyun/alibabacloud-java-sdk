// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishBatchRequest extends TeaModel {
    /**
     * <p>The ID of the release batch.</p>
     * 
     * <strong>example:</strong>
     * <p>52370</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    /**
     * <p>The name of the release batch.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BatchName")
    public String batchName;

    /**
     * <p>The interval between two release batches.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The asset selection dimension. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: instance</li>
     * <li><strong>1</strong>: machine group</li>
     * <li><strong>2</strong>: VPC-based instance ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationBase")
    public Integer operationBase;

    public static UpdatePublishBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishBatchRequest self = new UpdatePublishBatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublishBatchRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public UpdatePublishBatchRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public UpdatePublishBatchRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdatePublishBatchRequest setOperationBase(Integer operationBase) {
        this.operationBase = operationBase;
        return this;
    }
    public Integer getOperationBase() {
        return this.operationBase;
    }

}
