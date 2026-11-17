// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBaseContentsRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The search keyword. Fuzzy search on version names is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Product description</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>event_time: the event creation time</li>
     * <li>event_execute_start_time: the event execution start time</li>
     * <li>event_execute_finish_time: the event execution completion time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>Specifies the sort order. This parameter takes effect only when sortBy is specified. Valid values: ASC and DESC. The values are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The list of service source types.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE,WEB_PAGE</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypes;

    /**
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, it is explicitly passed by using the --tenant-id option.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListUserVisibleKnowledgeBaseContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBaseContentsRequest self = new ListUserVisibleKnowledgeBaseContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    public ListUserVisibleKnowledgeBaseContentsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
