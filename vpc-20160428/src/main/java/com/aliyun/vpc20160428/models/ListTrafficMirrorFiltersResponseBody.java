// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("TrafficDirection")
        public String trafficDirection;

        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("TrafficDirection")
        public String trafficDirection;

        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterRuleId")
        public String trafficMirrorFilterRuleId;

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

    public static class ListTrafficMirrorFiltersResponseBodyTrafficMirrorFilters extends TeaModel {
        @NameInMap("EgressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersEgressRules> egressRules;

        @NameInMap("IngressRules")
        public java.util.List<ListTrafficMirrorFiltersResponseBodyTrafficMirrorFiltersIngressRules> ingressRules;

        @NameInMap("TrafficMirrorFilterDescription")
        public String trafficMirrorFilterDescription;

        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterName")
        public String trafficMirrorFilterName;

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
