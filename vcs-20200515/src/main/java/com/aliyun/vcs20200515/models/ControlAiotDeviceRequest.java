// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ControlAiotDeviceRequest extends TeaModel {
    @NameInMap("AssociatedDeviceId")
    public String associatedDeviceId;

    @NameInMap("AssociatedIPAddr")
    public String associatedIPAddr;

    @NameInMap("AssociatedPort")
    public Long associatedPort;

    @NameInMap("AssociatedVerificationEnable")
    public String associatedVerificationEnable;

    @NameInMap("BarrierCommand")
    public Long barrierCommand;

    @NameInMap("CheckEnabled")
    public String checkEnabled;

    @NameInMap("CommandType")
    public Long commandType;

    @NameInMap("DoubleVerificationGroupEnabled")
    public String doubleVerificationGroupEnabled;

    @NameInMap("GateCtlStatus")
    public Long gateCtlStatus;

    @NameInMap("Id")
    public String id;

    @NameInMap("IdentityNumber")
    public String identityNumber;

    @NameInMap("MiFareCard")
    public ControlAiotDeviceRequestMiFareCard miFareCard;

    @NameInMap("Name")
    public String name;

    @NameInMap("RebootDevice")
    public String rebootDevice;

    @NameInMap("SingleInterval")
    public Long singleInterval;

    @NameInMap("SuperPassword")
    public String superPassword;

    @NameInMap("UpgradeFileURL")
    public String upgradeFileURL;

    public static ControlAiotDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ControlAiotDeviceRequest self = new ControlAiotDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ControlAiotDeviceRequest setAssociatedDeviceId(String associatedDeviceId) {
        this.associatedDeviceId = associatedDeviceId;
        return this;
    }
    public String getAssociatedDeviceId() {
        return this.associatedDeviceId;
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

    public ControlAiotDeviceRequest setAssociatedVerificationEnable(String associatedVerificationEnable) {
        this.associatedVerificationEnable = associatedVerificationEnable;
        return this;
    }
    public String getAssociatedVerificationEnable() {
        return this.associatedVerificationEnable;
    }

    public ControlAiotDeviceRequest setBarrierCommand(Long barrierCommand) {
        this.barrierCommand = barrierCommand;
        return this;
    }
    public Long getBarrierCommand() {
        return this.barrierCommand;
    }

    public ControlAiotDeviceRequest setCheckEnabled(String checkEnabled) {
        this.checkEnabled = checkEnabled;
        return this;
    }
    public String getCheckEnabled() {
        return this.checkEnabled;
    }

    public ControlAiotDeviceRequest setCommandType(Long commandType) {
        this.commandType = commandType;
        return this;
    }
    public Long getCommandType() {
        return this.commandType;
    }

    public ControlAiotDeviceRequest setDoubleVerificationGroupEnabled(String doubleVerificationGroupEnabled) {
        this.doubleVerificationGroupEnabled = doubleVerificationGroupEnabled;
        return this;
    }
    public String getDoubleVerificationGroupEnabled() {
        return this.doubleVerificationGroupEnabled;
    }

    public ControlAiotDeviceRequest setGateCtlStatus(Long gateCtlStatus) {
        this.gateCtlStatus = gateCtlStatus;
        return this;
    }
    public Long getGateCtlStatus() {
        return this.gateCtlStatus;
    }

    public ControlAiotDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ControlAiotDeviceRequest setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }
    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public ControlAiotDeviceRequest setMiFareCard(ControlAiotDeviceRequestMiFareCard miFareCard) {
        this.miFareCard = miFareCard;
        return this;
    }
    public ControlAiotDeviceRequestMiFareCard getMiFareCard() {
        return this.miFareCard;
    }

    public ControlAiotDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ControlAiotDeviceRequest setRebootDevice(String rebootDevice) {
        this.rebootDevice = rebootDevice;
        return this;
    }
    public String getRebootDevice() {
        return this.rebootDevice;
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

    public ControlAiotDeviceRequest setUpgradeFileURL(String upgradeFileURL) {
        this.upgradeFileURL = upgradeFileURL;
        return this;
    }
    public String getUpgradeFileURL() {
        return this.upgradeFileURL;
    }

    public static class ControlAiotDeviceRequestMiFareCard extends TeaModel {
        @NameInMap("AreaCode")
        public Long areaCode;

        @NameInMap("AreaDeviate")
        public Long areaDeviate;

        @NameInMap("AreaLen")
        public Long areaLen;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("KeyType")
        public Long keyType;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ControlAiotDeviceRequestMiFareCard build(java.util.Map<String, ?> map) throws Exception {
            ControlAiotDeviceRequestMiFareCard self = new ControlAiotDeviceRequestMiFareCard();
            return TeaModel.build(map, self);
        }

        public ControlAiotDeviceRequestMiFareCard setAreaCode(Long areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public Long getAreaCode() {
            return this.areaCode;
        }

        public ControlAiotDeviceRequestMiFareCard setAreaDeviate(Long areaDeviate) {
            this.areaDeviate = areaDeviate;
            return this;
        }
        public Long getAreaDeviate() {
            return this.areaDeviate;
        }

        public ControlAiotDeviceRequestMiFareCard setAreaLen(Long areaLen) {
            this.areaLen = areaLen;
            return this;
        }
        public Long getAreaLen() {
            return this.areaLen;
        }

        public ControlAiotDeviceRequestMiFareCard setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ControlAiotDeviceRequestMiFareCard setKeyType(Long keyType) {
            this.keyType = keyType;
            return this;
        }
        public Long getKeyType() {
            return this.keyType;
        }

        public ControlAiotDeviceRequestMiFareCard setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public ControlAiotDeviceRequestMiFareCard setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

}
