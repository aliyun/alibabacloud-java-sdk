// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryTicketsShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("CaseStatus")
    public Integer caseStatus;

    @NameInMap("SrType")
    public Long srType;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("TouchId")
    public Long touchId;

    @NameInMap("DealId")
    public Long dealId;

    @NameInMap("Extra")
    public String extraShrink;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryTicketsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsShrinkRequest self = new QueryTicketsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTicketsShrinkRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryTicketsShrinkRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public QueryTicketsShrinkRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public QueryTicketsShrinkRequest setSrType(Long srType) {
        this.srType = srType;
        return this;
    }
    public Long getSrType() {
        return this.srType;
    }

    public QueryTicketsShrinkRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTicketsShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryTicketsShrinkRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QueryTicketsShrinkRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

    public QueryTicketsShrinkRequest setDealId(Long dealId) {
        this.dealId = dealId;
        return this;
    }
    public Long getDealId() {
        return this.dealId;
    }

    public QueryTicketsShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public QueryTicketsShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public QueryTicketsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
