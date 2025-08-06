// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadPlayDeviceAbilityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static PreloadPlayDeviceAbilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadPlayDeviceAbilityResponseBody self = new PreloadPlayDeviceAbilityResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadPlayDeviceAbilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreloadPlayDeviceAbilityResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
