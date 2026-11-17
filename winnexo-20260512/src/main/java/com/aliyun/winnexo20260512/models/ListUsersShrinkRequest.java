// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUsersShrinkRequest extends TeaModel {
    /**
     * <p>The list of cloud account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1182725234319446&quot;]</p>
     */
    @NameInMap("accountIds")
    public String accountIdsShrink;

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
    public String roleCodesShrink;

    /**
     * <p>The tenant ID. This is a common parameter. winnexo-cli explicitly passes this parameter by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersShrinkRequest self = new ListUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public ListUsersShrinkRequest setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    public Boolean getIsActive() {
        return this.isActive;
    }

    public ListUsersShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUsersShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListUsersShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public ListUsersShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
