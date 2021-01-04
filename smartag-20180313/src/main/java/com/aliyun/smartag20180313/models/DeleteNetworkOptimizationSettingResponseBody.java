// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkOptimizationSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationSettingResponseBody self = new DeleteNetworkOptimizationSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
