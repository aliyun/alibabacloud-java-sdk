// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsPartitionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsPartitionsResponseBodyData data;

    public static GetDWSSubsPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsPartitionsResponseBody self = new GetDWSSubsPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsPartitionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsPartitionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsPartitionsResponseBody setData(GetDWSSubsPartitionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsPartitionsResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsPartitionsResponseBodyDataMetrics extends TeaModel {
        @NameInMap("ClientAckTime")
        public String clientAckTime;

        @NameInMap("ClientAssignedQueueSize")
        public Long clientAssignedQueueSize;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientLastNotifiedSize")
        public Long clientLastNotifiedSize;

        @NameInMap("ClientRealQueueSize")
        public Long clientRealQueueSize;

        @NameInMap("ConsumptionLatency")
        public Long consumptionLatency;

        @NameInMap("ConsumptionRps")
        public Long consumptionRps;

        @NameInMap("DailyConsumedRecords")
        public Long dailyConsumedRecords;

        @NameInMap("Partition")
        public String partition;

        @NameInMap("SampleTime")
        public String sampleTime;

        @NameInMap("StoreLatency")
        public Long storeLatency;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("StoreSendTime")
        public String storeSendTime;

        public static GetDWSSubsPartitionsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsPartitionsResponseBodyDataMetrics self = new GetDWSSubsPartitionsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setClientAckTime(String clientAckTime) {
            this.clientAckTime = clientAckTime;
            return this;
        }
        public String getClientAckTime() {
            return this.clientAckTime;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setClientAssignedQueueSize(Long clientAssignedQueueSize) {
            this.clientAssignedQueueSize = clientAssignedQueueSize;
            return this;
        }
        public Long getClientAssignedQueueSize() {
            return this.clientAssignedQueueSize;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setClientLastNotifiedSize(Long clientLastNotifiedSize) {
            this.clientLastNotifiedSize = clientLastNotifiedSize;
            return this;
        }
        public Long getClientLastNotifiedSize() {
            return this.clientLastNotifiedSize;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setClientRealQueueSize(Long clientRealQueueSize) {
            this.clientRealQueueSize = clientRealQueueSize;
            return this;
        }
        public Long getClientRealQueueSize() {
            return this.clientRealQueueSize;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setConsumptionLatency(Long consumptionLatency) {
            this.consumptionLatency = consumptionLatency;
            return this;
        }
        public Long getConsumptionLatency() {
            return this.consumptionLatency;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setConsumptionRps(Long consumptionRps) {
            this.consumptionRps = consumptionRps;
            return this;
        }
        public Long getConsumptionRps() {
            return this.consumptionRps;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setDailyConsumedRecords(Long dailyConsumedRecords) {
            this.dailyConsumedRecords = dailyConsumedRecords;
            return this;
        }
        public Long getDailyConsumedRecords() {
            return this.dailyConsumedRecords;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setSampleTime(String sampleTime) {
            this.sampleTime = sampleTime;
            return this;
        }
        public String getSampleTime() {
            return this.sampleTime;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setStoreLatency(Long storeLatency) {
            this.storeLatency = storeLatency;
            return this;
        }
        public Long getStoreLatency() {
            return this.storeLatency;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public GetDWSSubsPartitionsResponseBodyDataMetrics setStoreSendTime(String storeSendTime) {
            this.storeSendTime = storeSendTime;
            return this;
        }
        public String getStoreSendTime() {
            return this.storeSendTime;
        }

    }

    public static class GetDWSSubsPartitionsResponseBodyData extends TeaModel {
        @NameInMap("Consumer")
        public String consumer;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("Metrics")
        public java.util.List<GetDWSSubsPartitionsResponseBodyDataMetrics> metrics;

        public static GetDWSSubsPartitionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsPartitionsResponseBodyData self = new GetDWSSubsPartitionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsPartitionsResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetDWSSubsPartitionsResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDWSSubsPartitionsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDWSSubsPartitionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDWSSubsPartitionsResponseBodyData setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public GetDWSSubsPartitionsResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public GetDWSSubsPartitionsResponseBodyData setMetrics(java.util.List<GetDWSSubsPartitionsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetDWSSubsPartitionsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

    }

}
