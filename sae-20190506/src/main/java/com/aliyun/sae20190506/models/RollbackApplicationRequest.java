// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to automatically enable an auto scaling policy for the application. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: turns on Logon-free Sharing</p>
     * <p>*   **false**: turns off Logon-free Sharing</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public String autoEnableApplicationScalingRule;

    /**
     * <p>The wait time between batches. Unit: seconds.</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
     * <br>
     * <p>*   If you set the value to **-1**, the minimum number of available instances is not determined based on this parameter. Default value: -1.</p>
     * <p>*   If you set the value to a number **from 0 to 100**, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to **50**% and five instances are available, the minimum number of available instances is 3.</p>
     * <br>
     * <p>> When both **MinReadyInstance** and **MinReadyInstanceRatio** are specified and **MinReadyInstanceRatio** is set to a number from 0 to 100, the value of **MinReadyInstanceRatio** takes precedence.** For example, if **MinReadyInstances** is set to **5, and **MinReadyInstanceRatio** is set to **50**, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × **50%**.</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of available instances. Take note of the following rules:</p>
     * <br>
     * <p>*   If you set the value to **0**, business interruptions occur when the application is updated.</p>
     * <p>*   If you set the value to \\*\\*-1\\*\\*, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</p>
     * <br>
     * <p>> Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>The deployment policy. If the minimum number of available instances is 1, the value of the **UpdateStrategy** parameter is an empty string (""). If the minimum number of available instances is larger than 1, specify this parameter based on your requirements. Examples:</p>
     * <br>
     * <p>*   Perform canary release for one instance and release the remaining instances in two batches automatically with a one-minute interval between the deployment of each instance:</p>
     * <br>
     * <p>    `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`</p>
     * <br>
     * <p>*   Perform canary release for one instance and release the remaining instances in two batches manually:</p>
     * <br>
     * <p>    `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`</p>
     * <br>
     * <p>*   Release the instances in two batches automatically with no interval between the deployment of each instance:</p>
     * <br>
     * <p>    `{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`</p>
     * <br>
     * <p>The following table describes the parameters that are used in the preceding statements.</p>
     * <br>
     * <p>*   **type**: the type of the release policy. Valid values: **GrayBatchUpdate** and **BatchUpdate**.</p>
     * <br>
     * <p>*   **batchUpdate**: the phased release policy.</p>
     * <br>
     * <p>    *   **batch**: the number of release batches.</p>
     * <p>    *   **releaseType**: the processing method for the batches. Valid values: **auto** and **manual**.</p>
     * <p>    *   **batchWaitTime**: the interval between release batches. Unit: seconds.</p>
     * <br>
     * <p>*   **grayUpdate**: the number of release batches in the phased release after a canary release. This parameter is returned only if the **type** parameter is set to **GrayBatchUpdate**.</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The ID of the application version. Call the [ListAppVersions](https://help.aliyun.com/document_detail/162054.html) operation to obtain the version ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setAutoEnableApplicationScalingRule(String autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public String getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public RollbackApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public RollbackApplicationRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public RollbackApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public RollbackApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public RollbackApplicationRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
