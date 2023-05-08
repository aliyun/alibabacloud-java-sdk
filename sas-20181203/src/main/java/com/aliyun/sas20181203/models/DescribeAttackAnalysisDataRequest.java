// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataRequest extends TeaModel {
    @NameInMap("Base64")
    public String base64;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public String data;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeAttackAnalysisDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisDataRequest self = new DescribeAttackAnalysisDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisDataRequest setBase64(String base64) {
        this.base64 = base64;
        return this;
    }
    public String getBase64() {
        return this.base64;
    }

    public DescribeAttackAnalysisDataRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAttackAnalysisDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeAttackAnalysisDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAttackAnalysisDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAttackAnalysisDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAttackAnalysisDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAttackAnalysisDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
