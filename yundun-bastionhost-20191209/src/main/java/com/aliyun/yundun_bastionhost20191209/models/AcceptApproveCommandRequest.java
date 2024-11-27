// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptApproveCommandRequest extends TeaModel {
    /**
     * <p>The ID of the command that you want to approve.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2584310.html">ListApproveCommands</a> operation to query the IDs of all commands that need to be reviewed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the bastion host.</p>
     * <blockquote>
     * <p> You can call the DescribeInstances operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AcceptApproveCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptApproveCommandRequest self = new AcceptApproveCommandRequest();
        return TeaModel.build(map, self);
    }

    public AcceptApproveCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public AcceptApproveCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AcceptApproveCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
