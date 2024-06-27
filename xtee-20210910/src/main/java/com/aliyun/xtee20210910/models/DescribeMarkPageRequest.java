// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMarkPageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("direction")
    public String direction;

    @NameInMap("isPage")
    public Boolean isPage;

    @NameInMap("order")
    public String order;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("taskLogId")
    public String taskLogId;

    public static DescribeMarkPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarkPageRequest self = new DescribeMarkPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMarkPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMarkPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMarkPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeMarkPageRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeMarkPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeMarkPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeMarkPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeMarkPageRequest setTaskLogId(String taskLogId) {
        this.taskLogId = taskLogId;
        return this;
    }
    public String getTaskLogId() {
        return this.taskLogId;
    }

}
