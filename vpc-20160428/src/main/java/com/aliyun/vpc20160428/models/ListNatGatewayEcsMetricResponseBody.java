// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatGatewayEcsMetricResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MetricDataList")
    public java.util.List<ListNatGatewayEcsMetricResponseBodyMetricDataList> metricDataList;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListNatGatewayEcsMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNatGatewayEcsMetricResponseBody self = new ListNatGatewayEcsMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNatGatewayEcsMetricResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatGatewayEcsMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatGatewayEcsMetricResponseBody setMetricDataList(java.util.List<ListNatGatewayEcsMetricResponseBodyMetricDataList> metricDataList) {
        this.metricDataList = metricDataList;
        return this;
    }
    public java.util.List<ListNatGatewayEcsMetricResponseBodyMetricDataList> getMetricDataList() {
        return this.metricDataList;
    }

    public ListNatGatewayEcsMetricResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListNatGatewayEcsMetricResponseBodyMetricDataList extends TeaModel {
        @NameInMap("RxBps")
        public Long rxBps;

        @NameInMap("ActiveSessionNum")
        public Long activeSessionNum;

        @NameInMap("TxBps")
        public Long txBps;

        @NameInMap("NewSessionRate")
        public Long newSessionRate;

        @NameInMap("TxPps")
        public Long txPps;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("RxPps")
        public Long rxPps;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static ListNatGatewayEcsMetricResponseBodyMetricDataList build(java.util.Map<String, ?> map) throws Exception {
            ListNatGatewayEcsMetricResponseBodyMetricDataList self = new ListNatGatewayEcsMetricResponseBodyMetricDataList();
            return TeaModel.build(map, self);
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setRxBps(Long rxBps) {
            this.rxBps = rxBps;
            return this;
        }
        public Long getRxBps() {
            return this.rxBps;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setActiveSessionNum(Long activeSessionNum) {
            this.activeSessionNum = activeSessionNum;
            return this;
        }
        public Long getActiveSessionNum() {
            return this.activeSessionNum;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setTxBps(Long txBps) {
            this.txBps = txBps;
            return this;
        }
        public Long getTxBps() {
            return this.txBps;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setNewSessionRate(Long newSessionRate) {
            this.newSessionRate = newSessionRate;
            return this;
        }
        public Long getNewSessionRate() {
            return this.newSessionRate;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setTxPps(Long txPps) {
            this.txPps = txPps;
            return this;
        }
        public Long getTxPps() {
            return this.txPps;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setRxPps(Long rxPps) {
            this.rxPps = rxPps;
            return this;
        }
        public Long getRxPps() {
            return this.rxPps;
        }

        public ListNatGatewayEcsMetricResponseBodyMetricDataList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

}
