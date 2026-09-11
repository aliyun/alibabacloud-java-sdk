// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphSchemasRequest extends TeaModel {
    /**
     * <p>关键词，匹配 graphName / displayName（可选，忽略大小写）</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>语义标签过滤（可选，命中任一标签即保留）</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;销售&quot;]</p>
     */
    @NameInMap("semanticTags")
    public java.util.List<String> semanticTags;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
