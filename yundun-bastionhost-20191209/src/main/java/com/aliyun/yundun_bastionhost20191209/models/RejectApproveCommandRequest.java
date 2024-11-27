// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectApproveCommandRequest extends TeaModel {
    /**
     * <p>The ID of the command that you want to reject.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2584310.html">ListApproveCommands</a> operation to query the IDs of all commands that need to be reviewed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>574</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the bastion host.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
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

    public static RejectApproveCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectApproveCommandRequest self = new RejectApproveCommandRequest();
        return TeaModel.build(map, self);
    }

    public RejectApproveCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public RejectApproveCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectApproveCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
