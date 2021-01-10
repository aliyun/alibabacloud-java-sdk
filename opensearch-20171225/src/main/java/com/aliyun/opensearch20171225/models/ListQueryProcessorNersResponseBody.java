// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorNersResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListQueryProcessorNersResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListQueryProcessorNersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorNersResponseBody self = new ListQueryProcessorNersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorNersResponseBody setResult(java.util.List<ListQueryProcessorNersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListQueryProcessorNersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListQueryProcessorNersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueryProcessorNersResponseBodyResult extends TeaModel {
        @NameInMap("label")
        public String label;

        @NameInMap("tag")
        public String tag;

        @NameInMap("order")
        public Integer order;

        @NameInMap("priority")
        public String priority;

        public static ListQueryProcessorNersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListQueryProcessorNersResponseBodyResult self = new ListQueryProcessorNersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListQueryProcessorNersResponseBodyResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListQueryProcessorNersResponseBodyResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQueryProcessorNersResponseBodyResult setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListQueryProcessorNersResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

    }

}
