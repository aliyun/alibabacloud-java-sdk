// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMLServiceResultsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    @NameInMap("status")
    public java.util.Map<String, String> status;

    public static GetMLServiceResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMLServiceResultsResponseBody self = new GetMLServiceResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMLServiceResultsResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public GetMLServiceResultsResponseBody setStatus(java.util.Map<String, String> status) {
        this.status = status;
        return this;
    }
    public java.util.Map<String, String> getStatus() {
        return this.status;
    }

}
