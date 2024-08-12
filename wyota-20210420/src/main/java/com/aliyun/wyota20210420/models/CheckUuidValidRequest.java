// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CheckUuidValidRequest extends TeaModel {
    @NameInMap("Bluetooth")
    public String bluetooth;

    @NameInMap("BuildId")
    public String buildId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChipId")
    public String chipId;

    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomId")
    public String customId;

    @NameInMap("EtherMac")
    public String etherMac;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("Wlan")
    public String wlan;

    public static CheckUuidValidRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUuidValidRequest self = new CheckUuidValidRequest();
        return TeaModel.build(map, self);
    }

    public CheckUuidValidRequest setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }
    public String getBluetooth() {
        return this.bluetooth;
    }

    public CheckUuidValidRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public CheckUuidValidRequest setChipId(String chipId) {
        this.chipId = chipId;
        return this;
    }
    public String getChipId() {
        return this.chipId;
    }

    public CheckUuidValidRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CheckUuidValidRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CheckUuidValidRequest setEtherMac(String etherMac) {
        this.etherMac = etherMac;
        return this;
    }
    public String getEtherMac() {
        return this.etherMac;
    }

    public CheckUuidValidRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public CheckUuidValidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CheckUuidValidRequest setWlan(String wlan) {
        this.wlan = wlan;
        return this;
    }
    public String getWlan() {
        return this.wlan;
    }

}
