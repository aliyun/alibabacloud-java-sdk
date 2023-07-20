// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeAssetRefreshTaskConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeAssetRefreshTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeAssetRefreshTaskConfigResponseBody self = new ChangeAssetRefreshTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeAssetRefreshTaskConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ChangeAssetRefreshTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeAssetRefreshTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
