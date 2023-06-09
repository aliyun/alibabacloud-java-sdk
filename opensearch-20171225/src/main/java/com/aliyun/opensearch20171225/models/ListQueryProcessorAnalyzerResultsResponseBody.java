// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorAnalyzerResultsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ListQueryProcessorAnalyzerResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorAnalyzerResultsResponseBody self = new ListQueryProcessorAnalyzerResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorAnalyzerResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryProcessorAnalyzerResultsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
