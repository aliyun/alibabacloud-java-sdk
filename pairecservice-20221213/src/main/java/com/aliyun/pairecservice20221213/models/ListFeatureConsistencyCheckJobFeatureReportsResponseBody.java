// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobFeatureReportsResponseBody extends TeaModel {
    @NameInMap("DataPath")
    public String dataPath;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("ReportsOfFeatureDiff")
    public java.util.List<ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff> reportsOfFeatureDiff;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFeatureConsistencyCheckJobFeatureReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobFeatureReportsResponseBody self = new ListFeatureConsistencyCheckJobFeatureReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody setReportsOfFeatureDiff(java.util.List<ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff> reportsOfFeatureDiff) {
        this.reportsOfFeatureDiff = reportsOfFeatureDiff;
        return this;
    }
    public java.util.List<ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff> getReportsOfFeatureDiff() {
        return this.reportsOfFeatureDiff;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff extends TeaModel {
        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("LogItemId")
        public String logItemId;

        @NameInMap("LogRequestId")
        public String logRequestId;

        @NameInMap("LogUserId")
        public String logUserId;

        @NameInMap("OfflineValue")
        public String offlineValue;

        @NameInMap("OnlineValue")
        public String onlineValue;

        public static ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff self = new ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff();
            return TeaModel.build(map, self);
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setLogItemId(String logItemId) {
            this.logItemId = logItemId;
            return this;
        }
        public String getLogItemId() {
            return this.logItemId;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setLogRequestId(String logRequestId) {
            this.logRequestId = logRequestId;
            return this;
        }
        public String getLogRequestId() {
            return this.logRequestId;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setLogUserId(String logUserId) {
            this.logUserId = logUserId;
            return this;
        }
        public String getLogUserId() {
            return this.logUserId;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setOfflineValue(String offlineValue) {
            this.offlineValue = offlineValue;
            return this;
        }
        public String getOfflineValue() {
            return this.offlineValue;
        }

        public ListFeatureConsistencyCheckJobFeatureReportsResponseBodyReportsOfFeatureDiff setOnlineValue(String onlineValue) {
            this.onlineValue = onlineValue;
            return this;
        }
        public String getOnlineValue() {
            return this.onlineValue;
        }

    }

}
