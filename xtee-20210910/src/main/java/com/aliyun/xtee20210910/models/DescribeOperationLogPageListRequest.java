// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogPageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("startDate")
    public Long startDate;

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

}
