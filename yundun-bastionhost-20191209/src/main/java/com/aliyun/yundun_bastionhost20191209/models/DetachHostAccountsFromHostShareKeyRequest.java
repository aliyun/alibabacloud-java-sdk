// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromHostShareKeyRequest extends TeaModel {
    /**
     * <p>The host account IDs.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/462975.html">ListHostAccountsForHostShareKey</a> operation to query the host account IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("HostAccountIds")
    public String hostAccountIds;

    /**
     * <p>The shared key ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/462973.html">ListHostShareKeys</a> operation to query the shared key ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The bastion host ID.</p>
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
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachHostAccountsFromHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromHostShareKeyRequest self = new DetachHostAccountsFromHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromHostShareKeyRequest setHostAccountIds(String hostAccountIds) {
        this.hostAccountIds = hostAccountIds;
        return this;
    }
    public String getHostAccountIds() {
        return this.hostAccountIds;
    }

    public DetachHostAccountsFromHostShareKeyRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public DetachHostAccountsFromHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachHostAccountsFromHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
