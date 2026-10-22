// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeRequest extends TeaModel {
    /**
     * <p>The new endpoint type of the host. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong>: Internet</li>
     * <li><strong>Private</strong>: private network</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    /**
     * <p>The IDs of the hosts whose endpoint types you want to modify. The value is a character string in JSON format. You can specify up to 100 host IDs.
     * You can invoke the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;]</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The instance ID of the Bastionhost instance to which the host whose endpoint type you want to modify belongs.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The area ID of the Bastionhost instance to which the host whose endpoint type you want to modify belongs.</p>
     * <blockquote>
     * <p>For more information about the mapping between area IDs and area names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and active zones</a>.</p>
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

    public ModifyHostsActiveAddressTypeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyHostsActiveAddressTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
