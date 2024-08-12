// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    @NameInMap("Bluetooth")
    public String bluetooth;

    @NameInMap("BuildId")
    public String buildId;

    @NameInMap("ChipId")
    public String chipId;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("Cpu")
    public String cpu;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("EtherMac")
    public String etherMac;

    @NameInMap("Memory")
    public String memory;

    @NameInMap("Model")
    public String model;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("Storage")
    public String storage;

    @NameInMap("Token")
    public String token;

    @NameInMap("Wlan")
    public String wlan;

    public static RegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceRequest self = new RegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceRequest setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }
    public String getBluetooth() {
        return this.bluetooth;
    }

    public RegisterDeviceRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public RegisterDeviceRequest setChipId(String chipId) {
        this.chipId = chipId;
        return this;
    }
    public String getChipId() {
        return this.chipId;
    }

    public RegisterDeviceRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RegisterDeviceRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public RegisterDeviceRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public RegisterDeviceRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public RegisterDeviceRequest setEtherMac(String etherMac) {
        this.etherMac = etherMac;
        return this;
    }
    public String getEtherMac() {
        return this.etherMac;
    }

    public RegisterDeviceRequest setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public RegisterDeviceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RegisterDeviceRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public RegisterDeviceRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public RegisterDeviceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RegisterDeviceRequest setWlan(String wlan) {
        this.wlan = wlan;
        return this;
    }
    public String getWlan() {
        return this.wlan;
    }

}
