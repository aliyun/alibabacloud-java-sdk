// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStartSpeedUpRequest extends TeaModel {
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

    @NameInMap("TargetBandwidth")
    public Long targetBandwidth;

    @NameInMap("BandScene")
    public String bandScene;

    public static BandStartSpeedUpRequest build(java.util.Map<String, ?> map) throws Exception {
        BandStartSpeedUpRequest self = new BandStartSpeedUpRequest();
        return TeaModel.build(map, self);
    }

    public BandStartSpeedUpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BandStartSpeedUpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BandStartSpeedUpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BandStartSpeedUpRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public BandStartSpeedUpRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public BandStartSpeedUpRequest setBandId(Long bandId) {
        this.bandId = bandId;
        return this;
    }
    public Long getBandId() {
        return this.bandId;
    }

    public BandStartSpeedUpRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public BandStartSpeedUpRequest setTargetBandwidth(Long targetBandwidth) {
        this.targetBandwidth = targetBandwidth;
        return this;
    }
    public Long getTargetBandwidth() {
        return this.targetBandwidth;
    }

    public BandStartSpeedUpRequest setBandScene(String bandScene) {
        this.bandScene = bandScene;
        return this;
    }
    public String getBandScene() {
        return this.bandScene;
    }

}
