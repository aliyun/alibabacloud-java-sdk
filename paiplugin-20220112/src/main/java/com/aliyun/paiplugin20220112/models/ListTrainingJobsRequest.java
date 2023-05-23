// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsRequest extends TeaModel {
    /**
     * <p>归属运营活动过滤。</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("CampaignName")
    public String campaignName;

    /**
     * <p>训练任务名称过滤。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>分页数，从1开始，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分页大小，默认为10。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>训练任务备注过滤。</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>训练任务状态过滤。</p>
     * <p>- 0: 队列中。</p>
     * <p>- 1: 已提交。</p>
     * <p>- 2: 运行中。</p>
     * <p>- 3: 成功。</p>
     * <p>- 4: 失败。</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>归属训练计划过滤。</p>
     */
    @NameInMap("TrainingScheduleId")
    public String trainingScheduleId;

    public static ListTrainingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsRequest self = new ListTrainingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListTrainingJobsRequest setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }
    public String getCampaignName() {
        return this.campaignName;
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

    public ListTrainingJobsRequest setTrainingScheduleId(String trainingScheduleId) {
        this.trainingScheduleId = trainingScheduleId;
        return this;
    }
    public String getTrainingScheduleId() {
        return this.trainingScheduleId;
    }

}
