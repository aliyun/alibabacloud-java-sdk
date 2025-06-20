// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartApproveRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static SafeChangeStartApproveRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartApproveRequest self = new SafeChangeStartApproveRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartApproveRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeStartApproveRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeStartApproveRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public SafeChangeStartApproveRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SafeChangeStartApproveRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeStartApproveRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
