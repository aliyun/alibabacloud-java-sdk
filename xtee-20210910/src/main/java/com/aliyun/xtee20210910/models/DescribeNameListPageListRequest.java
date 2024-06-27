// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListPageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("updateBeginTime")
    public Long updateBeginTime;

    @NameInMap("updateEndTime")
    public Long updateEndTime;

    @NameInMap("value")
    public String value;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("variableId")
    public Long variableId;

    public static DescribeNameListPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListPageListRequest self = new DescribeNameListPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeNameListPageListRequest setUpdateBeginTime(Long updateBeginTime) {
        this.updateBeginTime = updateBeginTime;
        return this;
    }
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    public DescribeNameListPageListRequest setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    public DescribeNameListPageListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DescribeNameListPageListRequest setVariableId(Long variableId) {
        this.variableId = variableId;
        return this;
    }
    public Long getVariableId() {
        return this.variableId;
    }

}
