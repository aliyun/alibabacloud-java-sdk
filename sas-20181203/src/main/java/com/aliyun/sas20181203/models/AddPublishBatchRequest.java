// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPublishBatchRequest extends TeaModel {
    /**
     * <p>The name of the release batch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BatchName")
    public String batchName;

    /**
     * <p>The interval between two release batches.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The dimension based on which the asset is selected. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: selects the asset by instance.</li>
     * <li><strong>1</strong>: selects the asset by machine group.</li>
     * <li><strong>2</strong>: selects the asset by the ID of the instance that is deployed in the virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationBase")
    public Integer operationBase;

    /**
     * <p>The version to which you want to upgrade the agent.</p>
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
