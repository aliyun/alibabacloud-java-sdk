// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWan4GResponseBody extends TeaModel {
    /**
     * <p>The IP address of the 4G NIC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The MAC address of the 4G NIC.</p>
     * 
     * <strong>example:</strong>
     * <p>c4:00:ad:a2:f5:****</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The priority of the 4G NIC. The default value is <strong>99</strong>, which indicates the lowest priority. The priority cannot be modified.</p>
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
     * <p>The status of the 4G NIC. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The status is normal.</li>
     * <li><strong>Abnormal</strong>: The status is abnormal.</li>
     * <li><strong>Unavailable</strong>: No 4G NIC is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The 4G signal strength. Valid values:</p>
     * <ul>
     * <li><strong>High</strong>: Strong.</li>
     * <li><strong>Middle</strong>: Medium.</li>
     * <li><strong>Low</strong>: Weak.</li>
     * <li><strong>Unavailable</strong>: No signal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Strength")
    public String strength;

    /**
     * <p>The traffic status of the 4G NIC. Valid values:</p>
     * <ul>
     * <li><strong>active</strong>: The 4G NIC acts as the active link, and current traffic is transmitted through this 4G NIC.</li>
     * <li><strong>standby</strong>: The 4G NIC acts as the standby link and does not forward traffic. If the active link fails, traffic is transmitted through this 4G NIC.</li>
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
