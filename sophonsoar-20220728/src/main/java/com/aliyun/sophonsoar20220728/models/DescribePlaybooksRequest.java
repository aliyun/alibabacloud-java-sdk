// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksRequest extends TeaModel {
    /**
     * <p>The status of the playbook. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1683858064361</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <p>The sorting order. Default value: desc. Valid values:</p>
     * <ul>
     * <li>desc: descending order</li>
     * <li>asc: ascending order</li>
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
     * <li><strong>preset</strong>: predefined playbook</li>
     * <li><strong>user</strong>: custom playbook</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("OwnType")
    public String ownType;

    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ParamTypes")
    public String paramTypes;

    /**
     * <p>The playbook UUID.</p>
     * <blockquote>
     * <p> You can use the UUID to query the information about a specific playbook.</p>
     * </blockquote>
     * <ul>
     * <li>You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The sorting basis. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: last modification time</li>
     * <li>2: last execution time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The beginning of the time range to query. The value is a 13-digit timestamp.</p>
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

    public DescribePlaybooksRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePlaybooksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
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

    public DescribePlaybooksRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
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
