// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackGroupDriftRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>The value can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/134212.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The operation settings, in JSON format. The following fields are supported:</p>
     * <br>
     * <p>*   FailureToleranceCount</p>
     * <br>
     * <p>The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails.</p>
     * <br>
     * <p>If FailureToleranceCount is not specified, the default value 0 is used. You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
     * <br>
     * <p>Valid values: 0 to 20.</p>
     * <br>
     * <p>*   FailureTolerancePercentage</p>
     * <br>
     * <p>The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails.</p>
     * <br>
     * <p>You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
     * <br>
     * <p>Valid values: 0 to 100.</p>
     * <br>
     * <p>*   MaxConcurrentCount</p>
     * <br>
     * <p>The maximum number of target accounts in which a drift detection operation can be performed at a time.</p>
     * <br>
     * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
     * <br>
     * <p>Valid values: 1 to 20.</p>
     * <br>
     * <p>*   MaxConcurrentPercentage</p>
     * <br>
     * <p>The maximum percentage of target accounts in which a drift detection operation can be performed at a time.</p>
     * <br>
     * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](~~131035#doc-api-ROS-DescribeRegions~~ "Queries the DescribeRegions list of a region.") operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static DetectStackGroupDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackGroupDriftRequest self = new DetectStackGroupDriftRequest();
        return TeaModel.build(map, self);
    }

    public DetectStackGroupDriftRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetectStackGroupDriftRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public DetectStackGroupDriftRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetectStackGroupDriftRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
