// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaDownloadCollectorResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OmaDownloadCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OmaDownloadCollectorResponseBody self = new OmaDownloadCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public OmaDownloadCollectorResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public OmaDownloadCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OmaDownloadCollectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
