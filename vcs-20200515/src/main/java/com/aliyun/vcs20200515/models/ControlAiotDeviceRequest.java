// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ControlAiotDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("CommandType")
    public Long commandType;

    @NameInMap("GateCtlStatus")
    public Long gateCtlStatus;

    @NameInMap("BarrierCommand")
    public Long barrierCommand;

    @NameInMap("RebootDevice")
    public String rebootDevice;

    @NameInMap("UpgradeFileURL")
    public String upgradeFileURL;

    @NameInMap("AssociatedVerificationEnable")
    public String associatedVerificationEnable;

    @NameInMap("AssociatedIPAddr")
    public String associatedIPAddr;

    @NameInMap("AssociatedPort")
    public Long associatedPort;

    @NameInMap("AssociatedDeviceID")
    public String associatedDeviceID;

    @NameInMap("SingleInterval")
    public Long singleInterval;

    @NameInMap("SuperPassword")
    public String superPassword;

    @NameInMap("DoubleVerificationGroupEnabled")
    public String doubleVerificationGroupEnabled;

    public static ControlAiotDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ControlAiotDeviceRequest self = new ControlAiotDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ControlAiotDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ControlAiotDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ControlAiotDeviceRequest setCommandType(Long commandType) {
        this.commandType = commandType;
        return this;
    }
    public Long getCommandType() {
        return this.commandType;
    }

    public ControlAiotDeviceRequest setGateCtlStatus(Long gateCtlStatus) {
        this.gateCtlStatus = gateCtlStatus;
        return this;
    }
    public Long getGateCtlStatus() {
        return this.gateCtlStatus;
    }

    public ControlAiotDeviceRequest setBarrierCommand(Long barrierCommand) {
        this.barrierCommand = barrierCommand;
        return this;
    }
    public Long getBarrierCommand() {
        return this.barrierCommand;
    }

    public ControlAiotDeviceRequest setRebootDevice(String rebootDevice) {
        this.rebootDevice = rebootDevice;
        return this;
    }
    public String getRebootDevice() {
        return this.rebootDevice;
    }

    public ControlAiotDeviceRequest setUpgradeFileURL(String upgradeFileURL) {
        this.upgradeFileURL = upgradeFileURL;
        return this;
    }
    public String getUpgradeFileURL() {
        return this.upgradeFileURL;
    }

    public ControlAiotDeviceRequest setAssociatedVerificationEnable(String associatedVerificationEnable) {
        this.associatedVerificationEnable = associatedVerificationEnable;
        return this;
    }
    public String getAssociatedVerificationEnable() {
        return this.associatedVerificationEnable;
    }

    public ControlAiotDeviceRequest setAssociatedIPAddr(String associatedIPAddr) {
        this.associatedIPAddr = associatedIPAddr;
        return this;
    }
    public String getAssociatedIPAddr() {
        return this.associatedIPAddr;
    }

    public ControlAiotDeviceRequest setAssociatedPort(Long associatedPort) {
        this.associatedPort = associatedPort;
        return this;
    }
    public Long getAssociatedPort() {
        return this.associatedPort;
    }

    public ControlAiotDeviceRequest setAssociatedDeviceID(String associatedDeviceID) {
        this.associatedDeviceID = associatedDeviceID;
        return this;
    }
    public String getAssociatedDeviceID() {
        return this.associatedDeviceID;
    }

    public ControlAiotDeviceRequest setSingleInterval(Long singleInterval) {
        this.singleInterval = singleInterval;
        return this;
    }
    public Long getSingleInterval() {
        return this.singleInterval;
    }

    public ControlAiotDeviceRequest setSuperPassword(String superPassword) {
        this.superPassword = superPassword;
        return this;
    }
    public String getSuperPassword() {
        return this.superPassword;
    }

    public ControlAiotDeviceRequest setDoubleVerificationGroupEnabled(String doubleVerificationGroupEnabled) {
        this.doubleVerificationGroupEnabled = doubleVerificationGroupEnabled;
        return this;
    }
    public String getDoubleVerificationGroupEnabled() {
        return this.doubleVerificationGroupEnabled;
    }

}
