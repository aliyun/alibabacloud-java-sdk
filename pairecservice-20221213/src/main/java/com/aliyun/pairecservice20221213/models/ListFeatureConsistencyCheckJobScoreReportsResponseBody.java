// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobScoreReportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http://*******</p>
     */
    @NameInMap("DataPath")
    public String dataPath;

    /**
     * <strong>example:</strong>
     * <p>oss://********</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("ReportsOfScoreDiff")
    public java.util.List<ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff> reportsOfScoreDiff;

    /**
     * <strong>example:</strong>
     * <p>F0AB6527-093F-5C44-B3BD-42C8C210C619</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFeatureConsistencyCheckJobScoreReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobScoreReportsResponseBody self = new ListFeatureConsistencyCheckJobScoreReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponseBody setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponseBody setReportsOfScoreDiff(java.util.List<ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff> reportsOfScoreDiff) {
        this.reportsOfScoreDiff = reportsOfScoreDiff;
        return this;
    }
    public java.util.List<ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff> getReportsOfScoreDiff() {
        return this.reportsOfScoreDiff;
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LogItemId")
        public String logItemId;

        /**
         * <strong>example:</strong>
         * <p>323</p>
         */
        @NameInMap("LogRequestId")
        public String logRequestId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LogUserId")
        public String logUserId;

        /**
         * <strong>example:</strong>
         * <p>0.00000234</p>
         */
        @NameInMap("ScoreDiff")
        public String scoreDiff;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScoreDiffDetail")
        public String scoreDiffDetail;

        public static ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff self = new ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff();
            return TeaModel.build(map, self);
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff setLogItemId(String logItemId) {
            this.logItemId = logItemId;
            return this;
        }
        public String getLogItemId() {
            return this.logItemId;
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff setLogRequestId(String logRequestId) {
            this.logRequestId = logRequestId;
            return this;
        }
        public String getLogRequestId() {
            return this.logRequestId;
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff setLogUserId(String logUserId) {
            this.logUserId = logUserId;
            return this;
        }
        public String getLogUserId() {
            return this.logUserId;
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff setScoreDiff(String scoreDiff) {
            this.scoreDiff = scoreDiff;
            return this;
        }
        public String getScoreDiff() {
            return this.scoreDiff;
        }

        public ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff setScoreDiffDetail(String scoreDiffDetail) {
            this.scoreDiffDetail = scoreDiffDetail;
            return this;
        }
        public String getScoreDiffDetail() {
            return this.scoreDiffDetail;
        }

    }

}
