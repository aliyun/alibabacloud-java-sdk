// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingResponseBody extends TeaModel {
    /**
     * <p>The binding information.</p>
     */
    @NameInMap("OutlineBinding")
    public DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOutlineBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutlineBindingResponseBody self = new DescribeOutlineBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutlineBindingResponseBody setOutlineBinding(DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding) {
        this.outlineBinding = outlineBinding;
        return this;
    }
    public DescribeOutlineBindingResponseBodyOutlineBinding getOutlineBinding() {
        return this.outlineBinding;
    }

    public DescribeOutlineBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOutlineBindingResponseBodyOutlineBinding extends TeaModel {
        /**
         * <p>The bound index.</p>
         */
        @NameInMap("BindIndex")
        public String bindIndex;

        /**
         * <p>The bound plan.</p>
         */
        @NameInMap("BindPlan")
        public String bindPlan;

        /**
         * <p>The maximum number of concurrent tasks.</p>
         */
        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        /**
         * <p>OutlineID.</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        /**
         * <p>表名称</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeOutlineBindingResponseBodyOutlineBinding build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutlineBindingResponseBodyOutlineBinding self = new DescribeOutlineBindingResponseBodyOutlineBinding();
            return TeaModel.build(map, self);
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setBindIndex(String bindIndex) {
            this.bindIndex = bindIndex;
            return this;
        }
        public String getBindIndex() {
            return this.bindIndex;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setBindPlan(String bindPlan) {
            this.bindPlan = bindPlan;
            return this;
        }
        public String getBindPlan() {
            return this.bindPlan;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setMaxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeOutlineBindingResponseBodyOutlineBinding setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
