// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TagResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponse self = new TagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTagResourcesResponseTagResourcesTagResource extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("ResourcId")
        @Validation(required = true)
        public String resourcId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        public static ListTagResourcesResponseTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseTagResourcesTagResource self = new ListTagResourcesResponseTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

    }

    public static class ListTagResourcesResponseTagResources extends TeaModel {
        @NameInMap("TagResource")
        @Validation(required = true)
        public java.util.List<ListTagResourcesResponseTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseTagResources self = new ListTagResourcesResponseTagResources();
            return TeaModel.build(map, self);
        }

    }

}
