// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeUserAnalyzerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FFAEF396-10EF-53C7-1F51-518853880729</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the custom analyzer.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DescribeUserAnalyzerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAnalyzerResponseBody self = new DescribeUserAnalyzerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAnalyzerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserAnalyzerResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
