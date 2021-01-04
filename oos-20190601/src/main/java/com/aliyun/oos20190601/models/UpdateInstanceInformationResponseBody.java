// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstanceInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInformationResponseBody self = new UpdateInstanceInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
