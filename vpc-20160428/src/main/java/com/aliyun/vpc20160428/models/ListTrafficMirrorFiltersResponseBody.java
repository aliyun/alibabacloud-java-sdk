// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If the return value of **NextToken** is not empty, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The details about the filters.</p>
     */
    @NameInMap("TrafficMirrorFilters")
    public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters> trafficMirrorFilters;

    public static ListTrafficMirrorFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorFiltersResponseBody self = new ListTrafficMirrorFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorFiltersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMirrorFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficMirrorFiltersResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListTrafficMirrorFiltersResponseBody setTrafficMirrorFilters(java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters> trafficMirrorFilters) {
        this.trafficMirrorFilters = trafficMirrorFilters;
        return this;
    }
    public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters> getTrafficMirrorFilters() {
        return this.trafficMirrorFilters;
    }

    public static class ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules extends TeaModel {
        /**
         * <p>The action of the outbound rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: collects network traffic.</p>
         * <p>*   **drop**: does not collect network traffic.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the outbound traffic.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the outbound traffic.</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the outbound rule. A smaller value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the outbound traffic to be mirrored. Valid values:</p>
         * <br>
         * <p>*   **ALL**: all protocols</p>
         * <p>*   **ICMP**: ICMP</p>
         * <p>*   **TCP**: TCP</p>
         * <p>*   **UDP**: UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the outbound traffic.</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the outbound traffic.</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The direction of the network traffic. Valid values:</p>
         * <br>
         * <p>*   **egress**: outbound</p>
         * <p>*   **ingress**: inbound</p>
         */
        @NameInMap("TrafficDirection")
        public String trafficDirection;

        /**
         * <p>The ID of the filter associated with the outbound rule.</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The ID of the outbound rule.</p>
         */
        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

        /**
         * <p>The status of the outbound rule. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Created**</p>
         * <p>*   **Modifying**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("TrafficMirrorFilterRuleStatus")
        public String trafficMirrorFilterRuleStatus;

        public static ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules self = new ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setTrafficDirection(String trafficDirection) {
            this.trafficDirection = trafficDirection;
            return this;
        }
        public String getTrafficDirection() {
            return this.trafficDirection;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setTrafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
            this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
            return this;
        }
        public String getTrafficMirrorFilterRuleId() {
            return this.trafficMirrorFilterRuleId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules setTrafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
            this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return this;
        }
        public String getTrafficMirrorFilterRuleStatus() {
            return this.trafficMirrorFilterRuleStatus;
        }

    }

    public static class ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules extends TeaModel {
        /**
         * <p>The action of the inbound rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: accepts network traffic.</p>
         * <p>*   **drop**: does not collect network traffic.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the inbound traffic.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the inbound rule. A smaller value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the inbound traffic to be mirrored. Valid values:</p>
         * <br>
         * <p>*   **ALL**: all protocols</p>
         * <p>*   **ICMP**: ICMP</p>
         * <p>*   **TCP**: TCP</p>
         * <p>*   **UDP**: UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the inbound traffic.</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The direction of the network traffic. Valid values:</p>
         * <br>
         * <p>*   **egress**: outbound</p>
         * <p>*   **ingress**: inbound</p>
         */
        @NameInMap("TrafficDirection")
        public String trafficDirection;

        /**
         * <p>The ID of the filter associated with the inbound rule.</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The ID of the inbound rule.</p>
         */
        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

        /**
         * <p>The status of the inbound rule. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Created**</p>
         * <p>*   **Modifying**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("TrafficMirrorFilterRuleStatus")
        public String trafficMirrorFilterRuleStatus;

        public static ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules self = new ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setTrafficDirection(String trafficDirection) {
            this.trafficDirection = trafficDirection;
            return this;
        }
        public String getTrafficDirection() {
            return this.trafficDirection;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setTrafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
            this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
            return this;
        }
        public String getTrafficMirrorFilterRuleId() {
            return this.trafficMirrorFilterRuleId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules setTrafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
            this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
            return this;
        }
        public String getTrafficMirrorFilterRuleStatus() {
            return this.trafficMirrorFilterRuleStatus;
        }

    }

    public static class ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags self = new ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters extends TeaModel {
        /**
         * <p>The details about the outbound rules.</p>
         */
        @NameInMap("EgressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules> egressRules;

        /**
         * <p>The details about the inbound rules.</p>
         */
        @NameInMap("IngressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules> ingressRules;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags> tags;

        /**
         * <p>The description of the filter.</p>
         */
        @NameInMap("TrafficMirrorFilterDescription")
        public String trafficMirrorFilterDescription;

        /**
         * <p>The ID of the filter.</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The name of the filter.</p>
         */
        @NameInMap("TrafficMirrorFilterName")
        public String trafficMirrorFilterName;

        /**
         * <p>The status of the filter. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Created**</p>
         * <p>*   **Modifying**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("TrafficMirrorFilterStatus")
        public String trafficMirrorFilterStatus;

        public static ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters self = new ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setEgressRules(java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules> egressRules) {
            this.egressRules = egressRules;
            return this;
        }
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules> getEgressRules() {
            return this.egressRules;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setIngressRules(java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules> ingressRules) {
            this.ingressRules = ingressRules;
            return this;
        }
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules> getIngressRules() {
            return this.ingressRules;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setTags(java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags> getTags() {
            return this.tags;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setTrafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
            this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
            return this;
        }
        public String getTrafficMirrorFilterDescription() {
            return this.trafficMirrorFilterDescription;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setTrafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setTrafficMirrorFilterName(String trafficMirrorFilterName) {
            this.trafficMirrorFilterName = trafficMirrorFilterName;
            return this;
        }
        public String getTrafficMirrorFilterName() {
            return this.trafficMirrorFilterName;
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setTrafficMirrorFilterStatus(String trafficMirrorFilterStatus) {
            this.trafficMirrorFilterStatus = trafficMirrorFilterStatus;
            return this;
        }
        public String getTrafficMirrorFilterStatus() {
            return this.trafficMirrorFilterStatus;
        }

    }

}
