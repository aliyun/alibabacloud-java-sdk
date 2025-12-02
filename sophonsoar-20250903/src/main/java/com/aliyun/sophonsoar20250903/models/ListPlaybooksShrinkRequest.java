// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ListPlaybooksShrinkRequest extends TeaModel {
    /**
     * <p>Language type for request and response messages.</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Maximum number of results returned in a single request. Range: 1~100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query start.</p>
     * 
     * <strong>example:</strong>
     * <p>7fbb1c****07c1f79a740f039a8dcfda</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sorting logic, default is <strong>desc</strong>, with values as follows:</p>
     * <ul>
     * <li><strong>desc</strong>: Descending order.</li>
     * <li><strong>asc</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Sorting field. Values:</p>
     * <ul>
     * <li><strong>UpdateTime</strong>: Sort by update time.</li>
     * <li><strong>ExecutionTime</strong>: Sort by the latest execution time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>Page number for pagination, default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of items per page for pagination. Range: 1~100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>End time of the latest execution of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>1731379251000</p>
     */
    @NameInMap("PlaybookExecutionEndTime")
    public Long playbookExecutionEndTime;

    /**
     * <p>Start time of the latest execution of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>1731378251000</p>
     */
    @NameInMap("PlaybookExecutionStartTime")
    public Long playbookExecutionStartTime;

    /**
     * <p>Name of the playbook, supports fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_test</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>Collection of input parameter types for the playbook.</p>
     */
    @NameInMap("PlaybookParamTypes")
    public String playbookParamTypesShrink;

    /**
     * <p>Publication status of the playbook, with values as follows:</p>
     * <ul>
     * <li><strong>0</strong>: Unpublished.</li>
     * <li><strong>1</strong>: Published.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlaybookStatus")
    public Integer playbookStatus;

    /**
     * <p>Type of the playbook, with values as follows:</p>
     * <ul>
     * <li><strong>preset</strong>: Predefined playbook.</li>
     * <li><strong>user</strong>: Custom playbook.</li>
     * <li><strong>component</strong>: Security response component.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preset</p>
     */
    @NameInMap("PlaybookType")
    public String playbookType;

    /**
     * <p>Collection of UUIDs of playbooks.</p>
     */
    @NameInMap("PlaybookUuids")
    public String playbookUuidsShrink;

    /**
     * <p>User ID for the administrator to switch to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListPlaybooksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlaybooksShrinkRequest self = new ListPlaybooksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPlaybooksShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListPlaybooksShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPlaybooksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPlaybooksShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListPlaybooksShrinkRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListPlaybooksShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPlaybooksShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPlaybooksShrinkRequest setPlaybookExecutionEndTime(Long playbookExecutionEndTime) {
        this.playbookExecutionEndTime = playbookExecutionEndTime;
        return this;
    }
    public Long getPlaybookExecutionEndTime() {
        return this.playbookExecutionEndTime;
    }

    public ListPlaybooksShrinkRequest setPlaybookExecutionStartTime(Long playbookExecutionStartTime) {
        this.playbookExecutionStartTime = playbookExecutionStartTime;
        return this;
    }
    public Long getPlaybookExecutionStartTime() {
        return this.playbookExecutionStartTime;
    }

    public ListPlaybooksShrinkRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public ListPlaybooksShrinkRequest setPlaybookParamTypesShrink(String playbookParamTypesShrink) {
        this.playbookParamTypesShrink = playbookParamTypesShrink;
        return this;
    }
    public String getPlaybookParamTypesShrink() {
        return this.playbookParamTypesShrink;
    }

    public ListPlaybooksShrinkRequest setPlaybookStatus(Integer playbookStatus) {
        this.playbookStatus = playbookStatus;
        return this;
    }
    public Integer getPlaybookStatus() {
        return this.playbookStatus;
    }

    public ListPlaybooksShrinkRequest setPlaybookType(String playbookType) {
        this.playbookType = playbookType;
        return this;
    }
    public String getPlaybookType() {
        return this.playbookType;
    }

    public ListPlaybooksShrinkRequest setPlaybookUuidsShrink(String playbookUuidsShrink) {
        this.playbookUuidsShrink = playbookUuidsShrink;
        return this;
    }
    public String getPlaybookUuidsShrink() {
        return this.playbookUuidsShrink;
    }

    public ListPlaybooksShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
