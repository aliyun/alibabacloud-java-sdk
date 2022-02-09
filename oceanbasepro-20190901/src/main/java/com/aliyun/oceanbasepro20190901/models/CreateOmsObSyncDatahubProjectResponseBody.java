// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncDatahubProjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOmsObSyncDatahubProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncDatahubProjectResponseBody self = new CreateOmsObSyncDatahubProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncDatahubProjectResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOmsObSyncDatahubProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
