// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public String id;

    public static ModifyDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDirectoryResponseBody self = new ModifyDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDirectoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
