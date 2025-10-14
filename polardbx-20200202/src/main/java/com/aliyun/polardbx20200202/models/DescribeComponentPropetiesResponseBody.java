// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeComponentPropetiesResponseBody extends TeaModel {
    @NameInMap("Properties")
    public java.util.List<DescribeComponentPropetiesResponseBodyProperties> properties;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentPropetiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPropetiesResponseBody self = new DescribeComponentPropetiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPropetiesResponseBody setProperties(java.util.List<DescribeComponentPropetiesResponseBodyProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<DescribeComponentPropetiesResponseBodyProperties> getProperties() {
        return this.properties;
    }

    public DescribeComponentPropetiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComponentPropetiesResponseBodyProperties extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderIndex")
        public String orderIndex;

        /**
         * <strong>example:</strong>
         * <p>dn_node_spec</p>
         */
        @NameInMap("PropertyCode")
        public String propertyCode;

        /**
         * <strong>example:</strong>
         * <p>172.27.35.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeComponentPropetiesResponseBodyProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentPropetiesResponseBodyProperties self = new DescribeComponentPropetiesResponseBodyProperties();
            return TeaModel.build(map, self);
        }

        public DescribeComponentPropetiesResponseBodyProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeComponentPropetiesResponseBodyProperties setOrderIndex(String orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public String getOrderIndex() {
            return this.orderIndex;
        }

        public DescribeComponentPropetiesResponseBodyProperties setPropertyCode(String propertyCode) {
            this.propertyCode = propertyCode;
            return this;
        }
        public String getPropertyCode() {
            return this.propertyCode;
        }

        public DescribeComponentPropetiesResponseBodyProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
