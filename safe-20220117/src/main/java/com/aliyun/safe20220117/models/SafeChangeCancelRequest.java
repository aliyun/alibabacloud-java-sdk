// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCancelRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgVid")
    public String bgVid;

    @NameInMap("OperateEmpNo")
    public String operateEmpNo;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static SafeChangeCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCancelRequest self = new SafeChangeCancelRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeCancelRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeCancelRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeCancelRequest setBgVid(String bgVid) {
        this.bgVid = bgVid;
        return this;
    }
    public String getBgVid() {
        return this.bgVid;
    }

    public SafeChangeCancelRequest setOperateEmpNo(String operateEmpNo) {
        this.operateEmpNo = operateEmpNo;
        return this;
    }
    public String getOperateEmpNo() {
        return this.operateEmpNo;
    }

    public SafeChangeCancelRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeCancelRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
