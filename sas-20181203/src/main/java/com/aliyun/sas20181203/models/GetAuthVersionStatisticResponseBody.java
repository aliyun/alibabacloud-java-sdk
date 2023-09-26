// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthVersionStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics about the numbers of assets protected by each edition of Security Center.</p>
     */
    @NameInMap("Statistics")
    public java.util.List<GetAuthVersionStatisticResponseBodyStatistics> statistics;

    public static GetAuthVersionStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthVersionStatisticResponseBody self = new GetAuthVersionStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthVersionStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthVersionStatisticResponseBody setStatistics(java.util.List<GetAuthVersionStatisticResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<GetAuthVersionStatisticResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class GetAuthVersionStatisticResponseBodyStatistics extends TeaModel {
        /**
         * <p>The edition of Security Center. Valid values:</p>
         * <br>
         * <p>*   **1**: Basic edition (Unauthorized)</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         * <p>*   **10**: Value-added Plan edition</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The number of authorized servers.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetAuthVersionStatisticResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetAuthVersionStatisticResponseBodyStatistics self = new GetAuthVersionStatisticResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public GetAuthVersionStatisticResponseBodyStatistics setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public GetAuthVersionStatisticResponseBodyStatistics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
