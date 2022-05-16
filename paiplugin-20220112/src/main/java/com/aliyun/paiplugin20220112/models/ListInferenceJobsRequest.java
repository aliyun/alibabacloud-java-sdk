// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListInferenceJobsRequest extends TeaModel {
    // 归属运营活动过滤。
    @NameInMap("CampaignId")
    public String campaignId;

    // 预测任务名称过滤。
    @NameInMap("Name")
    public String name;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 预测任务备注过滤。
    @NameInMap("Remark")
    public String remark;

    // 预测任务状态过滤。
    // - 0: 队列中。
    // - 1: 已提交。
    // - 2: 运行中。
    // - 3: 成功。
    // - 4: 失败。
    @NameInMap("Status")
    public Integer status;

    public static ListInferenceJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobsRequest self = new ListInferenceJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobsRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListInferenceJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInferenceJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInferenceJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInferenceJobsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListInferenceJobsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
