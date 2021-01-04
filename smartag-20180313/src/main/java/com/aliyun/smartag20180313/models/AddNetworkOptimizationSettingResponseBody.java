// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddNetworkOptimizationSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddNetworkOptimizationSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkOptimizationSettingResponseBody self = new AddNetworkOptimizationSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public AddNetworkOptimizationSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
