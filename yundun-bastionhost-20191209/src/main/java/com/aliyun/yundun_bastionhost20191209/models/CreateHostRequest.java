// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostRequest extends TeaModel {
    /**
     * <p>The address type of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Public</strong>: a public address</p>
     * </li>
     * <li><p><strong>Private</strong>: a private address</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The comment for the host. The comment can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Local Host</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the host. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>host01</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The private address of the host. You can use a domain name or an IP address.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ActiveAddressType</strong> is set to <strong>Private</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    /**
     * <p>The public address of the host. You can use a domain name or an IP address.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ActiveAddressType</strong> is set to <strong>Public</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    /**
     * <p>The ID of the Bastionhost instance where you want to create the host.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1605494xxxx</p>
     */
    @NameInMap("InstanceMemberId")
    public Long instanceMemberId;

    /**
     * <p>The region ID of the ECS instance or the host in the dedicated cluster.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>Source</strong> is set to <strong>Ecs</strong> or <strong>Rds</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The ID of the network domain to which the host belongs.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains </a>operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The operating system of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Linux</strong></p>
     * </li>
     * <li><p><strong>Windows</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The region ID of the Bastionhost instance where you want to create the host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Local</strong>: a local host</p>
     * </li>
     * <li><p><strong>Ecs</strong>: an ECS instance</p>
     * </li>
     * <li><p><strong>Rds</strong>: a host in an ApsaraDB RDS dedicated cluster</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the ECS instance or the host in the dedicated cluster.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>Source</strong> is set to <strong>Ecs</strong> or <strong>Rds</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-dfabfda</p>
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

    public CreateHostRequest setInstanceMemberId(Long instanceMemberId) {
        this.instanceMemberId = instanceMemberId;
        return this;
    }
    public Long getInstanceMemberId() {
        return this.instanceMemberId;
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
