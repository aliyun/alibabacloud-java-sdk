// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessLogsDownloadAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1b6c719dfa08ex*****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The access log forwarding rule. Parameters:</p>
     * <ul>
     * <li><strong>LogProject</strong>: the name of the project of Simple Log Service.</li>
     * <li><strong>LogStore</strong>: the name of the Logstore of Simple Log Service.</li>
     * <li><strong>LoadBalancerId</strong>: the ID of the CLB instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logProject&quot;:&quot;my-project&quot;, &quot;LogStore&quot;:&quot;my-log-store&quot;, &quot;LoadBalancerId&quot;:&quot;lb-uf68ps3rekbljmdb0****&quot;}]</p>
     */
    @NameInMap("LogsDownloadAttributes")
    public String logsDownloadAttributes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that are added to the CLB instance. The tags must be key-value pairs that are contained in a JSON dictionary.</p>
     * <p>You can specify up to 10 tags in each call.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey&quot;:&quot;Key1&quot;,&quot;tagValue&quot;:&quot;Value1&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static SetAccessLogsDownloadAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessLogsDownloadAttributeRequest self = new SetAccessLogsDownloadAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessLogsDownloadAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetAccessLogsDownloadAttributeRequest setLogsDownloadAttributes(String logsDownloadAttributes) {
        this.logsDownloadAttributes = logsDownloadAttributes;
        return this;
    }
    public String getLogsDownloadAttributes() {
        return this.logsDownloadAttributes;
    }

    public SetAccessLogsDownloadAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetAccessLogsDownloadAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetAccessLogsDownloadAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetAccessLogsDownloadAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetAccessLogsDownloadAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetAccessLogsDownloadAttributeRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
