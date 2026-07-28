// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The number of entries per page for paginated queries. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li><p>Leave this parameter empty for the first query or if no subsequent query is required.</p>
     * </li>
     * <li><p>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned in the previous API call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of QoS policies.</p>
     */
    @NameInMap("QosList")
    public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosList> qosList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CF20CC7-D1FC-425B-A15B-DF7C8E2131A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp159zj8zujwy3p07****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The configuration progress of the associated instance. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceProgressing")
        public Integer instanceProgressing;

        /**
         * <p>The status of the associated instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: being configured.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the associated instance. Valid values: <strong>PHYSICALCONNECTION</strong>: Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
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
        /**
         * <p>The bandwidth percentage of the QoS queue.</p>
         * <ul>
         * <li><p>When the QoS queue type is <strong>Medium</strong>, this parameter is required. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * </li>
         * <li><p>When the QoS queue type is <strong>Default</strong>, this parameter is set to &quot;-&quot;.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BandwidthPercent")
        public String bandwidthPercent;

        /**
         * <p>The QoS policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-pksbqfmotl5hzq****</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The description of the QoS queue.</p>
         * <p>The description is <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueDescription")
        public String queueDescription;

        /**
         * <p>The QoS queue ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rc****</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The name of the QoS queue.</p>
         * <p>The name is <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The QoS queue type. Valid values:</p>
         * <ul>
         * <li><p><strong>High</strong>: high-priority queue.</p>
         * </li>
         * <li><p><strong>Medium</strong>: medium-priority queue.</p>
         * </li>
         * <li><p><strong>Default</strong>: default-priority queue.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default-priority queue cannot be created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("QueueType")
        public String queueType;

        /**
         * <p>The status of the QoS queue. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: being configured.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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

    public static class DescribeExpressConnectTrafficQosResponseBodyQosListTags extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectTrafficQosResponseBodyQosListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosResponseBodyQosListTags self = new DescribeExpressConnectTrafficQosResponseBodyQosListTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeExpressConnectTrafficQosResponseBodyQosList extends TeaModel {
        /**
         * <p>The list of associated instances.</p>
         */
        @NameInMap("AssociatedInstanceList")
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListAssociatedInstanceList> associatedInstanceList;

        /**
         * <p>The overall configuration progress of the QoS policy. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progressing")
        public Integer progressing;

        /**
         * <p>The description of the QoS policy. </p>
         * <p>The description is <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-test</p>
         */
        @NameInMap("QosDescription")
        public String qosDescription;

        /**
         * <p>The QoS policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-pksbqfmotl5hzq****</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The name of the QoS policy. </p>
         * <p>The name is <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-test</p>
         */
        @NameInMap("QosName")
        public String qosName;

        /**
         * <p>The list of QoS queues.</p>
         */
        @NameInMap("QueueList")
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListQueueList> queueList;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmz7vtyl4f***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the QoS policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: being configured.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A QoS policy in the Configuring state restricts most create, update, and delete operations on QoS policies, QoS queues, and QoS rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListTags> tags;

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

        public DescribeExpressConnectTrafficQosResponseBodyQosList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressConnectTrafficQosResponseBodyQosList setTags(java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeExpressConnectTrafficQosResponseBodyQosListTags> getTags() {
            return this.tags;
        }

    }

}
