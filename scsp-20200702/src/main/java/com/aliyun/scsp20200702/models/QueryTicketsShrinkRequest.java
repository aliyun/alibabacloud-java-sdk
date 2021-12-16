// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryTicketsShrinkRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseStatus")
    public Integer caseStatus;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DealId")
    public Long dealId;

    @NameInMap("EndCaseGmtCreate")
    public Long endCaseGmtCreate;

    @NameInMap("Extra")
    public String extraShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentCaseId")
    public Long parentCaseId;

    @NameInMap("SrType")
    public Long srType;

    @NameInMap("StartCaseGmtCreate")
    public Long startCaseGmtCreate;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TouchId")
    public Long touchId;

    public static QueryTicketsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsShrinkRequest self = new QueryTicketsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketsShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public QueryTicketsShrinkRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryTicketsShrinkRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public QueryTicketsShrinkRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
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

    public QueryTicketsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryTicketsShrinkRequest setDealId(Long dealId) {
        this.dealId = dealId;
        return this;
    }
    public Long getDealId() {
        return this.dealId;
    }

    public QueryTicketsShrinkRequest setEndCaseGmtCreate(Long endCaseGmtCreate) {
        this.endCaseGmtCreate = endCaseGmtCreate;
        return this;
    }
    public Long getEndCaseGmtCreate() {
        return this.endCaseGmtCreate;
    }

    public QueryTicketsShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public QueryTicketsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTicketsShrinkRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public QueryTicketsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketsShrinkRequest setParentCaseId(Long parentCaseId) {
        this.parentCaseId = parentCaseId;
        return this;
    }
    public Long getParentCaseId() {
        return this.parentCaseId;
    }

    public QueryTicketsShrinkRequest setSrType(Long srType) {
        this.srType = srType;
        return this;
    }
    public Long getSrType() {
        return this.srType;
    }

    public QueryTicketsShrinkRequest setStartCaseGmtCreate(Long startCaseGmtCreate) {
        this.startCaseGmtCreate = startCaseGmtCreate;
        return this;
    }
    public Long getStartCaseGmtCreate() {
        return this.startCaseGmtCreate;
    }

    public QueryTicketsShrinkRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTicketsShrinkRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

}
