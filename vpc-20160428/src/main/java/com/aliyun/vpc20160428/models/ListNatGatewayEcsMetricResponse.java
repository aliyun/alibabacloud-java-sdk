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

    }

}
