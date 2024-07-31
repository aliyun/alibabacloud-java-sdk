// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandInvocationsRequest extends TeaModel {
    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>c-sh02yh0932w****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command name. If both CommandName and InstanceId are specified, CommandName does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch command, applicable to Windows instances</li>
     * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances</li>
     * <li>RunShellScript: shell command, applicable to Linux instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunPowerShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The ID of the simple application server.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The overall execution state of the command. The value of this parameter depends on the execution status of the command on all the involved instances. Valid values:</p>
     * <ul>
     * <li><p>Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
     * </li>
     * <li><p>Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
     * </li>
     * <li><p>Success: When the execution state on at least one instance is Success and the execution state on other instances is Stopped or Success, the overall execution state is Success.</p>
     * <ul>
     * <li>Command that is set to run immediately: The command execution is complete, and the exit code is 0.</li>
     * </ul>
     * </li>
     * <li><p>Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:</p>
     * <ul>
     * <li>Invalid: The command is invalid.</li>
     * <li>Aborted: The command fails to be sent.</li>
     * <li>Failed: The command execution is complete, and the exit code is not 0.</li>
     * <li>Timeout: The command execution times out.</li>
     * <li>Error: An error occurs when the command is being run.</li>
     * </ul>
     * </li>
     * <li><p>Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</p>
     * </li>
     * <li><p>Stopped: The command task is stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:</p>
     * <ul>
     * <li>Cancelled: The command task is canceled.</li>
     * <li>Terminated: The command task is terminated.</li>
     * </ul>
     * </li>
     * <li><p>PartialFailed: The command execution succeeds on some instances and fails on other instances. When the execution state on some instances is Success and the execution state on other instances is Failed or Stopped, the overall execution state is PartialFailed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> The value of the <code>InvokeStatus</code> response parameter is similar to the value of InvocationStatus. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("InvocationStatus")
    public String invocationStatus;

    /**
     * <p>The execution ID of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz02p9545t6****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCommandInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandInvocationsRequest self = new DescribeCommandInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommandInvocationsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeCommandInvocationsRequest setCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }
    public String getCommandName() {
        return this.commandName;
    }

    public DescribeCommandInvocationsRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public DescribeCommandInvocationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCommandInvocationsRequest setInvocationStatus(String invocationStatus) {
        this.invocationStatus = invocationStatus;
        return this;
    }
    public String getInvocationStatus() {
        return this.invocationStatus;
    }

    public DescribeCommandInvocationsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeCommandInvocationsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandInvocationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandInvocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
