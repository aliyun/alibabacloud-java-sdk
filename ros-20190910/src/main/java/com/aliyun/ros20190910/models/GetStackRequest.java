// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\\</p>
     * <p>The token can be up to 64 characters in length.\\</p>
     * <p>For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/134212.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The option for returning logs. Valid values:</p>
     * <br>
     * <p>*   None: does not return logs.</p>
     * <p>*   Stack (default): returns the logs of the stack.</p>
     * <p>*   Resource: returns the logs of resources in the stack.</p>
     * <p>*   All: returns all logs.</p>
     */
    @NameInMap("LogOption")
    public String logOption;

    /**
     * <p>Specifies whether to return Outputs. Valid values:</p>
     * <br>
     * <p>*   Enabled (default)</p>
     * <p>*   Disabled</p>
     * <br>
     * <p>>  The Outputs parameter requires a long period of time to calculate. If you do not require Outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the GetStack operation.</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return information about ResourceProgress. Valid values:</p>
     * <br>
     * <p>*   Disabled (default): does not return information about ResourceProgress.</p>
     * <p>*   PercentageOnly: returns StackOperationProgress and StackActionProgress of ResourceProgress.</p>
     * <br>
     * <p>>  ROS and Terraform stacks are supported. Creation, resumed creation, update, deletion, import, and rollback operations on stacks are supported.</p>
     * <br>
     * <p>*   EnabledIfCreateStack (not recommend): returns \\*Count and InProgressResourceDetails of ResourceProgress only during a stack creation operation.</p>
     * <br>
     * <p>>  During a creation operation, a stack is in one of the following states: CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, CREATE_ROLLBACK_IN_PROGRESS, CREATE_ROLLBACK_COMPLETE, and CREATE_ROLLBACK_FAILED.</p>
     */
    @NameInMap("ShowResourceProgress")
    public String showResourceProgress;

    /**
     * <p>The stack ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static GetStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackRequest self = new GetStackRequest();
        return TeaModel.build(map, self);
    }

    public GetStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStackRequest setLogOption(String logOption) {
        this.logOption = logOption;
        return this;
    }
    public String getLogOption() {
        return this.logOption;
    }

    public GetStackRequest setOutputOption(String outputOption) {
        this.outputOption = outputOption;
        return this;
    }
    public String getOutputOption() {
        return this.outputOption;
    }

    public GetStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackRequest setShowResourceProgress(String showResourceProgress) {
        this.showResourceProgress = showResourceProgress;
        return this;
    }
    public String getShowResourceProgress() {
        return this.showResourceProgress;
    }

    public GetStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
