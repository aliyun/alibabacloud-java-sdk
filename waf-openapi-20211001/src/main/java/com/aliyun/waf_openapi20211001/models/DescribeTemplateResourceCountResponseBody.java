// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourceCountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of protected objects or protected object groups for which the protection template takes effect.</p>
     */
    @NameInMap("ResourceCount")
    public java.util.List<DescribeTemplateResourceCountResponseBodyResourceCount> resourceCount;

    public static DescribeTemplateResourceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourceCountResponseBody self = new DescribeTemplateResourceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateResourceCountResponseBody setResourceCount(java.util.List<DescribeTemplateResourceCountResponseBodyResourceCount> resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public java.util.List<DescribeTemplateResourceCountResponseBodyResourceCount> getResourceCount() {
        return this.resourceCount;
    }

    public static class DescribeTemplateResourceCountResponseBodyResourceCount extends TeaModel {
        /**
         * <p>The number of protected object groups.</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>The number of protected objects.</p>
         */
        @NameInMap("SingleCount")
        public Integer singleCount;

        /**
         * <p>The ID of the protection template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeTemplateResourceCountResponseBodyResourceCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateResourceCountResponseBodyResourceCount self = new DescribeTemplateResourceCountResponseBodyResourceCount();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateResourceCountResponseBodyResourceCount setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeTemplateResourceCountResponseBodyResourceCount setSingleCount(Integer singleCount) {
            this.singleCount = singleCount;
            return this;
        }
        public Integer getSingleCount() {
            return this.singleCount;
        }

        public DescribeTemplateResourceCountResponseBodyResourceCount setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
