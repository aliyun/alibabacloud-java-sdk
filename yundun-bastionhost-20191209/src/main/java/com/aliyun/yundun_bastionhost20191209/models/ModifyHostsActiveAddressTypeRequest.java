// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeRequest extends TeaModel {
    /**
     * <p>The new portal type of the host. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong>: public portal</li>
     * <li><strong>Private</strong>: internal portal</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The ID of the host for which you want to change the portal type. The value is a JSON string. You can add up to 100 host IDs.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the ID of the host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;]</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the bastion host for which you want to change the portal type of the host.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host for which you want to change the portal type of the host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostsActiveAddressTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsActiveAddressTypeRequest self = new ModifyHostsActiveAddressTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostsActiveAddressTypeRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public ModifyHostsActiveAddressTypeRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public ModifyHostsActiveAddressTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostsActiveAddressTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
