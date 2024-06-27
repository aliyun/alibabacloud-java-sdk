// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("value")
    public String value;

    @NameInMap("variableId")
    public String variableId;

    public static DescribeNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListRequest self = new DescribeNameListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeNameListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeNameListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DescribeNameListRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
