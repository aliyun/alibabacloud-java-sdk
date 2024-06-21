// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackGroupDriftShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <p>The value can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The operation settings, in JSON format. The following fields are supported:</p>
     * <ul>
     * <li>FailureToleranceCount</li>
     * </ul>
     * <p>The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails.</p>
     * <p>If FailureToleranceCount is not specified, the default value 0 is used. You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
     * <p>Valid values: 0 to 20.</p>
     * <ul>
     * <li>FailureTolerancePercentage</li>
     * </ul>
     * <p>The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails.</p>
     * <p>You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
     * <p>Valid values: 0 to 100.</p>
     * <ul>
     * <li>MaxConcurrentCount</li>
     * </ul>
     * <p>The maximum number of target accounts in which a drift detection operation can be performed at a time.</p>
     * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
     * <p>Valid values: 1 to 20.</p>
     * <ul>
     * <li>MaxConcurrentPercentage</li>
     * </ul>
     * <p>The maximum percentage of target accounts in which a drift detection operation can be performed at a time.</p>
     * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
     * <p>Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1, &quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>The region ID of the stack group. You can call the <a href="~~131035#doc-api-ROS-DescribeRegions~~" title="Queries the DescribeRegions list of a region.">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static DetectStackGroupDriftShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackGroupDriftShrinkRequest self = new DetectStackGroupDriftShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectStackGroupDriftShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetectStackGroupDriftShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public DetectStackGroupDriftShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetectStackGroupDriftShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
