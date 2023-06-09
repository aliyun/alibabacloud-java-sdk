// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   en-US: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Query")
    public java.util.List<String> query;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>For more information about the resource types that are supported by Resource Center, see [Services that work with Resource Center](~~477798~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesRequest self = new ListResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListResourceTypesRequest setQuery(java.util.List<String> query) {
        this.query = query;
        return this;
    }
    public java.util.List<String> getQuery() {
        return this.query;
    }

    public ListResourceTypesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
