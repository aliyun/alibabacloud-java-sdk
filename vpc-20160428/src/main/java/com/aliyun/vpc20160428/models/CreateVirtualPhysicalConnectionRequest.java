// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The description of the hosted connection.</p>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Default value: 45104. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including required parameters, request syntax, and instance status. If the request fails the dry run, an error code is returned. If the request passes the dry run, <code>DRYRUN.SUCCESS</code> is returned.</li>
     * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the hosted connection.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The payer for the hosted connection. Valid values:</p>
     * <ul>
     * <li><strong>PayByPhysicalConnectionOwner</strong>: The partner pays for the hosted connection.</li>
     * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The tenant pays for the hosted connection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByVirtualPhysicalConnectionOwner</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The ID of the Express Connect circuit over which the hosted connection is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1ciz7ekd2grn1as****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the hosted connection belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzjty2chzuqky</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bandwidth value of the hosted connection.</p>
     * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
     * <blockquote>
     * <p> <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are unavailable by default. If you want to use these bandwidth values, contact your account manager.</p>
     * </blockquote>
     * <p><strong>M</strong> indicates Mbit/s and <strong>G</strong> indicates Gbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50M</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVirtualPhysicalConnectionRequestTag> tag;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944-8****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The virtual local area network (VLAN) ID of the hosted connection. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
     * <ul>
     * <li>If the VLAN ID is set to <strong>0</strong>, it indicates that the switch port of the virtual border router (VBR) is a Layer 3 router interface instead of a VLAN interface. When a Layer 3 router interface is used, each Express Connect circuit corresponds to a VBR.</li>
     * <li>If the VLAN ID is set to a value from <strong>1</strong> to <strong>2999</strong>, the switch port of the VBR is a Layer 3 VLAN subinterface. When a Layer 3 VLAN subinterface is used, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit with which the VBR is associated can be used to connect to virtual private clouds (VPCs) that belong to different Alibaba Cloud accounts. VBRs in different VLANs are isolated from each other at Layer 2.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("VlanId")
    public Long vlanId;

    /**
     * <p>The Alibaba Cloud account ID of the tenant.</p>
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
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The value must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
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
