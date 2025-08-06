// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class QueryCssOrderForLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCssOrderForLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCssOrderForLicenseResponseBody self = new QueryCssOrderForLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCssOrderForLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryCssOrderForLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
