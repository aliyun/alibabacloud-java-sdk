// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterNamesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<String> result;

    public static ListClusterNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNamesResponseBody self = new ListClusterNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterNamesResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
