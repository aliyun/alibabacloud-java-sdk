// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNodesInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>The instance types of the nodes.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<DescribeNodesInstanceTypeResponseBodyInstanceTypes> instanceTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodesInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodesInstanceTypeResponseBody self = new DescribeNodesInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodesInstanceTypeResponseBody setInstanceTypes(java.util.List<DescribeNodesInstanceTypeResponseBodyInstanceTypes> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<DescribeNodesInstanceTypeResponseBodyInstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeNodesInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNodesInstanceTypeResponseBodyInstanceTypes extends TeaModel {
        /**
         * <p>The label keys of nodes which have MultiBuffer optimization supported. (Enable optimization only if pod being scheduled to node which have a label key specified by this field and its value equals with the value field)</p>
         * 
         * <strong>example:</strong>
         * <p>feature.node.kubernetes.io/mb-feature-enable</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the instance type supports Multi-Buffer acceleration. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MultiBufferEnabled")
        public Boolean multiBufferEnabled;

        /**
         * <p>The instance type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g7.xlarge</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The label keys of nodes which have MultiBuffer optimization supported. (Enable optimization only if pod being scheduled to node which have a label key specified by the key field and its value equals with this field)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNodesInstanceTypeResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodesInstanceTypeResponseBodyInstanceTypes self = new DescribeNodesInstanceTypeResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeNodesInstanceTypeResponseBodyInstanceTypes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNodesInstanceTypeResponseBodyInstanceTypes setMultiBufferEnabled(Boolean multiBufferEnabled) {
            this.multiBufferEnabled = multiBufferEnabled;
            return this;
        }
        public Boolean getMultiBufferEnabled() {
            return this.multiBufferEnabled;
        }

        public DescribeNodesInstanceTypeResponseBodyInstanceTypes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeNodesInstanceTypeResponseBodyInstanceTypes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
