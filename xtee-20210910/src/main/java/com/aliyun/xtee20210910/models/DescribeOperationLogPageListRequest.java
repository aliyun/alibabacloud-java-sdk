// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogPageListRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1733364850919</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The change content to query.</p>
     * 
     * <strong>example:</strong>
     * <p>修改变量</p>
     */
    @NameInMap("operationSummary")
    public String operationSummary;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1733364850919</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The operator name to query.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("userNameSearch")
    public String userNameSearch;

    public static DescribeOperationLogPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogPageListRequest self = new DescribeOperationLogPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOperationLogPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOperationLogPageListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeOperationLogPageListRequest setOperationSummary(String operationSummary) {
        this.operationSummary = operationSummary;
        return this;
    }
    public String getOperationSummary() {
        return this.operationSummary;
    }

    public DescribeOperationLogPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOperationLogPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeOperationLogPageListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeOperationLogPageListRequest setUserNameSearch(String userNameSearch) {
        this.userNameSearch = userNameSearch;
        return this;
    }
    public String getUserNameSearch() {
        return this.userNameSearch;
    }

}
