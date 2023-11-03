// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSupportObjectSuffixResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSupportObjectSuffixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportObjectSuffixResponseBody self = new ListSupportObjectSuffixResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportObjectSuffixResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListSupportObjectSuffixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
