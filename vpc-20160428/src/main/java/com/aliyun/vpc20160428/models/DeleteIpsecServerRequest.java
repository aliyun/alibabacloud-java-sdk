// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpsecServerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("callerBid")
    public String callerBid;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsecServerRequest self = new DeleteIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpsecServerRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public DeleteIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpsecServerRequest setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public DeleteIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public DeleteIpsecServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
