// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SubDeviceList")
    public java.util.List<BindDevicesRequestSubDeviceList> subDeviceList;

    public static BindDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDevicesRequest self = new BindDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BindDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public BindDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindDevicesRequest setSubDeviceList(java.util.List<BindDevicesRequestSubDeviceList> subDeviceList) {
        this.subDeviceList = subDeviceList;
        return this;
    }
    public java.util.List<BindDevicesRequestSubDeviceList> getSubDeviceList() {
        return this.subDeviceList;
    }

    public static class BindDevicesRequestSubDeviceList extends TeaModel {
        @NameInMap("AccessProtocol")
        public String accessProtocol;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("PIN")
        public String PIN;

        @NameInMap("SubDeviceIp")
        public String subDeviceIp;

        @NameInMap("SubDeviceName")
        public String subDeviceName;

        @NameInMap("SubDevicePort")
        public String subDevicePort;

        public static BindDevicesRequestSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BindDevicesRequestSubDeviceList self = new BindDevicesRequestSubDeviceList();
            return TeaModel.build(map, self);
        }

        public BindDevicesRequestSubDeviceList setAccessProtocol(String accessProtocol) {
            this.accessProtocol = accessProtocol;
            return this;
        }
        public String getAccessProtocol() {
            return this.accessProtocol;
        }

        public BindDevicesRequestSubDeviceList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public BindDevicesRequestSubDeviceList setPIN(String PIN) {
            this.PIN = PIN;
            return this;
        }
        public String getPIN() {
            return this.PIN;
        }

        public BindDevicesRequestSubDeviceList setSubDeviceIp(String subDeviceIp) {
            this.subDeviceIp = subDeviceIp;
            return this;
        }
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        public BindDevicesRequestSubDeviceList setSubDeviceName(String subDeviceName) {
            this.subDeviceName = subDeviceName;
            return this;
        }
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        public BindDevicesRequestSubDeviceList setSubDevicePort(String subDevicePort) {
            this.subDevicePort = subDevicePort;
            return this;
        }
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

    }

}
