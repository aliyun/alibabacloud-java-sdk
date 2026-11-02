// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The description of the shared Express Connect circuits.</p>
     * <p>The description must be 2 to 256 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only dry run the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system performs a dry run on the request without creating the shared Express Connect circuits. The system checks whether the required parameters are specified, the request format, and the instance status. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, <code>DRYRUN.SUCCESS</code> is returned.</li>
     * <li><strong>false</strong> (default): The system sends a Normal request. After the request passes the dry run, the shared Express Connect circuits are created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the shared Express Connect circuits.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies the payer of the shared Express Connect circuits. Valid values:</p>
     * <ul>
     * <li><strong>PayByPhysicalConnectionOwner</strong>: The partner pays the bills.</li>
     * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The tenant pays the bills.<blockquote>
     * <p>Default value: PayByVirtualPhysicalConnectionOwner. The tenant pays the bills.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByVirtualPhysicalConnectionOwner</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The ID of the Express Connect circuit associated with the shared Express Connect circuits.</p>
     * <blockquote>
     * <p>The Express Connect circuit must be in the Enabled state and must be a physical Express Connect circuit. You cannot specify the ID of a shared Express Connect circuit. Otherwise, the ResourceNotFound.PhysicalConnectionId or IncorrectStatus.PhysicalConnection error is returned. You can invoke the DescribePhysicalConnections operation to query the status of the Express Connect circuit. The caller must be the account (partner) to which the Express Connect circuit belongs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1ciz7ekd2grn1as****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the shared Express Connect circuits.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the shared Express Connect circuits belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzjty2chzuqky</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bandwidth of the shared Express Connect circuits.</p>
     * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>By default, the bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available. To use these values, contact your account manager.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>By default, the bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available. To use these values, contact your account manager.</p>
     * </blockquote>
     * <p>Unit: <strong>M</strong> indicates Mbit/s, and <strong>G</strong> indicates Gbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50M</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVirtualPhysicalConnectionRequestTag> tag;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944-8****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The VLAN ID of the shared Express Connect circuits. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
     * <ul>
     * <li>If the VLAN ID is <strong>0</strong>, the physical vSwitch port of the vRouter (Virtual Border Router) does not use the VLAN pattern, but uses the Layer 3 routing interface pattern. In the Layer 3 routing interface pattern, each Express Connect circuit corresponds to one VBR.</li>
     * <li>If the VLAN ID is <strong>1</strong> to <strong>2999</strong>, the physical vSwitch port of the VBR uses a VLAN-based Layer 3 sub-interface. In the Layer 3 sub-interface pattern, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit of the VBR can be connected to VPCs under multiple accounts. VBRs in different VLANs have Layer 2 network isolation and cannot communicate with each other.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("VlanId")
    public Long vlanId;

    /**
     * <p>The ID of the Alibaba Cloud account (primary account) of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("VpconnAliUid")
    public Long vpconnAliUid;

    public static CreateVirtualPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualPhysicalConnectionRequest self = new CreateVirtualPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualPhysicalConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVirtualPhysicalConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVirtualPhysicalConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVirtualPhysicalConnectionRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public CreateVirtualPhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreateVirtualPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualPhysicalConnectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVirtualPhysicalConnectionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateVirtualPhysicalConnectionRequest setTag(java.util.List<CreateVirtualPhysicalConnectionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVirtualPhysicalConnectionRequestTag> getTag() {
        return this.tag;
    }

    public CreateVirtualPhysicalConnectionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateVirtualPhysicalConnectionRequest setVlanId(Long vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Long getVlanId() {
        return this.vlanId;
    }

    public CreateVirtualPhysicalConnectionRequest setVpconnAliUid(Long vpconnAliUid) {
        this.vpconnAliUid = vpconnAliUid;
        return this;
    }
    public Long getVpconnAliUid() {
        return this.vpconnAliUid;
    }

    public static class CreateVirtualPhysicalConnectionRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVirtualPhysicalConnectionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualPhysicalConnectionRequestTag self = new CreateVirtualPhysicalConnectionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVirtualPhysicalConnectionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVirtualPhysicalConnectionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
