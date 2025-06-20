// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("ChangeEndTime")
    public Long changeEndTime;

    @NameInMap("ChangeObject")
    public String changeObject;

    @NameInMap("ChangeOptType")
    public String changeOptType;

    @NameInMap("ChangeStartTime")
    public Long changeStartTime;

    @NameInMap("ChangeTitle")
    public String changeTitle;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("CurBatchNo")
    public Integer curBatchNo;

    @NameInMap("ExecutorEmpId")
    public String executorEmpId;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    @NameInMap("TotalBatchNo")
    public Integer totalBatchNo;

    public static SafeChangeStartRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartRequest self = new SafeChangeStartRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeStartRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeStartRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public SafeChangeStartRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public SafeChangeStartRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public SafeChangeStartRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public SafeChangeStartRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public SafeChangeStartRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public SafeChangeStartRequest setCurBatchNo(Integer curBatchNo) {
        this.curBatchNo = curBatchNo;
        return this;
    }
    public Integer getCurBatchNo() {
        return this.curBatchNo;
    }

    public SafeChangeStartRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public SafeChangeStartRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeStartRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public SafeChangeStartRequest setTotalBatchNo(Integer totalBatchNo) {
        this.totalBatchNo = totalBatchNo;
        return this;
    }
    public Integer getTotalBatchNo() {
        return this.totalBatchNo;
    }

}
