// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterServerlessConfResponseBody extends TeaModel {
    @NameInMap("AgileScaleMax")
    public String agileScaleMax;

    /**
     * <p>Whether to enable idle shutdown. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable</p>
     * </li>
     * <li><p><strong>false</strong>: Disable (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    /**
     * <p>Serverless cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of read-only column store nodes. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMax")
    public String scaleApRoNumMax;

    /**
     * <p>The minimum number of read-only column store nodes. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMin")
    public String scaleApRoNumMin;

    /**
     * <p>Maximum scaling limit for a single node. Range: 1 PCU~32 PCU.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>Minimum scaling limit for a single node. Range: 1 PCU~31 PCU.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>Maximum scaling limit for the number of read-only nodes. Range: 0~15.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>Minimum scaling limit for the number of read-only nodes. Range: 0~15.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>Detection duration for idle shutdown. Range: 300~86,400. Unit: seconds. The detection duration must be a multiple of 300 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SecondsUntilAutoPause")
    public String secondsUntilAutoPause;

    /**
     * <p>CPU upscale threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ServerlessRuleCpuEnlargeThreshold")
    public String serverlessRuleCpuEnlargeThreshold;

    /**
     * <p>CPU downscale threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ServerlessRuleCpuShrinkThreshold")
    public String serverlessRuleCpuShrinkThreshold;

    /**
     * <p>Elasticity sensitivity. Values:</p>
     * <ul>
     * <li><p>normal: Standard</p>
     * </li>
     * <li><p>flexible: Sensitive</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ServerlessRuleMode")
    public String serverlessRuleMode;

    /**
     * <p>Whether steady state is enabled. Values:</p>
     * <p>1: Enabled</p>
     * <p>0: Disabled</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Switchs")
    public String switchs;

    @NameInMap("TraditionalScaleMaxThreshold")
    public String traditionalScaleMaxThreshold;

    public static DescribeDBClusterServerlessConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterServerlessConfResponseBody self = new DescribeDBClusterServerlessConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterServerlessConfResponseBody setAgileScaleMax(String agileScaleMax) {
        this.agileScaleMax = agileScaleMax;
        return this;
    }
    public String getAgileScaleMax() {
        return this.agileScaleMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setAllowShutDown(String allowShutDown) {
        this.allowShutDown = allowShutDown;
        return this;
    }
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    public DescribeDBClusterServerlessConfResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterServerlessConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleApRoNumMax(String scaleApRoNumMax) {
        this.scaleApRoNumMax = scaleApRoNumMax;
        return this;
    }
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleApRoNumMin(String scaleApRoNumMin) {
        this.scaleApRoNumMin = scaleApRoNumMin;
        return this;
    }
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public DescribeDBClusterServerlessConfResponseBody setSecondsUntilAutoPause(String secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    public DescribeDBClusterServerlessConfResponseBody setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
        this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
        return this;
    }
    public String getServerlessRuleCpuEnlargeThreshold() {
        return this.serverlessRuleCpuEnlargeThreshold;
    }

    public DescribeDBClusterServerlessConfResponseBody setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
        this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
        return this;
    }
    public String getServerlessRuleCpuShrinkThreshold() {
        return this.serverlessRuleCpuShrinkThreshold;
    }

    public DescribeDBClusterServerlessConfResponseBody setServerlessRuleMode(String serverlessRuleMode) {
        this.serverlessRuleMode = serverlessRuleMode;
        return this;
    }
    public String getServerlessRuleMode() {
        return this.serverlessRuleMode;
    }

    public DescribeDBClusterServerlessConfResponseBody setSwitchs(String switchs) {
        this.switchs = switchs;
        return this;
    }
    public String getSwitchs() {
        return this.switchs;
    }

    public DescribeDBClusterServerlessConfResponseBody setTraditionalScaleMaxThreshold(String traditionalScaleMaxThreshold) {
        this.traditionalScaleMaxThreshold = traditionalScaleMaxThreshold;
        return this;
    }
    public String getTraditionalScaleMaxThreshold() {
        return this.traditionalScaleMaxThreshold;
    }

}
