// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnBotInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Status")
    public String status;

    public static SetScdnBotInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScdnBotInfoRequest self = new SetScdnBotInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetScdnBotInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetScdnBotInfoRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetScdnBotInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetScdnBotInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
