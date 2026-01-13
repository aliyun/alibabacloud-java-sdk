// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PublishRecallManagementTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Merge</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Partition")
    public java.util.Map<String, String> partition;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipThresholdCheck")
    public Boolean skipThresholdCheck;

    public static PublishRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRecallManagementTableRequest self = new PublishRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public PublishRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishRecallManagementTableRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PublishRecallManagementTableRequest setPartition(java.util.Map<String, String> partition) {
        this.partition = partition;
        return this;
    }
    public java.util.Map<String, String> getPartition() {
        return this.partition;
    }

    public PublishRecallManagementTableRequest setSkipThresholdCheck(Boolean skipThresholdCheck) {
        this.skipThresholdCheck = skipThresholdCheck;
        return this;
    }
    public Boolean getSkipThresholdCheck() {
        return this.skipThresholdCheck;
    }

}
