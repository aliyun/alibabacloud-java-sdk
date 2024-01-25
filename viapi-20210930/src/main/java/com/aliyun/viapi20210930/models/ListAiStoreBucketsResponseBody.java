// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class ListAiStoreBucketsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAiStoreBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiStoreBucketsResponseBody self = new ListAiStoreBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiStoreBucketsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListAiStoreBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
