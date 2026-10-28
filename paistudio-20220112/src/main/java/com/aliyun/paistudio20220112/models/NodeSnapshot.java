// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeSnapshot extends TeaModel {
    /**
     * <p>The number of workloads using ancestor quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AncestorQuotaWorkloadNum")
    public Integer ancestorQuotaWorkloadNum;

    /**
     * <p>The number of workloads using descendant quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DescendantQuotaWorkloadNum")
    public Integer descendantQuotaWorkloadNum;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>trains930928remn-master-0</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The CPU usage.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("RequestCPU")
    public String requestCPU;

    /**
     * <p>The GPU usage.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RequestGPU")
    public String requestGPU;

    /**
     * <p>The memory usage.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RequestMemory")
    public String requestMemory;

    /**
     * <p>The number of workloads using the current quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SelfQuotaWorkloadNum")
    public Integer selfQuotaWorkloadNum;

    /**
     * <p>The number of node workloads.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WorkloadNum")
    public Integer workloadNum;

    /**
     * <p>The node workload snapshot.</p>
     */
    @NameInMap("Workloads")
    public java.util.List<NodeSnapshotWorkloads> workloads;

    public static NodeSnapshot build(java.util.Map<String, ?> map) throws Exception {
        NodeSnapshot self = new NodeSnapshot();
        return TeaModel.build(map, self);
    }

    public NodeSnapshot setAncestorQuotaWorkloadNum(Integer ancestorQuotaWorkloadNum) {
        this.ancestorQuotaWorkloadNum = ancestorQuotaWorkloadNum;
        return this;
    }
    public Integer getAncestorQuotaWorkloadNum() {
        return this.ancestorQuotaWorkloadNum;
    }

    public NodeSnapshot setDescendantQuotaWorkloadNum(Integer descendantQuotaWorkloadNum) {
        this.descendantQuotaWorkloadNum = descendantQuotaWorkloadNum;
        return this;
    }
    public Integer getDescendantQuotaWorkloadNum() {
        return this.descendantQuotaWorkloadNum;
    }

    public NodeSnapshot setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public NodeSnapshot setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public String getRequestCPU() {
        return this.requestCPU;
    }

    public NodeSnapshot setRequestGPU(String requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public String getRequestGPU() {
        return this.requestGPU;
    }

    public NodeSnapshot setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public String getRequestMemory() {
        return this.requestMemory;
    }

    public NodeSnapshot setSelfQuotaWorkloadNum(Integer selfQuotaWorkloadNum) {
        this.selfQuotaWorkloadNum = selfQuotaWorkloadNum;
        return this;
    }
    public Integer getSelfQuotaWorkloadNum() {
        return this.selfQuotaWorkloadNum;
    }

    public NodeSnapshot setWorkloadNum(Integer workloadNum) {
        this.workloadNum = workloadNum;
        return this;
    }
    public Integer getWorkloadNum() {
        return this.workloadNum;
    }

    public NodeSnapshot setWorkloads(java.util.List<NodeSnapshotWorkloads> workloads) {
        this.workloads = workloads;
        return this;
    }
    public java.util.List<NodeSnapshotWorkloads> getWorkloads() {
        return this.workloads;
    }

    public static class NodeSnapshotWorkloads extends TeaModel {
        /**
         * <p>The corresponding queue unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc1yhisjtmqh15s-master-0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workload ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlcxxxx</p>
         */
        @NameInMap("WorkloadId")
        public String workloadId;

        /**
         * <p>The workload type.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc</p>
         */
        @NameInMap("WorkloadType")
        public String workloadType;

        public static NodeSnapshotWorkloads build(java.util.Map<String, ?> map) throws Exception {
            NodeSnapshotWorkloads self = new NodeSnapshotWorkloads();
            return TeaModel.build(map, self);
        }

        public NodeSnapshotWorkloads setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodeSnapshotWorkloads setWorkloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public String getWorkloadId() {
            return this.workloadId;
        }

        public NodeSnapshotWorkloads setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

}
