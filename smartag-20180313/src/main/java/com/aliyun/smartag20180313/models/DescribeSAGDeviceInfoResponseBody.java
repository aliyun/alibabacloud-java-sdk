// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSAGDeviceInfoResponseBody extends TeaModel {
    @NameInMap("ControllerState")
    public String controllerState;

    @NameInMap("LastConnectedControllerTime")
    public String lastConnectedControllerTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResettableStatus")
    public String resettableStatus;

    @NameInMap("ServiceIP")
    public String serviceIP;

    @NameInMap("SmartAGType")
    public String smartAGType;

    @NameInMap("StartupTime")
    public String startupTime;

    @NameInMap("SynStatus")
    public String synStatus;

    @NameInMap("Version")
    public String version;

    @NameInMap("VpnState")
    public String vpnState;

    public static DescribeSAGDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSAGDeviceInfoResponseBody self = new DescribeSAGDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSAGDeviceInfoResponseBody setControllerState(String controllerState) {
        this.controllerState = controllerState;
        return this;
    }
    public String getControllerState() {
        return this.controllerState;
    }

    public DescribeSAGDeviceInfoResponseBody setLastConnectedControllerTime(String lastConnectedControllerTime) {
        this.lastConnectedControllerTime = lastConnectedControllerTime;
        return this;
    }
    public String getLastConnectedControllerTime() {
        return this.lastConnectedControllerTime;
    }

    public DescribeSAGDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSAGDeviceInfoResponseBody setResettableStatus(String resettableStatus) {
        this.resettableStatus = resettableStatus;
        return this;
    }
    public String getResettableStatus() {
        return this.resettableStatus;
    }

    public DescribeSAGDeviceInfoResponseBody setServiceIP(String serviceIP) {
        this.serviceIP = serviceIP;
        return this;
    }
    public String getServiceIP() {
        return this.serviceIP;
    }

    public DescribeSAGDeviceInfoResponseBody setSmartAGType(String smartAGType) {
        this.smartAGType = smartAGType;
        return this;
    }
    public String getSmartAGType() {
        return this.smartAGType;
    }

    public DescribeSAGDeviceInfoResponseBody setStartupTime(String startupTime) {
        this.startupTime = startupTime;
        return this;
    }
    public String getStartupTime() {
        return this.startupTime;
    }

    public DescribeSAGDeviceInfoResponseBody setSynStatus(String synStatus) {
        this.synStatus = synStatus;
        return this;
    }
    public String getSynStatus() {
        return this.synStatus;
    }

    public DescribeSAGDeviceInfoResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeSAGDeviceInfoResponseBody setVpnState(String vpnState) {
        this.vpnState = vpnState;
        return this;
    }
    public String getVpnState() {
        return this.vpnState;
    }

}
