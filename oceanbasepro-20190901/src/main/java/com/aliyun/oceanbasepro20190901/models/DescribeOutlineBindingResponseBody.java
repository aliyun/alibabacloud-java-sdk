// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingResponseBody extends TeaModel {
    // 绑定信息
    @NameInMap("OutlineBinding")
    public DescribeOutlineBindingResponseBodyOutlineBinding outlineBinding;

    // 请求ID
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
        // 绑定索引
        @NameInMap("BindIndex")
        public String bindIndex;

        // 绑定计划
        @NameInMap("BindPlan")
        public String bindPlan;

        // 最大并发
        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        // OutlineID
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
