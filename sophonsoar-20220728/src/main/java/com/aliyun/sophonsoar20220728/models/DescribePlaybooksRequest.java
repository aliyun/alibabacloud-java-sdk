// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksRequest extends TeaModel {
    /**
     * <p>The status of the playbook. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
     */
    @NameInMap("EndMillis")
    public Long endMillis;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the playbook.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the playbook. Valid values:</p>
     * <br>
     * <p>*   **preset**: predefined playbook</p>
     * <p>*   **user**: custom playbook</p>
     */
    @NameInMap("OwnType")
    public String ownType;

    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The playbook UUID.</p>
     * <br>
     * <p>>  You can use the UUID to query the information about a specific playbook.</p>
     * <br>
     * <p>*   You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The beginning of the time range to query. The value is a 13-digit timestamp.</p>
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

    public DescribePlaybooksRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DescribePlaybooksRequest setStartMillis(Long startMillis) {
        this.startMillis = startMillis;
        return this;
    }
    public Long getStartMillis() {
        return this.startMillis;
    }

}
