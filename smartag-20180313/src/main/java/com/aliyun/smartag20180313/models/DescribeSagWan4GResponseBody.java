// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWan4GResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("TrafficState")
    public String trafficState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Strength")
    public String strength;

    @NameInMap("Mac")
    public String mac;

    public static DescribeSagWan4GResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWan4GResponseBody self = new DescribeSagWan4GResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWan4GResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSagWan4GResponseBody setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

    public DescribeSagWan4GResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWan4GResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DescribeSagWan4GResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeSagWan4GResponseBody setStrength(String strength) {
        this.strength = strength;
        return this;
    }
    public String getStrength() {
        return this.strength;
    }

    public DescribeSagWan4GResponseBody setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

}
