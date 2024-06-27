// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListVariablePageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("name")
    public String name;

    @NameInMap("nameListType")
    public String nameListType;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("value")
    public String value;

    public static DescribeNameListVariablePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListVariablePageListRequest self = new DescribeNameListVariablePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListVariablePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListVariablePageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListVariablePageListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeNameListVariablePageListRequest setNameListType(String nameListType) {
        this.nameListType = nameListType;
        return this;
    }
    public String getNameListType() {
        return this.nameListType;
    }

    public DescribeNameListVariablePageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListVariablePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeNameListVariablePageListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
