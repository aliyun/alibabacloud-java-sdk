// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldPageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("classify")
    public String classify;

    @NameInMap("condition")
    public String condition;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("name")
    public String name;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("source")
    public String source;

    @NameInMap("status")
    public String status;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    public static DescribeFieldPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldPageRequest self = new DescribeFieldPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFieldPageRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public DescribeFieldPageRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public DescribeFieldPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeFieldPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFieldPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFieldPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeFieldPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeFieldPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFieldPageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DescribeFieldPageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
