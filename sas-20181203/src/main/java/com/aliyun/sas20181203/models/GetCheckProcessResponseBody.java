// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckProcessResponseBody extends TeaModel {
    /**
     * <p>The total number of assets on which the task is complete.</p>
     */
    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of assets on which the task is performed.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetCheckProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckProcessResponseBody self = new GetCheckProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckProcessResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GetCheckProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckProcessResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
