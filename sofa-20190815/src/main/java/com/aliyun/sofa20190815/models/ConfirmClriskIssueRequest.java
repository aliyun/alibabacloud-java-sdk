// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmClriskIssueRequest extends TeaModel {
    @NameInMap("FalseAlarm")
    public Boolean falseAlarm;

    @NameInMap("FundLoss")
    public Boolean fundLoss;

    @NameInMap("IssueId")
    public Long issueId;

    @NameInMap("Memo")
    public String memo;

    public static ConfirmClriskIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmClriskIssueRequest self = new ConfirmClriskIssueRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmClriskIssueRequest setFalseAlarm(Boolean falseAlarm) {
        this.falseAlarm = falseAlarm;
        return this;
    }
    public Boolean getFalseAlarm() {
        return this.falseAlarm;
    }

    public ConfirmClriskIssueRequest setFundLoss(Boolean fundLoss) {
        this.fundLoss = fundLoss;
        return this;
    }
    public Boolean getFundLoss() {
        return this.fundLoss;
    }

    public ConfirmClriskIssueRequest setIssueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }
    public Long getIssueId() {
        return this.issueId;
    }

    public ConfirmClriskIssueRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
