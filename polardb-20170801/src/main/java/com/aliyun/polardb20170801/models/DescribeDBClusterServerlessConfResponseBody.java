// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterServerlessConfResponseBody extends TeaModel {
    @NameInMap("AgileScaleMax")
    public String agileScaleMax;

    /**
     * <p>Indicates whether the no-activity suspension feature is enabled. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    /**
     * <p>The ID of the serverless cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleApRoNumMax")
    public String scaleApRoNumMax;

    @NameInMap("ScaleApRoNumMin")
    public String scaleApRoNumMin;

    /**
     * <p>The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The detection period for no-activity suspension. Valid values: 300 to 86400. Unit: seconds. The value must be a multiple of 300.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SecondsUntilAutoPause")
    public String secondsUntilAutoPause;

    @NameInMap("ServerlessRuleCpuEnlargeThreshold")
    public String serverlessRuleCpuEnlargeThreshold;

    @NameInMap("ServerlessRuleCpuShrinkThreshold")
    public String serverlessRuleCpuShrinkThreshold;

    @NameInMap("ServerlessRuleMode")
    public String serverlessRuleMode;

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
