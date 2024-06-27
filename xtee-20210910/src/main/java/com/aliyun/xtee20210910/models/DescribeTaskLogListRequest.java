// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskLogListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("IsPage")
    public Boolean isPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskLogId")
    public String taskLogId;

    @NameInMap("regId")
    public String regId;

    public static DescribeTaskLogListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskLogListRequest self = new DescribeTaskLogListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskLogListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTaskLogListRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeTaskLogListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTaskLogListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTaskLogListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskLogListRequest setTaskLogId(String taskLogId) {
        this.taskLogId = taskLogId;
        return this;
    }
    public String getTaskLogId() {
        return this.taskLogId;
    }

    public DescribeTaskLogListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
