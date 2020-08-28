// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
