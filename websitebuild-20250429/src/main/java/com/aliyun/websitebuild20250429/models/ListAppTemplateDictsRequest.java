// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppTemplateDictsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>product_version</p>
     */
    @NameInMap("DictType")
    public String dictType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAppTemplateDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplateDictsRequest self = new ListAppTemplateDictsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppTemplateDictsRequest setDictType(String dictType) {
        this.dictType = dictType;
        return this;
    }
    public String getDictType() {
        return this.dictType;
    }

    public ListAppTemplateDictsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppTemplateDictsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
