// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryRelationTicketsRequest extends TeaModel {
    @NameInMap("CaseId")
    public Long caseId;

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
    public java.util.Map<String, ?> extra;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SrType")
    public Integer srType;

    @NameInMap("StartCaseGmtCreate")
    public Long startCaseGmtCreate;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TouchId")
    public Long touchId;

    public static QueryRelationTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationTicketsRequest self = new QueryRelationTicketsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRelationTicketsRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryRelationTicketsRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public QueryRelationTicketsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryRelationTicketsRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QueryRelationTicketsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRelationTicketsRequest setDealId(Long dealId) {
        this.dealId = dealId;
        return this;
    }
    public Long getDealId() {
        return this.dealId;
    }

    public QueryRelationTicketsRequest setEndCaseGmtCreate(Long endCaseGmtCreate) {
        this.endCaseGmtCreate = endCaseGmtCreate;
        return this;
    }
    public Long getEndCaseGmtCreate() {
        return this.endCaseGmtCreate;
    }

    public QueryRelationTicketsRequest setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public QueryRelationTicketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRelationTicketsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public QueryRelationTicketsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRelationTicketsRequest setSrType(Integer srType) {
        this.srType = srType;
        return this;
    }
    public Integer getSrType() {
        return this.srType;
    }

    public QueryRelationTicketsRequest setStartCaseGmtCreate(Long startCaseGmtCreate) {
        this.startCaseGmtCreate = startCaseGmtCreate;
        return this;
    }
    public Long getStartCaseGmtCreate() {
        return this.startCaseGmtCreate;
    }

    public QueryRelationTicketsRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryRelationTicketsRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

}
