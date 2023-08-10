// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticLogsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result. For more information, see:</p>
     * <br>
     * <p>*   [Parameters of hotwords rankings](~~421248~~)</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of the queried logs.</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListStatisticLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticLogsResponseBody self = new ListStatisticLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatisticLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatisticLogsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public ListStatisticLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
