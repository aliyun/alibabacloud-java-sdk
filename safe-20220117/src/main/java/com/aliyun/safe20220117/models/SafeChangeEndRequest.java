// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeEndRequest extends TeaModel {
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

    public static SafeChangeEndRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeEndRequest self = new SafeChangeEndRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeEndRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeEndRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeEndRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public SafeChangeEndRequest setChangeResult(String changeResult) {
        this.changeResult = changeResult;
        return this;
    }
    public String getChangeResult() {
        return this.changeResult;
    }

    public SafeChangeEndRequest setCurBatchNo(Integer curBatchNo) {
        this.curBatchNo = curBatchNo;
        return this;
    }
    public Integer getCurBatchNo() {
        return this.curBatchNo;
    }

    public SafeChangeEndRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public SafeChangeEndRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeEndRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public SafeChangeEndRequest setTotalBatchNo(Integer totalBatchNo) {
        this.totalBatchNo = totalBatchNo;
        return this;
    }
    public Integer getTotalBatchNo() {
        return this.totalBatchNo;
    }

}
