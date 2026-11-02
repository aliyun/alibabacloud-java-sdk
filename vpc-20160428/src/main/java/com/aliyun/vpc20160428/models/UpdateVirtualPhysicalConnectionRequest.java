// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to only perform a dry run for the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system performs a dry run without modifying the VLAN ID of the shared Express Connect circuit. The system checks whether the required parameters are specified, the request format, and the instance status. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the corresponding request ID is returned.</li>
     * <li><strong>false</strong> (default): The system sends a normal request. After the request passes the dry run, the VLAN ID of the shared Express Connect circuit is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The expected bandwidth of the shared Express Connect circuit. The bandwidth takes effect only after the payment is completed.</p>
     * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>The bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
     * </blockquote>
     * <p>Unit: <strong>M</strong> indicates Mbps, and <strong>G</strong> indicates Gbps.</p>
     * 
     * <strong>example:</strong>
     * <p>50M</p>
     */
    @NameInMap("ExpectSpec")
    public String expectSpec;

    /**
     * <p>The instance ID of the shared Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1mrgfbtmc9brre7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the shared Express Connect circuit.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944-8****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The VLAN ID of the shared Express Connect circuit. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
     * <ul>
     * <li>A value of <strong>0</strong> specifies that the physical vSwitch port of the Virtual Border Router (VBR), which acts as a vRouter, does not use the VLAN mode, but uses the Layer 3 routing interface mode. In the Layer 3 routing interface mode, each Express Connect circuit corresponds to one VBR.</li>
     * <li>A value of <strong>1</strong> to <strong>2999</strong> specifies that the physical vSwitch port of the VBR uses a VLAN-based Layer 3 subinterface. In the Layer 3 subinterface mode, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit of the VBR can be used to connect VPCs that belong to different Alibaba Cloud accounts. Layer 2 network isolation is implemented for VBRs in different VLANs, and they cannot communicate with each other.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
