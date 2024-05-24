// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessLogsDownloadAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The access log forwarding rule. Parameters:</p>
     * <br>
     * <p>*   **LogProject**: the name of the project.</p>
     * <p>*   **LogStore**: the name of the Logstore.</p>
     * <p>*   **LoadBalancerId**: the ID of the CLB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogsDownloadAttributes")
    public String logsDownloadAttributes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/27584.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that are added to the CLB instance. The tags must be key-value pairs that are contained in a JSON dictionary.</p>
     * <br>
     * <p>You can specify up to 10 tags in each call.</p>
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
