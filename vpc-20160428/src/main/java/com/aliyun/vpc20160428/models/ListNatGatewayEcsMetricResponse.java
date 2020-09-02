// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatGatewayEcsMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("MetricDataList")
    @Validation(required = true)
    public java.util.List<ListNatGatewayEcsMetricResponseMetricDataList> metricDataList;

    public static ListNatGatewayEcsMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNatGatewayEcsMetricResponse self = new ListNatGatewayEcsMetricResponse();
        return TeaModel.build(map, self);
    }

    public ListNatGatewayEcsMetricResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatGatewayEcsMetricResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatGatewayEcsMetricResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNatGatewayEcsMetricResponse setMetricDataList(java.util.List<ListNatGatewayEcsMetricResponseMetricDataList> metricDataList) {
        this.metricDataList = metricDataList;
        return this;
    }
    public java.util.List<ListNatGatewayEcsMetricResponseMetricDataList> getMetricDataList() {
        return this.metricDataList;
    }

    public static class ListNatGatewayEcsMetricResponseMetricDataList extends TeaModel {
        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("ActiveSessionNum")
        @Validation(required = true)
        public Long activeSessionNum;

        @NameInMap("NewSessionRate")
        @Validation(required = true)
        public Long newSessionRate;

        @NameInMap("RxBps")
        @Validation(required = true)
        public Long rxBps;

        @NameInMap("TxBps")
        @Validation(required = true)
        public Long txBps;

        @NameInMap("RxPps")
        @Validation(required = true)
        public Long rxPps;

        @NameInMap("TxPps")
        @Validation(required = true)
        public Long txPps;

        public static ListNatGatewayEcsMetricResponseMetricDataList build(java.util.Map<String, ?> map) throws Exception {
            ListNatGatewayEcsMetricResponseMetricDataList self = new ListNatGatewayEcsMetricResponseMetricDataList();
            return TeaModel.build(map, self);
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setActiveSessionNum(Long activeSessionNum) {
            this.activeSessionNum = activeSessionNum;
            return this;
        }
        public Long getActiveSessionNum() {
            return this.activeSessionNum;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setNewSessionRate(Long newSessionRate) {
            this.newSessionRate = newSessionRate;
            return this;
        }
        public Long getNewSessionRate() {
            return this.newSessionRate;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setRxBps(Long rxBps) {
            this.rxBps = rxBps;
            return this;
        }
        public Long getRxBps() {
            return this.rxBps;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setTxBps(Long txBps) {
            this.txBps = txBps;
            return this;
        }
        public Long getTxBps() {
            return this.txBps;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setRxPps(Long rxPps) {
            this.rxPps = rxPps;
            return this;
        }
        public Long getRxPps() {
            return this.rxPps;
        }

        public ListNatGatewayEcsMetricResponseMetricDataList setTxPps(Long txPps) {
            this.txPps = txPps;
            return this;
        }
        public Long getTxPps() {
            return this.txPps;
        }

    }

}
