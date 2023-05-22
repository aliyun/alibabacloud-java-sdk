// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The hosted connection is not created. The system checks the required parameters, request syntax, and instance status. If the request fails the check, an error message is returned. If the request passes the check, `DRYRUN.SUCCESS` is returned.</p>
     * <p>*   **false**: sends the request. If the request passes the check, the hosted connection is created. This is the default value.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The bandwidth value of the hosted connection.</p>
     * <br>
     * <p>Valid values: **50M**, **100M**, **200M**, **300M**, **400M**, **500M**, **1G**, **2G**, **5G**, **8G**, and **10G**.</p>
     * <br>
     * <p>>  By default, the values of **2G**, **5G**, **8G**, and **10G** are unavailable. If you want to specify these values, contact your customer manager.</p>
     * <br>
     * <p>**M** indicates Mbit/s, and **G** indicates Gbit/s.</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically sets **ClientToken** to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The ID of the hosted connection.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the Express Connect circuit over which the hosted connection is created.</p>
     */
    @NameInMap("Spec")
    public String spec;

    @NameInMap("Tag")
    public java.util.List<CreateVirtualPhysicalConnectionRequestTag> tag;

    /**
     * <p>The description of the hosted connection.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The Alibaba Cloud account ID of the tenant.</p>
     */
    @NameInMap("VlanId")
    public Long vlanId;

    /**
     * <p>The name of the hosted connection.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
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
        @NameInMap("Key")
        public String key;

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
