// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsObSyncDatahubProjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOmsObSyncDatahubProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsObSyncDatahubProjectResponseBody self = new UpdateOmsObSyncDatahubProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOmsObSyncDatahubProjectResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateOmsObSyncDatahubProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
