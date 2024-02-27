// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosResponseBody extends TeaModel {
    @NameInMap("Count")
    public String count;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QosList")
    public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosList> qosList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExpressConnectTrafficQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosResponseBody self = new DescribeExpressConnectTrafficQosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeExpressConnectTrafficQosResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectTrafficQosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectTrafficQosResponseBody setQosList(java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosList> qosList) {
        this.qosList = qosList;
        return this;
    }
    public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosList> getQosList() {
        return this.qosList;
    }

    public DescribeExpressConnectTrafficQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectTrafficQosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceProgressing")
        public Integer instanceProgressing;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList self = new DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList setInstanceProgressing(Integer instanceProgressing) {
            this.instanceProgressing = instanceProgressing;
            return this;
        }
        public Integer getInstanceProgressing() {
            return this.instanceProgressing;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeExpressConnectTrafficQosResponseBodyQosListQueueList extends TeaModel {
        @NameInMap("BandwidthPercent")
        public String bandwidthPercent;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QueueDescription")
        public String queueDescription;

        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("Status")
        public String status;

        public static DescribeExpressConnectTrafficQosResponseBodyQosListQueueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosResponseBodyQosListQueueList self = new DescribeExpressConnectTrafficQosResponseBodyQosListQueueList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setBandwidthPercent(String bandwidthPercent) {
            this.bandwidthPercent = bandwidthPercent;
            return this;
        }
        public String getBandwidthPercent() {
            return this.bandwidthPercent;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setQueueDescription(String queueDescription) {
            this.queueDescription = queueDescription;
            return this;
        }
        public String getQueueDescription() {
            return this.queueDescription;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListQueueList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeExpressConnectTrafficQosResponseBodyQosList extends TeaModel {
        @NameInMap("AssociatedInstanceList")
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList> associatedInstanceList;

        @NameInMap("Progressing")
        public Integer progressing;

        @NameInMap("QosDescription")
        public String qosDescription;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QosName")
        public String qosName;

        @NameInMap("QueueList")
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListQueueList> queueList;

        @NameInMap("Status")
        public String status;

        public static DescribeExpressConnectTrafficQosResponseBodyQosList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosResponseBodyQosList self = new DescribeExpressConnectTrafficQosResponseBodyQosList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setAssociatedInstanceList(java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList> associatedInstanceList) {
            this.associatedInstanceList = associatedInstanceList;
            return this;
        }
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList> getAssociatedInstanceList() {
            return this.associatedInstanceList;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setProgressing(Integer progressing) {
            this.progressing = progressing;
            return this;
        }
        public Integer getProgressing() {
            return this.progressing;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setQosDescription(String qosDescription) {
            this.qosDescription = qosDescription;
            return this;
        }
        public String getQosDescription() {
            return this.qosDescription;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setQosName(String qosName) {
            this.qosName = qosName;
            return this;
        }
        public String getQosName() {
            return this.qosName;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setQueueList(java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListQueueList> queueList) {
            this.queueList = queueList;
            return this;
        }
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListQueueList> getQueueList() {
            return this.queueList;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
