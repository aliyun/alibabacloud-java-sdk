// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListSupportObjectSuffixResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <strong>example:</strong>
     * <p>2220FE66-76EF-5D9D-A0EE-3221CC******</p>
     */
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
