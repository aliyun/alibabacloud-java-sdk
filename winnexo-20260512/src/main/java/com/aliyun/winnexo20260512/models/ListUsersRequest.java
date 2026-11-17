// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The list of cloud account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1182725234319446&quot;]</p>
     */
    @NameInMap("accountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>Specifies whether the account is activated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Activated.</li>
     * <li><strong>false</strong>: Not activated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isActive")
    public Boolean isActive;

    /**
     * <p>The keyword for product search. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample keyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries to return per page.</p>
     * <blockquote>
     * <p>The maximum number of entries per page is 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The list of new system role codes. This is a full replacement and must contain at least one role. Valid values: SUPER_ADMIN, SYSTEM_ADMIN, SEMANTIC_ADMIN, SKILL_ADMIN, KB_ADMIN, AGENT_ADMIN, and APPLICATION_USER.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;string_value&quot;]</p>
     */
    @NameInMap("roleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>The tenant ID. This is a common parameter. winnexo-cli explicitly passes this parameter by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public ListUsersRequest setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    public Boolean getIsActive() {
        return this.isActive;
    }

    public ListUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUsersRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public ListUsersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
