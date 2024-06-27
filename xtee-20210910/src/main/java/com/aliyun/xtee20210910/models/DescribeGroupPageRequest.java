// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupPageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("direction")
    public String direction;

    @NameInMap("order")
    public String order;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("timeType")
    public String timeType;

    public static DescribeGroupPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupPageRequest self = new DescribeGroupPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGroupPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeGroupPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeGroupPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeGroupPageRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

}
