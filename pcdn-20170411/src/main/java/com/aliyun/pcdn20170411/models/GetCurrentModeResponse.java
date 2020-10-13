// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCurrentModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("ModeCode")
    @Validation(required = true)
    public Integer modeCode;

    @NameInMap("PaddingModeCode")
    @Validation(required = true)
    public Integer paddingModeCode;

    @NameInMap("EffectiveAt")
    @Validation(required = true)
    public Integer effectiveAt;

    @NameInMap("EstimateBandwidth")
    @Validation(required = true)
    public Integer estimateBandwidth;

    public static GetCurrentModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentModeResponse self = new GetCurrentModeResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentModeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCurrentModeResponse setModeCode(Integer modeCode) {
        this.modeCode = modeCode;
        return this;
    }
    public Integer getModeCode() {
        return this.modeCode;
    }

    public GetCurrentModeResponse setPaddingModeCode(Integer paddingModeCode) {
        this.paddingModeCode = paddingModeCode;
        return this;
    }
    public Integer getPaddingModeCode() {
        return this.paddingModeCode;
    }

    public GetCurrentModeResponse setEffectiveAt(Integer effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }
    public Integer getEffectiveAt() {
        return this.effectiveAt;
    }

    public GetCurrentModeResponse setEstimateBandwidth(Integer estimateBandwidth) {
        this.estimateBandwidth = estimateBandwidth;
        return this;
    }
    public Integer getEstimateBandwidth() {
        return this.estimateBandwidth;
    }

}
