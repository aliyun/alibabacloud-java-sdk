// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class QueryMLServiceResultsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    @NameInMap("status")
    public java.util.Map<String, String> status;

    public static QueryMLServiceResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMLServiceResultsResponseBody self = new QueryMLServiceResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMLServiceResultsResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public QueryMLServiceResultsResponseBody setStatus(java.util.Map<String, String> status) {
        this.status = status;
        return this;
    }
    public java.util.Map<String, String> getStatus() {
        return this.status;
    }

}
