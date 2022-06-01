// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmVersionsResponseBody extends TeaModel {
    @NameInMap("AlgorithmVersions")
    public java.util.List<ListAlgorithmVersionsResponseBodyAlgorithmVersions> algorithmVersions;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("AlgorithmProvider")
        public String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("TenantId")
        public String tenantId;

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
