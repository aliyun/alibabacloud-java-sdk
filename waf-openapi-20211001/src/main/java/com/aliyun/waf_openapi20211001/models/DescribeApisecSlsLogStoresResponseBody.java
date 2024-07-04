// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSlsLogStoresResponseBody extends TeaModel {
    /**
     * <p>The names of the Logstores in Simple Log Service.</p>
     */
    @NameInMap("LogStores")
    public java.util.List<String> logStores;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecSlsLogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSlsLogStoresResponseBody self = new DescribeApisecSlsLogStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSlsLogStoresResponseBody setLogStores(java.util.List<String> logStores) {
        this.logStores = logStores;
        return this;
    }
    public java.util.List<String> getLogStores() {
        return this.logStores;
    }

    public DescribeApisecSlsLogStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
