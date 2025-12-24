// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksRequest extends TeaModel {
    /**
     * <p>Activation status of the playbook. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Indicates the playbook is activated.</li>
     * <li><strong>0</strong>: Indicates the playbook is not activated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>End time for the query, in 13-digit timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1683858064361</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>Specifies the language type for the request and response, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_playbook</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sorting logic, with a default value of <strong>desc</strong>. Values:</p>
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
     * <p>Type of the playbook. Values:</p>
     * <ul>
     * <li><strong>preset</strong>: Predefined playbook.</li>
     * <li><strong>user</strong>: Custom playbook.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("OwnType")
    public String ownType;

    /**
     * <p>Sets the page number from which to start displaying the query results. The default value is 1, indicating the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Specifies the maximum number of items to display per page in a paginated query. The default number of items per page is 20. If the PageSize parameter is empty, it will return 10 items by default.</p>
     * <blockquote>
     * <p>It is recommended that the PageSize value is not empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The trigger method for the playbook, with a default value of <strong>query all</strong>. Values:</p>
     * <ul>
     * <li><strong>template-incident</strong>: Security incident.</li>
     * <li><strong>template-ip</strong>: IP entity.</li>
     * <li><strong>template-file</strong>: File entity.</li>
     * <li><strong>template-process</strong>: Process entity.</li>
     * <li><strong>template-alert</strong>: Security alert.</li>
     * <li><strong>template-domain</strong>: Domain entity.</li>
     * <li><strong>template-container</strong>: Container entity.</li>
     * <li><strong>template-host</strong>: Host entity.</li>
     * <li><strong>template-custom</strong>: Custom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>template-alert</p>
     */
    @NameInMap("ParamTypes")
    public String paramTypes;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>You can use the UUID to query specific playbook information.</p>
     * <ul>
     * <li>Call the <a href="~~CreatePlaybook~~">CreatePlaybook</a> API to obtain this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>UUID List of the playbook.</p>
     * <p>Note You can use the UUID list to query specific playbook information.
     * Call the DescribePlaybooks API to obtain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx,7745e6cff-319e-4ede-97bc-1xxxxxx</p>
     */
    @NameInMap("PlaybookUuids")
    public String playbookUuids;

    /**
     * <p>The sorting basis, with a default value of <strong>1</strong>. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Last modified time.</li>
     * <li><strong>2</strong>: Most recent execution time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sort")
    public Integer sort;

    /**
     * <p>Start time for the query, in 13-digit timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1683526277415</p>
     */
    @NameInMap("StartMillis")
    public Long startMillis;

    public static DescribePlaybooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybooksRequest self = new DescribePlaybooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlaybooksRequest setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public DescribePlaybooksRequest setEndMillis(Long endMillis) {
        this.endMillis = endMillis;
        return this;
    }
    public Long getEndMillis() {
        return this.endMillis;
    }

    public DescribePlaybooksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePlaybooksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePlaybooksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribePlaybooksRequest setOwnType(String ownType) {
        this.ownType = ownType;
        return this;
    }
    public String getOwnType() {
        return this.ownType;
    }

    public DescribePlaybooksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePlaybooksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlaybooksRequest setParamTypes(String paramTypes) {
        this.paramTypes = paramTypes;
        return this;
    }
    public String getParamTypes() {
        return this.paramTypes;
    }

    public DescribePlaybooksRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DescribePlaybooksRequest setPlaybookUuids(String playbookUuids) {
        this.playbookUuids = playbookUuids;
        return this;
    }
    public String getPlaybookUuids() {
        return this.playbookUuids;
    }

    public DescribePlaybooksRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

    public DescribePlaybooksRequest setStartMillis(Long startMillis) {
        this.startMillis = startMillis;
        return this;
    }
    public Long getStartMillis() {
        return this.startMillis;
    }

}
