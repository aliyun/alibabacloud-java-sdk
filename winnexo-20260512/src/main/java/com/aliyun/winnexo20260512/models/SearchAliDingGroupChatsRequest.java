// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SearchAliDingGroupChatsRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The cursor for the paged query. Set this parameter to 0 for the first request. For subsequent paging requests, set this parameter to the value of <strong>nextCursor</strong> returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>Specifies whether to exclude muted group chats.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("excludeMuted")
    public Boolean excludeMuted;

    /**
     * <p>The keyword for search. The keyword always matches the name field. If the description field is defined in the schema, the keyword also matches the description field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer project</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
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

    public SearchAliDingGroupChatsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public SearchAliDingGroupChatsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SearchAliDingGroupChatsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
