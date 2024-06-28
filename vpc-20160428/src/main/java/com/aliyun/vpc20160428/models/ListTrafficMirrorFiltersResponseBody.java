// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739CA01C-92EB-4C69-BCC0-280149C6F41E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The information about the filters.</p>
     */
    @NameInMap("TrafficMirrorFilters")
    public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters> trafficMirrorFilters;

    public static ListTrafficMirrorFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorFiltersResponseBody self = new ListTrafficMirrorFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorFiltersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListTrafficMirrorFiltersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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
         * <ul>
         * <li><strong>accept</strong></li>
         * <li><strong>drop</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>22/40</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the outbound rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the outbound traffic to be mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong></li>
         * <li><strong>ICMP</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>22/40</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The direction of the network traffic. Valid values:</p>
         * <ul>
         * <li><strong>egress</strong></li>
         * <li><strong>ingress</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>egress</p>
         */
        @NameInMap("TrafficDirection")
        public String trafficDirection;

        /**
         * <p>The ID of the filter associated with the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The ID of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmr-j6c89rzmtd3hhdugq****</p>
         */
        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

        /**
         * <p>The status of the outbound rule. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
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
         * <ul>
         * <li><strong>accept</strong></li>
         * <li><strong>drop</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the inbound rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the inbound traffic to be mirrored. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong></li>
         * <li><strong>ICMP</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The direction of the network traffic. Valid values:</p>
         * <ul>
         * <li><strong>egress</strong></li>
         * <li><strong>ingress</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("TrafficDirection")
        public String trafficDirection;

        /**
         * <p>The ID of the filter associated with the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The ID of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmr-j6cezu8e68rnpepet****</p>
         */
        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

        /**
         * <p>The status of the inbound rule. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
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
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
         * <p>The time when the filter is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-05T15:26Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the outbound rules.</p>
         */
        @NameInMap("EgressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules> egressRules;

        /**
         * <p>The information about the inbound rules.</p>
         */
        @NameInMap("IngressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules> ingressRules;

        /**
         * <p>The ID of the resource group to which the traffic mirror session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersTags> tags;

        /**
         * <p>The description of the filter.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a filter.</p>
         */
        @NameInMap("TrafficMirrorFilterDescription")
        public String trafficMirrorFilterDescription;

        /**
         * <p>The ID of the filter.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The filter name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("TrafficMirrorFilterName")
        public String trafficMirrorFilterName;

        /**
         * <p>The status of the filter. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("TrafficMirrorFilterStatus")
        public String trafficMirrorFilterStatus;

        public static ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters self = new ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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
