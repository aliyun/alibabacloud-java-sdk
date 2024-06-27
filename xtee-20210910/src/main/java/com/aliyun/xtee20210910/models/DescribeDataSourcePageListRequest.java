// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourcePageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("currentPage")
    public Long currentPage;

    @NameInMap("name")
    public String name;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("regId")
    public String regId;

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
