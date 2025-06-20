// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryApproveFlowRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    @NameInMap("Stage")
    public String stage;

    public static SafeChangeQueryApproveFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryApproveFlowRequest self = new SafeChangeQueryApproveFlowRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryApproveFlowRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeQueryApproveFlowRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeQueryApproveFlowRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeQueryApproveFlowRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public SafeChangeQueryApproveFlowRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

}
