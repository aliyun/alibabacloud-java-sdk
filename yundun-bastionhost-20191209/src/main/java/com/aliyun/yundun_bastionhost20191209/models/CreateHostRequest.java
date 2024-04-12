// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostRequest extends TeaModel {
    /**
     * <p>The endpoint type of the host that you want to create. Valid values:</p>
     * <br>
     * <p>*   **Public**: public endpoint</p>
     * <p>*   **Private**: internal endpoint</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The description of the host that you want to create. The value can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the host that you want to create. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The internal endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.</p>
     * <br>
     * <p>> This parameter is required if the **ActiveAddressType** parameter is set to **Private**.</p>
     */
    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    /**
     * <p>The public endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.</p>
     * <br>
     * <p>> This parameter is required if the **ActiveAddressType** parameter is set to **Public**.</p>
     */
    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    /**
     * <p>The ID of the bastion host in which you want to create the host.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region to which the ECS instance or the host in an ApsaraDB MyBase dedicated cluster belongs.</p>
     * <br>
     * <p>> This parameter is required if the **Source** parameter is set to **Ecs** or **Rds**.</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The ID of the network domain to which the host belongs.</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The operating system of the host that you want to create. Valid values:</p>
     * <br>
     * <p>*   **Linux**</p>
     * <p>*   **Windows**</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The region ID of the bastion host in which you want to create the host.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the host that you want to create. Valid values:</p>
     * <br>
     * <p>*   **Local**: a host in a data center</p>
     * <p>*   **Ecs**: an Elastic Compute Service (ECS) instance</p>
     * <p>*   **Rds**: a host in an ApsaraDB MyBase dedicated cluster</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster.</p>
     * <br>
     * <p>> This parameter is required if the **Source** parameter is set to **Ecs** or **Rds**.</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    public static CreateHostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostRequest self = new CreateHostRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public CreateHostRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateHostRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateHostRequest setHostPrivateAddress(String hostPrivateAddress) {
        this.hostPrivateAddress = hostPrivateAddress;
        return this;
    }
    public String getHostPrivateAddress() {
        return this.hostPrivateAddress;
    }

    public CreateHostRequest setHostPublicAddress(String hostPublicAddress) {
        this.hostPublicAddress = hostPublicAddress;
        return this;
    }
    public String getHostPublicAddress() {
        return this.hostPublicAddress;
    }

    public CreateHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHostRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public CreateHostRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public CreateHostRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public CreateHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHostRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateHostRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

}
