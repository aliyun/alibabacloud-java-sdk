// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWan4GResponseBody extends TeaModel {
    /**
     * <p>The IP address of the 4G SIM card.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The MAC address of the 4G SIM card.</p>
     * 
     * <strong>example:</strong>
     * <p>c4:00:ad:a2:f5:****</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The priority of the 4G SIM card. The default value is <strong>99</strong>, which indicates the lowest priority and cannot be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the 4G SIM card. Valid value:</p>
     * <ul>
     * <li><strong>Normal</strong>: The 4G SIM card is available.</li>
     * <li><strong>Abnormal</strong>: The 4G SIM card encountered an error.</li>
     * <li><strong>Unavailable</strong>: No 4G SIM card is inserted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The signal strength of the 4G network. Valid values:</p>
     * <ul>
     * <li><strong>High</strong>: strong signals.</li>
     * <li><strong>Middle</strong>: medium-strength signals.</li>
     * <li><strong>Low</strong>: weak signals.</li>
     * <li><strong>Unavailable</strong>: no signal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Strength")
    public String strength;

    /**
     * <p>The network status of the 4G SIM card. Valid values:</p>
     * <ul>
     * <li><strong>active</strong>: The 4G SIM card is used to establish the active connection. Network traffic is transmitted over the 4G SIM card first.</li>
     * <li><strong>standby</strong>: The 4G SIM card is used to establish a standby connection. Network traffic is not transmitted over the 4G SIM card unless the active connection fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("TrafficState")
    public String trafficState;

    public static DescribeSagWan4GResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWan4GResponseBody self = new DescribeSagWan4GResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWan4GResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeSagWan4GResponseBody setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public DescribeSagWan4GResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DescribeSagWan4GResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWan4GResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSagWan4GResponseBody setStrength(String strength) {
        this.strength = strength;
        return this;
    }
    public String getStrength() {
        return this.strength;
    }

    public DescribeSagWan4GResponseBody setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

}
