// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("CampaignName")
    public String campaignName;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Status")
    public Integer status;

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
