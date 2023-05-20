// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoNodeResponseBody extends TeaModel {
    @NameInMap("Node")
    public DescribeTraceInfoNodeResponseBodyNode node;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTraceInfoNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoNodeResponseBody self = new DescribeTraceInfoNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoNodeResponseBody setNode(DescribeTraceInfoNodeResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public DescribeTraceInfoNodeResponseBodyNode getNode() {
        return this.node;
    }

    public DescribeTraceInfoNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTraceInfoNodeResponseBodyNodePropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeTraceInfoNodeResponseBodyNodePropertyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoNodeResponseBodyNodePropertyList self = new DescribeTraceInfoNodeResponseBodyNodePropertyList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoNodeResponseBodyNodePropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTraceInfoNodeResponseBodyNodePropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTraceInfoNodeResponseBodyNode extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PropertyList")
        public java.util.List<DescribeTraceInfoNodeResponseBodyNodePropertyList> propertyList;

        @NameInMap("Type")
        public String type;

        public static DescribeTraceInfoNodeResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoNodeResponseBodyNode self = new DescribeTraceInfoNodeResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoNodeResponseBodyNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTraceInfoNodeResponseBodyNode setPropertyList(java.util.List<DescribeTraceInfoNodeResponseBodyNodePropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<DescribeTraceInfoNodeResponseBodyNodePropertyList> getPropertyList() {
            return this.propertyList;
        }

        public DescribeTraceInfoNodeResponseBodyNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
