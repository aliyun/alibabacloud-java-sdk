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
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the instance type supports Multi-Buffer acceleration. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("MultiBufferEnabled")
        public Boolean multiBufferEnabled;

        /**
         * <p>The instance type of the node.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

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
