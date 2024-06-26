// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ListSummaryAppsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SummaryAppInfos")
    public ListSummaryAppsResponseBodySummaryAppInfos summaryAppInfos;

    public static ListSummaryAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSummaryAppsResponseBody self = new ListSummaryAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSummaryAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSummaryAppsResponseBody setSummaryAppInfos(ListSummaryAppsResponseBodySummaryAppInfos summaryAppInfos) {
        this.summaryAppInfos = summaryAppInfos;
        return this;
    }
    public ListSummaryAppsResponseBodySummaryAppInfos getSummaryAppInfos() {
        return this.summaryAppInfos;
    }

    public static class ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23****07</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo self = new ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo();
            return TeaModel.build(map, self);
        }

        public ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListSummaryAppsResponseBodySummaryAppInfos extends TeaModel {
        @NameInMap("SummaryAppInfo")
        public java.util.List<ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo> summaryAppInfo;

        public static ListSummaryAppsResponseBodySummaryAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSummaryAppsResponseBodySummaryAppInfos self = new ListSummaryAppsResponseBodySummaryAppInfos();
            return TeaModel.build(map, self);
        }

        public ListSummaryAppsResponseBodySummaryAppInfos setSummaryAppInfo(java.util.List<ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo> summaryAppInfo) {
            this.summaryAppInfo = summaryAppInfo;
            return this;
        }
        public java.util.List<ListSummaryAppsResponseBodySummaryAppInfosSummaryAppInfo> getSummaryAppInfo() {
            return this.summaryAppInfo;
        }

    }

}
