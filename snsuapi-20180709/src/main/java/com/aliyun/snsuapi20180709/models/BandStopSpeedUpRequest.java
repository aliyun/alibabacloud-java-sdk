// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStopSpeedUpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("BandId")
    public Long bandId;

    @NameInMap("Direction")
    public String direction;

    public static BandStopSpeedUpRequest build(java.util.Map<String, ?> map) throws Exception {
        BandStopSpeedUpRequest self = new BandStopSpeedUpRequest();
        return TeaModel.build(map, self);
    }

    public BandStopSpeedUpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BandStopSpeedUpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BandStopSpeedUpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BandStopSpeedUpRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public BandStopSpeedUpRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public BandStopSpeedUpRequest setBandId(Long bandId) {
        this.bandId = bandId;
        return this;
    }
    public Long getBandId() {
        return this.bandId;
    }

    public BandStopSpeedUpRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}
