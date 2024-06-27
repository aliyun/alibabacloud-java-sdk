// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupAccountPageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("communityNo")
    public String communityNo;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("direction")
    public String direction;

    @NameInMap("fieldKey")
    public String fieldKey;

    @NameInMap("fieldVal")
    public String fieldVal;

    @NameInMap("isPage")
    public Boolean isPage;

    @NameInMap("order")
    public String order;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("taskId")
    public String taskId;

    public static DescribeGroupAccountPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupAccountPageRequest self = new DescribeGroupAccountPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupAccountPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupAccountPageRequest setCommunityNo(String communityNo) {
        this.communityNo = communityNo;
        return this;
    }
    public String getCommunityNo() {
        return this.communityNo;
    }

    public DescribeGroupAccountPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupAccountPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGroupAccountPageRequest setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public DescribeGroupAccountPageRequest setFieldVal(String fieldVal) {
        this.fieldVal = fieldVal;
        return this;
    }
    public String getFieldVal() {
        return this.fieldVal;
    }

    public DescribeGroupAccountPageRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeGroupAccountPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeGroupAccountPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupAccountPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeGroupAccountPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
