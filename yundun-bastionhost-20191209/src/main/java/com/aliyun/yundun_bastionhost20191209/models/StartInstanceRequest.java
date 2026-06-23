// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <p>The IDs of the security groups for the endpoint that is used to access the bastion host over a private network.</p>
     */
    @NameInMap("ClientSecurityGroupIds")
    public java.util.List<String> clientSecurityGroupIds;

    /**
     * <p>Specifies whether to enable the O\&amp;M portal of the bastion host to be accessed over a private network.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePortalPrivateAccess")
    public Boolean enablePortalPrivateAccess;

    /**
     * <p>The ID of the bastion host to start.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the security groups to which the bastion host is bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1aiupc4yjqgmm****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The ID of the secondary vSwitch to which the bastion host is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-9dpspfku7gita****</p>
     */
    @NameInMap("SlaveVswitchId")
    public String slaveVswitchId;

    /**
     * <p>The ID of the vSwitch to which the bastion host is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1xfwzzfti0kjbf****</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setClientSecurityGroupIds(java.util.List<String> clientSecurityGroupIds) {
        this.clientSecurityGroupIds = clientSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getClientSecurityGroupIds() {
        return this.clientSecurityGroupIds;
    }

    public StartInstanceRequest setEnablePortalPrivateAccess(Boolean enablePortalPrivateAccess) {
        this.enablePortalPrivateAccess = enablePortalPrivateAccess;
        return this;
    }
    public Boolean getEnablePortalPrivateAccess() {
        return this.enablePortalPrivateAccess;
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstanceRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public StartInstanceRequest setSlaveVswitchId(String slaveVswitchId) {
        this.slaveVswitchId = slaveVswitchId;
        return this;
    }
    public String getSlaveVswitchId() {
        return this.slaveVswitchId;
    }

    public StartInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
