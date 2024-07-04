// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobSanityCheckResultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1AC9xxx-3xxx-5xxx2-xxxx-FA5</p>
     */
    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("SanityCheckResults")
    public java.util.List<java.util.List<SanityCheckResultItem>> sanityCheckResults;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobSanityCheckResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobSanityCheckResultsResponseBody self = new ListJobSanityCheckResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobSanityCheckResultsResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public ListJobSanityCheckResultsResponseBody setSanityCheckResults(java.util.List<java.util.List<SanityCheckResultItem>> sanityCheckResults) {
        this.sanityCheckResults = sanityCheckResults;
        return this;
    }
    public java.util.List<java.util.List<SanityCheckResultItem>> getSanityCheckResults() {
        return this.sanityCheckResults;
    }

    public ListJobSanityCheckResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
