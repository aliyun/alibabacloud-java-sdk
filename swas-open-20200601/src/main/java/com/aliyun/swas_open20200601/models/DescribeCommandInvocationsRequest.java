// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandInvocationsRequest extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("CommandName")
    public String commandName;

    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvocationStatus")
    public String invocationStatus;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

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
