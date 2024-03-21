// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckMaterialValidityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckMaterialValidityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMaterialValidityResponseBody self = new CheckMaterialValidityResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMaterialValidityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
