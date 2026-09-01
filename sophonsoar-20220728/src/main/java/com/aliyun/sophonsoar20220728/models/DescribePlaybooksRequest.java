// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksRequest extends TeaModel {
    /**
     * <p>The status of the playbook. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: The playbook is enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: The playbook is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The end of the time range to query. This value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683858064361</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
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
     * <p>The sort order. Default value: <strong>desc</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>desc</strong>: descending.</p>
     * </li>
     * <li><p><strong>asc</strong>: ascending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The type of the playbook. Valid values:</p>
     * <ul>
     * <li><p><strong>preset</strong>: predefined playbook.</p>
     * </li>
     * <li><p><strong>user</strong>: custom playbook.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("OwnType")
    public String ownType;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 10 entries are returned by default.</p>
     * <blockquote>
     * <p>Specify a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The trigger type of the playbook. If you do not specify this parameter, playbooks of all trigger types are queried. Valid values:</p>
     * <ul>
     * <li><p><strong>template-incident</strong>: security event.</p>
     * </li>
     * <li><p><strong>template-ip</strong>: IP entity.</p>
     * </li>
     * <li><p><strong>template-file</strong>: file entity.</p>
     * </li>
     * <li><p><strong>template-process</strong>: process entity.</p>
     * </li>
     * <li><p><strong>template-alert</strong>: security alert.</p>
     * </li>
     * <li><p><strong>template-domain</strong>: domain name entity.</p>
     * </li>
     * <li><p><strong>template-container</strong>: container entity.</p>
     * </li>
     * <li><p><strong>template-host</strong>: host entity.</p>
     * </li>
     * <li><p><strong>template-custom</strong>: custom.</p>
     * </li>
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
     * <p>Call the <a href="~~CreatePlaybook~~">CreatePlaybook</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>A comma-separated list of playbook UUIDs. You can specify up to 100 UUIDs.</p>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx,8rrt6cff-319e-4ede-97bc-1xxxxxx</p>
     */
    @NameInMap("PlaybookUuids")
    public String playbookUuids;

    /**
     * <p>The field to sort by. Default value: <strong>1</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: last modification time.</p>
     * </li>
     * <li><p><strong>2</strong>: last running time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sort")
    public Integer sort;

    /**
     * <p>The start of the time range to query. This value is a 13-digit timestamp.</p>
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
