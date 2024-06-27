// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("refObjId")
    public String refObjId;

    @NameInMap("regId")
    public String regId;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("type")
    public String type;

    @NameInMap("typesStr")
    public String typesStr;

    @NameInMap("value")
    public String value;

    public static DescribeVariableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableListRequest self = new DescribeVariableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeVariableListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVariableListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVariableListRequest setRefObjId(String refObjId) {
        this.refObjId = refObjId;
        return this;
    }
    public String getRefObjId() {
        return this.refObjId;
    }

    public DescribeVariableListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeVariableListRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeVariableListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVariableListRequest setTypesStr(String typesStr) {
        this.typesStr = typesStr;
        return this;
    }
    public String getTypesStr() {
        return this.typesStr;
    }

    public DescribeVariableListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
