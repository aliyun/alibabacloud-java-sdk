// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSkillsShrinkRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The binding status. Valid values: BOUND (bound) and UNBOUND (unbound global skills). Must be specified together with operatingObjectName.</p>
     * 
     * <strong>example:</strong>
     * <p>BOUND</p>
     */
    @NameInMap("bindStatus")
    public String bindStatus;

    /**
     * <p>The filter expression type. Valid values:</p>
     * <ul>
     * <li>SQL: SQL filtering.</li>
     * <li>TAG: Tag filtering.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>The search keyword. Supports fuzzy search by API name or exact search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample keyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The name of the digital employee. Used to calculate the CodeAgent allowedSkills whitelist based on binding relationships.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. Used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. Used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The tag filtering parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;[{\&quot;value\&quot;:\&quot;dataworks#0#1#34167#432313#T3_23030136354#86969667366\&quot;,\&quot;key\&quot;:\&quot;dataworksTag\&quot;}]&quot;]</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListSkillsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsShrinkRequest self = new ListSkillsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListSkillsShrinkRequest setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
        return this;
    }
    public String getBindStatus() {
        return this.bindStatus;
    }

    public ListSkillsShrinkRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public ListSkillsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSkillsShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListSkillsShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListSkillsShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListSkillsShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSkillsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListSkillsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
