// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPublishBatchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchName")
    public String batchName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationBase")
    public Integer operationBase;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.9</p>
     */
    @NameInMap("UpgradeVersion")
    public String upgradeVersion;

    public static AddPublishBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPublishBatchRequest self = new AddPublishBatchRequest();
        return TeaModel.build(map, self);
    }

    public AddPublishBatchRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public AddPublishBatchRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddPublishBatchRequest setOperationBase(Integer operationBase) {
        this.operationBase = operationBase;
        return this;
    }
    public Integer getOperationBase() {
        return this.operationBase;
    }

    public AddPublishBatchRequest setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

}
