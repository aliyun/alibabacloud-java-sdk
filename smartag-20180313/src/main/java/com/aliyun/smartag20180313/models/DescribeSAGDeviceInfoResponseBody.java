// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSAGDeviceInfoResponseBody extends TeaModel {
    /**
     * <p>The control status of the SAG device. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: normal</li>
     * <li><strong>Abnormal</strong>: abnormal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ControllerState")
    public String controllerState;

    /**
     * <p>The last time when the SAG device was connected to Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-14 00:27:48</p>
     */
    @NameInMap("LastConnectedControllerTime")
    public String lastConnectedControllerTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B6A991F4-F533-1627-8144-B64E01C5EE85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the reset button of the SAG device is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled</li>
     * <li><strong>Disabled</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("ResettableStatus")
    public String resettableStatus;

    /**
     * <p>The IP address of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>42.XX.XX.151</p>
     */
    @NameInMap("ServiceIP")
    public String serviceIP;

    /**
     * <p>The model of the SAG device. Valid values:</p>
     * <ul>
     * <li><strong>sag-100wm</strong></li>
     * <li><strong>sag-1000</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sag-100wm</p>
     */
    @NameInMap("SmartAGType")
    public String smartAGType;

    /**
     * <p>The time when the SAG device was started.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-15 17:33:43</p>
     */
    @NameInMap("StartupTime")
    public String startupTime;

    /**
     * <p>Indicates whether the settings of the SAG device are synchronized to Alibaba Cloud. Valid values:</p>
     * <ul>
     * <li><strong>Synchronized</strong>: synchronized</li>
     * <li><strong>Unsynchronized</strong>: unsynchronized</li>
     * <li><strong>Synchronizing</strong>: being synchronized</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unsynchronized</p>
     */
    @NameInMap("SynStatus")
    public String synStatus;

    /**
     * <p>The version of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>2.3.1.1</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The VPN connection status of the SAG device. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: normal</li>
     * <li><strong>Abnormal</strong>: abnormal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Abnormal</p>
     */
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
