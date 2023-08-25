// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantTagsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<DescribeTenantTagsResponseBodyTagResources> tagResources;

    public static DescribeTenantTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantTagsResponseBody self = new DescribeTenantTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantTagsResponseBody setTagResources(java.util.List<DescribeTenantTagsResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeTenantTagsResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeTenantTagsResponseBodyTagResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag of the resource.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static DescribeTenantTagsResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantTagsResponseBodyTagResources self = new DescribeTenantTagsResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeTenantTagsResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTenantTagsResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeTenantTagsResponseBodyTagResources setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
