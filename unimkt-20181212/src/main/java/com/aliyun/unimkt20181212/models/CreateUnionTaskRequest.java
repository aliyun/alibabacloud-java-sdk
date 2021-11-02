// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateUnionTaskRequest extends TeaModel {
    @NameInMap("BrandUserId")
    public Long brandUserId;

    @NameInMap("BrandUserNick")
    public String brandUserNick;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContentId")
    public Long contentId;

    @NameInMap("ContentUrl")
    public String contentUrl;

    @NameInMap("CustomCreativeType")
    public String customCreativeType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IndustryLabelBagId")
    public Integer industryLabelBagId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    @NameInMap("Quota")
    public Long quota;

    @NameInMap("QuotaDay")
    public Long quotaDay;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskBizType")
    public String taskBizType;

    @NameInMap("TaskRuleType")
    public String taskRuleType;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateUnionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnionTaskRequest self = new CreateUnionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnionTaskRequest setBrandUserId(Long brandUserId) {
        this.brandUserId = brandUserId;
        return this;
    }
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    public CreateUnionTaskRequest setBrandUserNick(String brandUserNick) {
        this.brandUserNick = brandUserNick;
        return this;
    }
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    public CreateUnionTaskRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateUnionTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateUnionTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUnionTaskRequest setContentId(Long contentId) {
        this.contentId = contentId;
        return this;
    }
    public Long getContentId() {
        return this.contentId;
    }

    public CreateUnionTaskRequest setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }
    public String getContentUrl() {
        return this.contentUrl;
    }

    public CreateUnionTaskRequest setCustomCreativeType(String customCreativeType) {
        this.customCreativeType = customCreativeType;
        return this;
    }
    public String getCustomCreativeType() {
        return this.customCreativeType;
    }

    public CreateUnionTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateUnionTaskRequest setIndustryLabelBagId(Integer industryLabelBagId) {
        this.industryLabelBagId = industryLabelBagId;
        return this;
    }
    public Integer getIndustryLabelBagId() {
        return this.industryLabelBagId;
    }

    public CreateUnionTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUnionTaskRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public CreateUnionTaskRequest setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public CreateUnionTaskRequest setQuotaDay(Long quotaDay) {
        this.quotaDay = quotaDay;
        return this;
    }
    public Long getQuotaDay() {
        return this.quotaDay;
    }

    public CreateUnionTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateUnionTaskRequest setTaskBizType(String taskBizType) {
        this.taskBizType = taskBizType;
        return this;
    }
    public String getTaskBizType() {
        return this.taskBizType;
    }

    public CreateUnionTaskRequest setTaskRuleType(String taskRuleType) {
        this.taskRuleType = taskRuleType;
        return this;
    }
    public String getTaskRuleType() {
        return this.taskRuleType;
    }

    public CreateUnionTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
