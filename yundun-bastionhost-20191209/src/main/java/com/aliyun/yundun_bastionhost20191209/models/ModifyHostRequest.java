// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostRequest extends TeaModel {
    /**
     * <p>The new description of the host. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Host for test.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the host to be updated.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The new name of the host. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestHost</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The new private network address of the host. You can specify a domain name or an IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>193.168.XX.XX</p>
     */
    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    /**
     * <p>The new public address of the host. You can specify a domain name or an IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>200.1.XX.XX</p>
     */
    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    /**
     * <p>The ID of the Bastionhost instance to which the host belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the network domain to which the host belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The new operating system type of the host. Valid values:</p>
     * <ul>
     * <li><strong>Linux</strong></li>
     * <li><strong>Windows</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The preferred key exchange algorithm for the host. You can modify this parameter only when the OSType parameter is set to Linux. Valid values: </p>
     * <ul>
     * <li><strong>default</strong>: Default mode.</li>
     * <li><strong>diffie-hellman-group1-sha1</strong>: Compatibility mode for the diffie-hellman-group1-sha1 algorithm.</li>
     * <li><strong>diffie-hellman-group14-sha1</strong>: Compatibility mode for the diffie-hellman-group14-sha1 algorithm.</li>
     * <li><strong>diffie-hellman-group-exchange-sha1</strong>: Compatibility mode for the diffie-hellman-group-exchange-sha1 algorithm.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PrefKex")
    public String prefKex;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance to which the host belongs.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostRequest self = new ModifyHostRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyHostRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ModifyHostRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyHostRequest setHostPrivateAddress(String hostPrivateAddress) {
        this.hostPrivateAddress = hostPrivateAddress;
        return this;
    }
    public String getHostPrivateAddress() {
        return this.hostPrivateAddress;
    }

    public ModifyHostRequest setHostPublicAddress(String hostPublicAddress) {
        this.hostPublicAddress = hostPublicAddress;
        return this;
    }
    public String getHostPublicAddress() {
        return this.hostPublicAddress;
    }

    public ModifyHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ModifyHostRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ModifyHostRequest setPrefKex(String prefKex) {
        this.prefKex = prefKex;
        return this;
    }
    public String getPrefKex() {
        return this.prefKex;
    }

    public ModifyHostRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
