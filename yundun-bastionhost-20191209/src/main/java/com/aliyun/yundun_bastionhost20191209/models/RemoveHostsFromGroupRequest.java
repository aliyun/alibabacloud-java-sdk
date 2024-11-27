// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupRequest extends TeaModel {
    /**
     * <p>The ID of the asset group from which you want to remove hosts.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query the asset group ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The IDs of the hosts that you want to remove from the host group. Specify a JSON string. You can specify up to 100 host IDs.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the host IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the bastion host whose asset group you want to manage.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host whose asset group you want to manage.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveHostsFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupRequest self = new RemoveHostsFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public RemoveHostsFromGroupRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public RemoveHostsFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveHostsFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
