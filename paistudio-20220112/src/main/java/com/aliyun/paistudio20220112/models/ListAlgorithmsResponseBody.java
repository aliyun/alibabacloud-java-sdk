// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmsResponseBody extends TeaModel {
    @NameInMap("Algorithms")
    public java.util.List<ListAlgorithmsResponseBodyAlgorithms> algorithms;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAlgorithmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsResponseBody self = new ListAlgorithmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsResponseBody setAlgorithms(java.util.List<ListAlgorithmsResponseBodyAlgorithms> algorithms) {
        this.algorithms = algorithms;
        return this;
    }
    public java.util.List<ListAlgorithmsResponseBodyAlgorithms> getAlgorithms() {
        return this.algorithms;
    }

    public ListAlgorithmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlgorithmsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlgorithmsResponseBodyAlgorithms extends TeaModel {
        @NameInMap("AlgorithmDescription")
        public String algorithmDescription;

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
         * <p>LLM Train</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>2023-07-21T03:35:24Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2023-07-25T02:15:40Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListAlgorithmsResponseBodyAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            ListAlgorithmsResponseBodyAlgorithms self = new ListAlgorithmsResponseBodyAlgorithms();
            return TeaModel.build(map, self);
        }

        public ListAlgorithmsResponseBodyAlgorithms setAlgorithmDescription(String algorithmDescription) {
            this.algorithmDescription = algorithmDescription;
            return this;
        }
        public String getAlgorithmDescription() {
            return this.algorithmDescription;
        }

        public ListAlgorithmsResponseBodyAlgorithms setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public ListAlgorithmsResponseBodyAlgorithms setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ListAlgorithmsResponseBodyAlgorithms setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public ListAlgorithmsResponseBodyAlgorithms setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAlgorithmsResponseBodyAlgorithms setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListAlgorithmsResponseBodyAlgorithms setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListAlgorithmsResponseBodyAlgorithms setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAlgorithmsResponseBodyAlgorithms setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
