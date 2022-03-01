// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsRequest extends TeaModel {
    // 训练任务名称过滤。
    @NameInMap("Name")
    public String name;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 训练任务备注过滤。
    @NameInMap("Remark")
    public String remark;

    // 训练任务状态过滤
    // - 0: 队列中。
    // - 1: 已提交。
    // - 2: 运行中。
    // - 3: 成功。
    // - 4: 失败。
    @NameInMap("Status")
    public Integer status;

    public static ListTrainingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsRequest self = new ListTrainingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTrainingJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrainingJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrainingJobsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListTrainingJobsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
