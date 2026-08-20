// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBasesRequest extends TeaModel {
    /**
     * <p>The keyword for fuzzy match on knowledge base name or description.</p>
     * 
     * <strong>example:</strong>
     * <p>Product knowledge</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListUserVisibleKnowledgeBasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBasesRequest self = new ListUserVisibleKnowledgeBasesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBasesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUserVisibleKnowledgeBasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
