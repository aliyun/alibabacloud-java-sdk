// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCDNStatisSumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndStatisTime")
    public String endStatisTime;

    @NameInMap("Level")
    public String level;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartStatisTime")
    public String startStatisTime;

    public static GetCDNStatisSumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisSumRequest self = new GetCDNStatisSumRequest();
        return TeaModel.build(map, self);
    }

    public GetCDNStatisSumRequest setEndStatisTime(String endStatisTime) {
        this.endStatisTime = endStatisTime;
        return this;
    }
    public String getEndStatisTime() {
        return this.endStatisTime;
    }

    public GetCDNStatisSumRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetCDNStatisSumRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetCDNStatisSumRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetCDNStatisSumRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetCDNStatisSumRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetCDNStatisSumRequest setStartStatisTime(String startStatisTime) {
        this.startStatisTime = startStatisTime;
        return this;
    }
    public String getStartStatisTime() {
        return this.startStatisTime;
    }

}
