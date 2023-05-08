// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageVulResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateImageVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateImageVulResponseBody self = new OperateImageVulResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateImageVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
