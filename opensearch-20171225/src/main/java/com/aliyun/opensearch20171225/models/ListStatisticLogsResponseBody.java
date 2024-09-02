// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F76ACE3D-E510-EE2C-B7B1-39B3136A61EE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result. For more information, see</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/421248.html">Parameters of hotwords rankings</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
