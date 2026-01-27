// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeStatistics extends TeaModel {
    @NameInMap("ActualMinResources")
    public StatisticsResources actualMinResources;

    @NameInMap("GPUDetails")
    public java.util.List<NodeStatisticsGPUDetails> GPUDetails;

    @NameInMap("HyperNodeDetails")
    public java.util.List<NodeStatisticsHyperNodeDetails> hyperNodeDetails;

    @NameInMap("IdleResources")
    public StatisticsResources idleResources;

    @NameInMap("SchedulableResources")
    public StatisticsResources schedulableResources;

    @NameInMap("SystemReservedResources")
    public StatisticsResources systemReservedResources;

    public static NodeStatistics build(java.util.Map<String, ?> map) throws Exception {
        NodeStatistics self = new NodeStatistics();
        return TeaModel.build(map, self);
    }

    public NodeStatistics setActualMinResources(StatisticsResources actualMinResources) {
        this.actualMinResources = actualMinResources;
        return this;
    }
    public StatisticsResources getActualMinResources() {
        return this.actualMinResources;
    }

    public NodeStatistics setGPUDetails(java.util.List<NodeStatisticsGPUDetails> GPUDetails) {
        this.GPUDetails = GPUDetails;
        return this;
    }
    public java.util.List<NodeStatisticsGPUDetails> getGPUDetails() {
        return this.GPUDetails;
    }

    public NodeStatistics setHyperNodeDetails(java.util.List<NodeStatisticsHyperNodeDetails> hyperNodeDetails) {
        this.hyperNodeDetails = hyperNodeDetails;
        return this;
    }
    public java.util.List<NodeStatisticsHyperNodeDetails> getHyperNodeDetails() {
        return this.hyperNodeDetails;
    }

    public NodeStatistics setIdleResources(StatisticsResources idleResources) {
        this.idleResources = idleResources;
        return this;
    }
    public StatisticsResources getIdleResources() {
        return this.idleResources;
    }

    public NodeStatistics setSchedulableResources(StatisticsResources schedulableResources) {
        this.schedulableResources = schedulableResources;
        return this;
    }
    public StatisticsResources getSchedulableResources() {
        return this.schedulableResources;
    }

    public NodeStatistics setSystemReservedResources(StatisticsResources systemReservedResources) {
        this.systemReservedResources = systemReservedResources;
        return this;
    }
    public StatisticsResources getSystemReservedResources() {
        return this.systemReservedResources;
    }

    public static class NodeStatisticsGPUDetails extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("IdleNum")
        public Long idleNum;

        public static NodeStatisticsGPUDetails build(java.util.Map<String, ?> map) throws Exception {
            NodeStatisticsGPUDetails self = new NodeStatisticsGPUDetails();
            return TeaModel.build(map, self);
        }

        public NodeStatisticsGPUDetails setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public NodeStatisticsGPUDetails setIdleNum(Long idleNum) {
            this.idleNum = idleNum;
            return this;
        }
        public Long getIdleNum() {
            return this.idleNum;
        }

    }

    public static class NodeStatisticsHyperNodeDetails extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("IdleNum")
        public Long idleNum;

        public static NodeStatisticsHyperNodeDetails build(java.util.Map<String, ?> map) throws Exception {
            NodeStatisticsHyperNodeDetails self = new NodeStatisticsHyperNodeDetails();
            return TeaModel.build(map, self);
        }

        public NodeStatisticsHyperNodeDetails setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public NodeStatisticsHyperNodeDetails setIdleNum(Long idleNum) {
            this.idleNum = idleNum;
            return this;
        }
        public Long getIdleNum() {
            return this.idleNum;
        }

    }

}
