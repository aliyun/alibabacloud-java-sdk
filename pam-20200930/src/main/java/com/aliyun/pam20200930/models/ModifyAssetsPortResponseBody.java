// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class ModifyAssetsPortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAssetsPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetsPortResponseBody self = new ModifyAssetsPortResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAssetsPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
