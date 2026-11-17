// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTenantDirectoryRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Default value: 100. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>event_time: the time when the event was created.</li>
     * <li>event_execute_start_time: the time when the event execution started.</li>
     * <li>event_execute_finish_time: the time when the event execution finished.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>The sort order. This parameter takes effect only when the sort field is specified. Valid values: ASC and DESC (case-insensitive).</p>
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
     * <p>string_value</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypes;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListTenantDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantDirectoryRequest self = new ListTenantDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListTenantDirectoryRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListTenantDirectoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTenantDirectoryRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTenantDirectoryRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTenantDirectoryRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    public ListTenantDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
