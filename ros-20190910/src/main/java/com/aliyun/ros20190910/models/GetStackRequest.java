// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length,</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The option for returning logs. Valid values:</p>
     * <br>
     * <p>*   None: does not return logs.</p>
     * <p>*   Stack: returns the logs of the stack. This is the default value.</p>
     * <p>*   Resource: returns the logs of resources in the stack.</p>
     * <p>*   All: returns the logs of all resources.</p>
     */
    @NameInMap("LogOption")
    public String logOption;

    /**
     * <p>Specifies whether to return the output parameters of the stack. Valid values:</p>
     * <br>
     * <p>*   Enabled: returns the output parameters. This is the default value.</p>
     * <br>
     * <p>*   Disabled: does not return the output parameters.</p>
     * <br>
     * <p>> The system takes a long period of time to calculate output parameters. If you do not want to query the output parameters, we recommend that you set the OutputOption parameter to Disabled to improve the response speed of the GetStack operation.</p>
     */
    @NameInMap("OutputOption")
    public String outputOption;

    /**
     * <p>The ID of the region in which the stack resides. You can call the [DescribeRegions](~~131035~~) operation to query the most recent list of Alibaba Cloud regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return the ResourceProgress parameter. Valid values:</p>
     * <br>
     * <p>*   Disabled: does not return the ResourceProgress parameter. This is the default value.</p>
     * <br>
     * <p>*   EnabledIfCreateStack: returns the ResourceProgress parameter only if a stack is created.</p>
     * <br>
     * <p>> A stack is in one of the following states when it is created: CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, CREATE_ROLLBACK_IN_PROGRESS, CREATE_ROLLBACK_COMPLETE, or CREATE_ROLLBACK_FAILED.</p>
     */
    @NameInMap("ShowResourceProgress")
    public String showResourceProgress;

    /**
     * <p>The ID of the stack.</p>
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
