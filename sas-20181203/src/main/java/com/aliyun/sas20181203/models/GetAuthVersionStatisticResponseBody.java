// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthVersionStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CA2BDF6-F3BD-51A4-BAAC-30B02F7A3FBB</p>
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
         * <ul>
         * <li><strong>1</strong>: Basic edition (Unauthorized)</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The number of authorized servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
