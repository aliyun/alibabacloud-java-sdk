// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCurrentModeResponseBody extends TeaModel {
    @NameInMap("ModeCode")
    public Integer modeCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PaddingModeCode")
    public Integer paddingModeCode;

    @NameInMap("EffectiveAt")
    public Integer effectiveAt;

    @NameInMap("EstimateBandwidth")
    public Integer estimateBandwidth;

    @NameInMap("Code")
    public Integer code;

    public static GetCurrentModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentModeResponseBody self = new GetCurrentModeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentModeResponseBody setModeCode(Integer modeCode) {
        this.modeCode = modeCode;
        return this;
    }
    public Integer getModeCode() {
        return this.modeCode;
    }

    public GetCurrentModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentModeResponseBody setPaddingModeCode(Integer paddingModeCode) {
        this.paddingModeCode = paddingModeCode;
        return this;
    }
    public Integer getPaddingModeCode() {
        return this.paddingModeCode;
    }

    public GetCurrentModeResponseBody setEffectiveAt(Integer effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }
    public Integer getEffectiveAt() {
        return this.effectiveAt;
    }

    public GetCurrentModeResponseBody setEstimateBandwidth(Integer estimateBandwidth) {
        this.estimateBandwidth = estimateBandwidth;
        return this;
    }
    public Integer getEstimateBandwidth() {
        return this.estimateBandwidth;
    }

    public GetCurrentModeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
