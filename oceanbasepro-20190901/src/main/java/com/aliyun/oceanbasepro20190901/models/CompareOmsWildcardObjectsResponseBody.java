// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CompareOmsWildcardObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CompareOmsWildcardObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareOmsWildcardObjectsResponseBody self = new CompareOmsWildcardObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareOmsWildcardObjectsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CompareOmsWildcardObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareOmsWildcardObjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
