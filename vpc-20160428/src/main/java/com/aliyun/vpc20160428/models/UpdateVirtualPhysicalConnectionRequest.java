// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The VLAN ID of the hosted connection is not changed. The system checks the required parameters, request syntax, and instance status. If the check fails, the corresponding error message is returned. If the request passes the check, the system returns the ID of the request.</p>
     * <p>*   **false** (default): sends the request. If the request passes the check, the VLAN ID of the hosted connection is changed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The estimated bandwidth value of the hosted connection. The estimated bandwidth value takes effect after the payment is completed.</p>
     * <br>
     * <p>Valid values: **50M**, **100M**, **200M**, **300M**, **400M**, **500M**, **1G**, **2G**, **5G**, **8G**, and **10G**.</p>
     * <br>
     * <p>>  By default, the values of **2G**, **5G**, **8G**, and **10G** are unavailable. If you want to specify these values, contact your customer manager.</p>
     * <br>
     * <p>**M** indicates Mbit/s and **G** indicates Gbit/s.</p>
     */
    @NameInMap("ExpectSpec")
    public String expectSpec;

    /**
     * <p>The ID of the shared Express Connect circuit.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses **RequestId** as **ClientToken**. The value of **RequestId** in each API request may be different.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The VLAN ID of the hosted connection. Valid values: **0** to **2999**.</p>
     * <br>
     * <p>*   If the VLAN ID is set to **0**, it indicates that the switch port of the virtual border router (VBR) is a Layer 3 router interface instead of a VLAN interface. When a Layer 3 router interface is used, each Express Connect circuit corresponds to a VBR.</p>
     * <p>*   If the VLAN ID is set to a value from **1** to **2999**, the switch port of the VBR is a Layer 3 VLAN subinterface. When a Layer 3 VLAN subinterface is used, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit with which the VBR is associated can be used to connect to VPCs that belong to different Alibaba Cloud accounts. VBRs in different VLANs are isolated from each other at Layer 2.</p>
     */
    @NameInMap("VlanId")
    public Long vlanId;

    public static UpdateVirtualPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualPhysicalConnectionRequest self = new UpdateVirtualPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualPhysicalConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVirtualPhysicalConnectionRequest setExpectSpec(String expectSpec) {
        this.expectSpec = expectSpec;
        return this;
    }
    public String getExpectSpec() {
        return this.expectSpec;
    }

    public UpdateVirtualPhysicalConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVirtualPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVirtualPhysicalConnectionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateVirtualPhysicalConnectionRequest setVlanId(Long vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Long getVlanId() {
        return this.vlanId;
    }

}
