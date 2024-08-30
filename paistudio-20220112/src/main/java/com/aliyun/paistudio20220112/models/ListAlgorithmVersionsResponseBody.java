// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmVersionsResponseBody extends TeaModel {
    @NameInMap("AlgorithmVersions")
    public java.util.List<ListAlgorithmVersionsResponseBodyAlgorithmVersions> algorithmVersions;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAlgorithmVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmVersionsResponseBody self = new ListAlgorithmVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmVersionsResponseBody setAlgorithmVersions(java.util.List<ListAlgorithmVersionsResponseBodyAlgorithmVersions> algorithmVersions) {
        this.algorithmVersions = algorithmVersions;
        return this;
    }
    public java.util.List<ListAlgorithmVersionsResponseBodyAlgorithmVersions> getAlgorithmVersions() {
        return this.algorithmVersions;
    }

    public ListAlgorithmVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlgorithmVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlgorithmVersionsResponseBodyAlgorithmVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>algo-sidjc8134hv</p>
         */
        @NameInMap("AlgorithmId")
        public String algorithmId;

        /**
         * <strong>example:</strong>
         * <p>llm_train</p>
         */
        @NameInMap("AlgorithmName")
        public String algorithmName;

        /**
         * <strong>example:</strong>
         * <p>pai</p>
         */
        @NameInMap("AlgorithmProvider")
        public String algorithmProvider;

        /**
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        /**
         * <strong>example:</strong>
         * <p>2024-01-19T02:00:26Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2024-01-22T02:00:59Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListAlgorithmVersionsResponseBodyAlgorithmVersions build(java.util.Map<String, ?> map) throws Exception {
            ListAlgorithmVersionsResponseBodyAlgorithmVersions self = new ListAlgorithmVersionsResponseBodyAlgorithmVersions();
            return TeaModel.build(map, self);
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListAlgorithmVersionsResponseBodyAlgorithmVersions setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
