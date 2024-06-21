// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\
     * The token can be up to 64 characters in length.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The option for returning logs. Valid values:</p>
     * <ul>
     * <li>None: does not return logs.</li>
     * <li>Stack (default): returns the logs of the stack.</li>
     * <li>Resource: returns the logs of resources in the stack.</li>
     * <li>All: returns all logs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("LogOption")
    public String logOption;

    /**
     * <p>Specifies whether to return Outputs. Valid values:</p>
     * <ul>
     * <li>Enabled (default)</li>
     * <li>Disabled</li>
     * </ul>
     * <blockquote>
     * <p> The Outputs parameter requires a long period of time to calculate. If you do not require Outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the GetStack operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return information about ResourceProgress. Valid values:</p>
     * <ul>
     * <li>Disabled (default): does not return information about ResourceProgress.</li>
     * <li>PercentageOnly: returns StackOperationProgress and StackActionProgress of ResourceProgress.</li>
     * </ul>
     * <blockquote>
     * <p> ROS and Terraform stacks are supported. Creation, resumed creation, update, deletion, import, and rollback operations on stacks are supported.</p>
     * </blockquote>
     * <ul>
     * <li>EnabledIfCreateStack (not recommend): returns \*Count and InProgressResourceDetails of ResourceProgress only during a stack creation operation.</li>
     * </ul>
     * <blockquote>
     * <p> During a creation operation, a stack is in one of the following states: CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, CREATE_ROLLBACK_IN_PROGRESS, CREATE_ROLLBACK_COMPLETE, and CREATE_ROLLBACK_FAILED.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("ShowResourceProgress")
    public String showResourceProgress;

    /**
     * <p>The stack ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
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
