// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListSkillRequest extends TeaModel {
    /**
     * <p>The supported languages. Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>zh-TW: Traditional Chinese</li>
     * <li>en-US: English</li>
     * <li>ja-JP: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The search parameter for skill name or description. This filter is not currently enabled in the ContextDB management console.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The ContextDB query scope. Valid values: all (default), private, and system.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The sort parameter for skills. This sorting is not currently enabled in the ContextDB management console.</p>
     * 
     * <strong>example:</strong>
     * <p>updated_at_desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The filter parameter for skill source. This filter is not currently enabled in the ContextDB management console.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ContextDB workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillRequest self = new ListSkillRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListSkillRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSkillRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListSkillRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSkillRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListSkillRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListSkillRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
