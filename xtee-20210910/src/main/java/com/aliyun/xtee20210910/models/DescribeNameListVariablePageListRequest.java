// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListVariablePageListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Variable name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Variable type</p>
     * 
     * <strong>example:</strong>
     * <p>accountId</p>
     */
    @NameInMap("nameListType")
    public String nameListType;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Name list value</p>
     * 
     * <strong>example:</strong>
     * <p>valuexxx</p>
     */
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
