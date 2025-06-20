// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeStartRequest extends TeaModel {
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

    public static ChangeStartRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeStartRequest self = new ChangeStartRequest();
        return TeaModel.build(map, self);
    }

    public ChangeStartRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ChangeStartRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public ChangeStartRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public ChangeStartRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public ChangeStartRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public ChangeStartRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public ChangeStartRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public ChangeStartRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public ChangeStartRequest setCurBatchNo(Integer curBatchNo) {
        this.curBatchNo = curBatchNo;
        return this;
    }
    public Integer getCurBatchNo() {
        return this.curBatchNo;
    }

    public ChangeStartRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public ChangeStartRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public ChangeStartRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public ChangeStartRequest setTotalBatchNo(Integer totalBatchNo) {
        this.totalBatchNo = totalBatchNo;
        return this;
    }
    public Integer getTotalBatchNo() {
        return this.totalBatchNo;
    }

}
