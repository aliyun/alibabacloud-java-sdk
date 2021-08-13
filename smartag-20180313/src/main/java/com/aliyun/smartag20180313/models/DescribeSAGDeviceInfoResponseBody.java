// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSAGDeviceInfoResponseBody extends TeaModel {
    @NameInMap("ServiceIP")
    public String serviceIP;

    @NameInMap("ControllerState")
    public String controllerState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynStatus")
    public String synStatus;

    @NameInMap("SmartAGType")
    public String smartAGType;

    @NameInMap("Version")
    public String version;

    @NameInMap("VpnState")
    public String vpnState;

    @NameInMap("StartupTime")
    public String startupTime;

    @NameInMap("LastConnectedControllerTime")
    public String lastConnectedControllerTime;

    @NameInMap("ResettableStatus")
    public String resettableStatus;

    public static DescribeSAGDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSAGDeviceInfoResponseBody self = new DescribeSAGDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSAGDeviceInfoResponseBody setServiceIP(String serviceIP) {
        this.serviceIP = serviceIP;
        return this;
    }
    public String getServiceIP() {
        return this.serviceIP;
    }

    public DescribeSAGDeviceInfoResponseBody setControllerState(String controllerState) {
        this.controllerState = controllerState;
        return this;
    }
    public String getControllerState() {
        return this.controllerState;
    }

    public DescribeSAGDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSAGDeviceInfoResponseBody setSynStatus(String synStatus) {
        this.synStatus = synStatus;
        return this;
    }
    public String getSynStatus() {
        return this.synStatus;
    }

    public DescribeSAGDeviceInfoResponseBody setSmartAGType(String smartAGType) {
        this.smartAGType = smartAGType;
        return this;
    }
    public String getSmartAGType() {
        return this.smartAGType;
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

    public DescribeSAGDeviceInfoResponseBody setStartupTime(String startupTime) {
        this.startupTime = startupTime;
        return this;
    }
    public String getStartupTime() {
        return this.startupTime;
    }

    public DescribeSAGDeviceInfoResponseBody setLastConnectedControllerTime(String lastConnectedControllerTime) {
        this.lastConnectedControllerTime = lastConnectedControllerTime;
        return this;
    }
    public String getLastConnectedControllerTime() {
        return this.lastConnectedControllerTime;
    }

    public DescribeSAGDeviceInfoResponseBody setResettableStatus(String resettableStatus) {
        this.resettableStatus = resettableStatus;
        return this;
    }
    public String getResettableStatus() {
        return this.resettableStatus;
    }

}
