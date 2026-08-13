// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBasesRequest extends TeaModel {
    /**
     * <p>知识库名称或描述关键词；不传时返回全部可见知识库</p>
     * 
     * <strong>example:</strong>
     * <p>产品知识</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
