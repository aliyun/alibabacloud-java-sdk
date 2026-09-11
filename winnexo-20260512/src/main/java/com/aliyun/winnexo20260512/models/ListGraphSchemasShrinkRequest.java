// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphSchemasShrinkRequest extends TeaModel {
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
    public String semanticTagsShrink;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListGraphSchemasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasShrinkRequest self = new ListGraphSchemasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGraphSchemasShrinkRequest setSemanticTagsShrink(String semanticTagsShrink) {
        this.semanticTagsShrink = semanticTagsShrink;
        return this;
    }
    public String getSemanticTagsShrink() {
        return this.semanticTagsShrink;
    }

    public ListGraphSchemasShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
