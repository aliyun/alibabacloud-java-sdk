// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>516A02B7-2167-8D92-12D0-B639A2A0F3C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The entries of the custom analyzer. For more information, see <a href="https://www.alibabacloud.com/help/en/open-search/industry-algorithm-edition/useranalyzerentry">UserAnalyzerEntry</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ListUserAnalyzerEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesResponseBody self = new ListUserAnalyzerEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzerEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAnalyzerEntriesResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
