// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStartSpeedUpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Token")
    public String token;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("PublicIp")
    public String publicIp;

    @NameInMap("PublicPort")
    public String publicPort;

    @NameInMap("DestinationIpAddress")
    public String destinationIpAddress;

    public static MobileStartSpeedUpRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileStartSpeedUpRequest self = new MobileStartSpeedUpRequest();
        return TeaModel.build(map, self);
    }

    public MobileStartSpeedUpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MobileStartSpeedUpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MobileStartSpeedUpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MobileStartSpeedUpRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public MobileStartSpeedUpRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public MobileStartSpeedUpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public MobileStartSpeedUpRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public MobileStartSpeedUpRequest setPublicPort(String publicPort) {
        this.publicPort = publicPort;
        return this;
    }
    public String getPublicPort() {
        return this.publicPort;
    }

    public MobileStartSpeedUpRequest setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }
    public String getDestinationIpAddress() {
        return this.destinationIpAddress;
    }

}
