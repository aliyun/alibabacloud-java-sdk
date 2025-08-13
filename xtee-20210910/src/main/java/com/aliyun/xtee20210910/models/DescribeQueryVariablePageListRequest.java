// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariablePageListRequest extends TeaModel {
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
    public Long currentPage;

    /**
     * <p>Data source code</p>
     * 
     * <strong>example:</strong>
     * <p>ds_vcaoii1697</p>
     */
    @NameInMap("dataSourceCode")
    public String dataSourceCode;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahpayh4121</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Query variable name</p>
     * 
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeQueryVariablePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariablePageListRequest self = new DescribeQueryVariablePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariablePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeQueryVariablePageListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeQueryVariablePageListRequest setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
        return this;
    }
    public String getDataSourceCode() {
        return this.dataSourceCode;
    }

    public DescribeQueryVariablePageListRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeQueryVariablePageListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeQueryVariablePageListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeQueryVariablePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
