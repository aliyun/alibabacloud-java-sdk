// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoginBaseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginBaseConfigResponseBody self = new ModifyLoginBaseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoginBaseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
