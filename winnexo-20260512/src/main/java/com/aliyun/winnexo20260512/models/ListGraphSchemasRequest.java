// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphSchemasRequest extends TeaModel {
    /**
     * <p>The keyword for fuzzy match of component data in the form.</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The semantic tags used for filtering. A graph is retained if any tag matches.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Sales&quot;]</p>
     */
    @NameInMap("semanticTags")
    public java.util.List<String> semanticTags;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListGraphSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasRequest self = new ListGraphSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGraphSchemasRequest setSemanticTags(java.util.List<String> semanticTags) {
        this.semanticTags = semanticTags;
        return this;
    }
    public java.util.List<String> getSemanticTags() {
        return this.semanticTags;
    }

    public ListGraphSchemasRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
