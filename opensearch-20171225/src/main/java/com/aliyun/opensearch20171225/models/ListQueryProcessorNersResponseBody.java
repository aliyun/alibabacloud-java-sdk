// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorNersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The priority settings of entity types.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173616.html">Priority settings of entity types</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListQueryProcessorNersResponseBodyResult> result;

    public static ListQueryProcessorNersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorNersResponseBody self = new ListQueryProcessorNersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorNersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryProcessorNersResponseBody setResult(java.util.List<ListQueryProcessorNersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListQueryProcessorNersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListQueryProcessorNersResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>brand</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The priority of an entity type among entity types that have the same priority level. A smaller value indicates a higher priority. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The priority level of the entity type. Valid values:</p>
         * <ul>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>The internal name of the entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>brand</p>
         */
        @NameInMap("tag")
        public String tag;

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

        public ListQueryProcessorNersResponseBodyResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
