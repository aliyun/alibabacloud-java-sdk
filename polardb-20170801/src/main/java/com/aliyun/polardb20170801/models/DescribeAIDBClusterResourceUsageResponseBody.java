// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The time when the cluster was created, in ISO 8601 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-13T15:45:27Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the AI database cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zeu0t5v0p98*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The DPI engine version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The resource usage information of the nodes in the cluster.</p>
     */
    @NameInMap("NodeItems")
    public java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItems> nodeItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIDBClusterResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterResourceUsageResponseBody self = new DescribeAIDBClusterResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterResourceUsageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAIDBClusterResourceUsageResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterResourceUsageResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAIDBClusterResourceUsageResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAIDBClusterResourceUsageResponseBody setNodeItems(java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItems> nodeItems) {
        this.nodeItems = nodeItems;
        return this;
    }
    public java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItems> getNodeItems() {
        return this.nodeItems;
    }

    public DescribeAIDBClusterResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems extends TeaModel {
        /**
         * <p>The time when the pod was created, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13T15:45:27Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-db-pod-001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the pod belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("NameSpace")
        public String nameSpace;

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.12</p>
         */
        @NameInMap("PodIP")
        public String podIP;

        /**
         * <p>The requested resources of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu=1,memory=2Gi</p>
         */
        @NameInMap("ResourceRequest")
        public String resourceRequest;

        /**
         * <p>The status of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems self = new DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setPodIP(String podIP) {
            this.podIP = podIP;
            return this;
        }
        public String getPodIP() {
            return this.podIP;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setResourceRequest(String resourceRequest) {
            this.resourceRequest = resourceRequest;
            return this;
        }
        public String getResourceRequest() {
            return this.resourceRequest;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAIDBClusterResourceUsageResponseBodyNodeItems extends TeaModel {
        /**
         * <p>The total CPU capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The used CPU capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CPUUsed")
        public String CPUUsed;

        /**
         * <p>The ID of the database node.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-2ze7sztqv1*****</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The total GPU capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The GPU model of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA A10</p>
         */
        @NameInMap("GPUModel")
        public String GPUModel;

        /**
         * <p>The used GPU capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GPUUsed")
        public String GPUUsed;

        /**
         * <p>The total memory capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>16Gi</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The used memory capacity of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("MemoryUsed")
        public String memoryUsed;

        /**
         * <p>The resource information of the pods on the node.</p>
         */
        @NameInMap("PodItems")
        public java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems> podItems;

        /**
         * <p>The ID of the virtual node associated with the database node.</p>
         * 
         * <strong>example:</strong>
         * <p>vnode-001</p>
         */
        @NameInMap("VNodeId")
        public String VNodeId;

        public static DescribeAIDBClusterResourceUsageResponseBodyNodeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterResourceUsageResponseBodyNodeItems self = new DescribeAIDBClusterResourceUsageResponseBodyNodeItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setCPUUsed(String CPUUsed) {
            this.CPUUsed = CPUUsed;
            return this;
        }
        public String getCPUUsed() {
            return this.CPUUsed;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setGPUModel(String GPUModel) {
            this.GPUModel = GPUModel;
            return this;
        }
        public String getGPUModel() {
            return this.GPUModel;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setGPUUsed(String GPUUsed) {
            this.GPUUsed = GPUUsed;
            return this;
        }
        public String getGPUUsed() {
            return this.GPUUsed;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setMemoryUsed(String memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setPodItems(java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems> podItems) {
            this.podItems = podItems;
            return this;
        }
        public java.util.List<DescribeAIDBClusterResourceUsageResponseBodyNodeItemsPodItems> getPodItems() {
            return this.podItems;
        }

        public DescribeAIDBClusterResourceUsageResponseBodyNodeItems setVNodeId(String VNodeId) {
            this.VNodeId = VNodeId;
            return this;
        }
        public String getVNodeId() {
            return this.VNodeId;
        }

    }

}
