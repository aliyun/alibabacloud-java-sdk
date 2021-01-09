// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("To")
    public String to;

    @NameInMap("From")
    public String from;

    @NameInMap("Message")
    public String message;

    @NameInMap("Type")
    public String type;

    public static BatchSendMessageToGlobeRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeRequest self = new BatchSendMessageToGlobeRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSendMessageToGlobeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchSendMessageToGlobeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BatchSendMessageToGlobeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BatchSendMessageToGlobeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BatchSendMessageToGlobeRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchSendMessageToGlobeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
