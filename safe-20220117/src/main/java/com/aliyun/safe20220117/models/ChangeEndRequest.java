// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeEndRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("ChangeEndTime")
    public Long changeEndTime;

    @NameInMap("ChangeResult")
    public String changeResult;

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

    public static ChangeEndRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeEndRequest self = new ChangeEndRequest();
        return TeaModel.build(map, self);
    }

    public ChangeEndRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ChangeEndRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public ChangeEndRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public ChangeEndRequest setChangeResult(String changeResult) {
        this.changeResult = changeResult;
        return this;
    }
    public String getChangeResult() {
        return this.changeResult;
    }

    public ChangeEndRequest setCurBatchNo(Integer curBatchNo) {
        this.curBatchNo = curBatchNo;
        return this;
    }
    public Integer getCurBatchNo() {
        return this.curBatchNo;
    }

    public ChangeEndRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public ChangeEndRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public ChangeEndRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public ChangeEndRequest setTotalBatchNo(Integer totalBatchNo) {
        this.totalBatchNo = totalBatchNo;
        return this;
    }
    public Integer getTotalBatchNo() {
        return this.totalBatchNo;
    }

}
