// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SearchAliDingGroupChatsRequest extends TeaModel {
    /**
     * <p>分页游标，首页传 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>是否排除免打扰群聊</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("excludeMuted")
    public Boolean excludeMuted;

    /**
     * <p>群聊搜索关键词</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>客户项目</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>每页条数，范围 1-100</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>租户 ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SearchAliDingGroupChatsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAliDingGroupChatsRequest self = new SearchAliDingGroupChatsRequest();
        return TeaModel.build(map, self);
    }

    public SearchAliDingGroupChatsRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public SearchAliDingGroupChatsRequest setExcludeMuted(Boolean excludeMuted) {
        this.excludeMuted = excludeMuted;
        return this;
    }
    public Boolean getExcludeMuted() {
        return this.excludeMuted;
    }

    public SearchAliDingGroupChatsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchAliDingGroupChatsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAliDingGroupChatsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
