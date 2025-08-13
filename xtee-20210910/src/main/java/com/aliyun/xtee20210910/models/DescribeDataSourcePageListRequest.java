// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourcePageListRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Request source IP.</p>
     * 
     * <strong>example:</strong>
     * <p>220.250.21.83</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Long currentPage;

    /**
     * <p>Variable name</p>
     * 
     * <strong>example:</strong>
     * <p>data_source</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Type</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeDataSourcePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcePageListRequest self = new DescribeDataSourcePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataSourcePageListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDataSourcePageListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataSourcePageListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDataSourcePageListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDataSourcePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeDataSourcePageListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
