// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteAccessLogsDownloadAttributeRequest extends TeaModel {
    /**
     * <p>The CLB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The access log forwarding rule. Parameters:</p>
     * <br>
     * <p>*   **LogProject**: the name of the project of Log Service.</p>
     * <p>*   **LogStore**: the name of the Logstore of Log Service.</p>
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
     * <p>The region ID of the CLB instance.</p>
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
     */
    @NameInMap("Tags")
    public String tags;

    public static DeleteAccessLogsDownloadAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessLogsDownloadAttributeRequest self = new DeleteAccessLogsDownloadAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessLogsDownloadAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DeleteAccessLogsDownloadAttributeRequest setLogsDownloadAttributes(String logsDownloadAttributes) {
        this.logsDownloadAttributes = logsDownloadAttributes;
        return this;
    }
    public String getLogsDownloadAttributes() {
        return this.logsDownloadAttributes;
    }

    public DeleteAccessLogsDownloadAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteAccessLogsDownloadAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAccessLogsDownloadAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAccessLogsDownloadAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAccessLogsDownloadAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAccessLogsDownloadAttributeRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
