// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceIpWhitelistRequest extends TeaModel {
    /**
     * <p>The method that is used to modify the IP address whitelist. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): Uses the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter to <strong>overwrite</strong> the existing ones in the current whitelist.</li>
     * <li><strong>Append</strong>: <strong>Appends</strong> the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter to the current whitelist.</li>
     * <li><strong>Delete</strong>: <strong>Deletes</strong> the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter from the current whitelist. You must retain at least one IP address or CIDR block.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The idempotency token. The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.23.XXX.XXX</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    /**
     * <p>The IP address whitelist. Before you modify the IP address whitelist, call the DescribeInstanceIpWhitelist operation to query the existing IP address whitelist of the instance.</p>
     * <p><strong>Configuration rules</strong></p>
     * <ul>
     * <li>You can configure IP addresses (such as 10.23.XXX.XXX) or CIDR blocks (such as 10.23.XXX.XXX/24).</li>
     * <li>Separate multiple IP addresses or CIDR blocks with commas (,) and do not add spaces preceding or following the commas.</li>
     * <li>You can configure up to 1,000 IP addresses and CIDR blocks in total for each instance. If you want to add a large number of IP addresses, we recommend that you merge the IP addresses into CIDR blocks, such as 10.23.XXX.XXX/24.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceIpWhitelist</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceIpWhitelistRequest self = new ModifyInstanceIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceIpWhitelistRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceIpWhitelistRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyInstanceIpWhitelistRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceIpWhitelistRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public ModifyInstanceIpWhitelistRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyInstanceIpWhitelistRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
