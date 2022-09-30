// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingResponseBody extends TeaModel {
    @NameInMap("OutlineBinding")
    public DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding;

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
        @NameInMap("BindIndex")
        public String bindIndex;

        @NameInMap("BindPlan")
        public String bindPlan;

        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        @NameInMap("OutlineId")
        public Long outlineId;

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

    }

}
