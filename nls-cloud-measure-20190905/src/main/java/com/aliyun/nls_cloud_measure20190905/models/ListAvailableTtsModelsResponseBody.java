// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_measure20190905.models;

import com.aliyun.tea.*;

public class ListAvailableTtsModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ListAvailableTtsModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsModelsResponseBody self = new ListAvailableTtsModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableTtsModelsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
