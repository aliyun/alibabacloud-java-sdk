// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskIssueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CloseTime")
    public String closeTime;

    @NameInMap("CurrentUserOwner")
    public Boolean currentUserOwner;

    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("FalseAlarm")
    public Boolean falseAlarm;

    @NameInMap("FundLoss")
    public Boolean fundLoss;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("IssueCode")
    public String issueCode;

    @NameInMap("IssueId")
    public Long issueId;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Processor")
    public String processor;

    @NameInMap("ProcessDuration")
    public String processDuration;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Status")
    public String status;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static GetClriskIssueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskIssueResponseBody self = new GetClriskIssueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskIssueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskIssueResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskIssueResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskIssueResponseBody setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }
    public String getCloseTime() {
        return this.closeTime;
    }

    public GetClriskIssueResponseBody setCurrentUserOwner(Boolean currentUserOwner) {
        this.currentUserOwner = currentUserOwner;
        return this;
    }
    public Boolean getCurrentUserOwner() {
        return this.currentUserOwner;
    }

    public GetClriskIssueResponseBody setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public GetClriskIssueResponseBody setFalseAlarm(Boolean falseAlarm) {
        this.falseAlarm = falseAlarm;
        return this;
    }
    public Boolean getFalseAlarm() {
        return this.falseAlarm;
    }

    public GetClriskIssueResponseBody setFundLoss(Boolean fundLoss) {
        this.fundLoss = fundLoss;
        return this;
    }
    public Boolean getFundLoss() {
        return this.fundLoss;
    }

    public GetClriskIssueResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetClriskIssueResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetClriskIssueResponseBody setIssueCode(String issueCode) {
        this.issueCode = issueCode;
        return this;
    }
    public String getIssueCode() {
        return this.issueCode;
    }

    public GetClriskIssueResponseBody setIssueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }
    public Long getIssueId() {
        return this.issueId;
    }

    public GetClriskIssueResponseBody setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GetClriskIssueResponseBody setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public GetClriskIssueResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public GetClriskIssueResponseBody setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public String getProcessor() {
        return this.processor;
    }

    public GetClriskIssueResponseBody setProcessDuration(String processDuration) {
        this.processDuration = processDuration;
        return this;
    }
    public String getProcessDuration() {
        return this.processDuration;
    }

    public GetClriskIssueResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetClriskIssueResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetClriskIssueResponseBody setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public GetClriskIssueResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetClriskIssueResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClriskIssueResponseBody setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}
