// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobScoreReportsResponseBody extends TeaModel {
    @NameInMap("DataPath")
    public String dataPath;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("ReportsOfScoreDiff")
    public java.util.List<ListFeatureConsistencyCheckJobScoreReportsResponseBodyReportsOfScoreDiff> reportsOfScoreDiff;

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
        @NameInMap("LogItemId")
        public String logItemId;

        @NameInMap("LogRequestId")
        public String logRequestId;

        @NameInMap("LogUserId")
        public String logUserId;

        @NameInMap("ScoreDiff")
        public String scoreDiff;

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
