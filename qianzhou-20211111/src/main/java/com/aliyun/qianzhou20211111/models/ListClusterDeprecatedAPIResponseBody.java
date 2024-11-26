// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterDeprecatedAPIResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("datas")
    public ListClusterDeprecatedAPIResponseBodyDatas datas;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static ListClusterDeprecatedAPIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterDeprecatedAPIResponseBody self = new ListClusterDeprecatedAPIResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterDeprecatedAPIResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterDeprecatedAPIResponseBody setDatas(ListClusterDeprecatedAPIResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public ListClusterDeprecatedAPIResponseBodyDatas getDatas() {
        return this.datas;
    }

    public ListClusterDeprecatedAPIResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListClusterDeprecatedAPIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterDeprecatedAPIResponseBodyDatasData extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("content")
        public String content;

        @NameInMap("count")
        public Integer count;

        @NameInMap("current_version")
        public String currentVersion;

        @NameInMap("deprecated_k8s_version")
        public String deprecatedK8sVersion;

        @NameInMap("ds")
        public String ds;

        @NameInMap("label")
        public String label;

        @NameInMap("last_time")
        public String lastTime;

        @NameInMap("request_uri")
        public String requestUri;

        @NameInMap("source_ips")
        public String sourceIps;

        @NameInMap("target_version")
        public String targetVersion;

        @NameInMap("user_agent")
        public String userAgent;

        public static ListClusterDeprecatedAPIResponseBodyDatasData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterDeprecatedAPIResponseBodyDatasData self = new ListClusterDeprecatedAPIResponseBodyDatasData();
            return TeaModel.build(map, self);
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setDeprecatedK8sVersion(String deprecatedK8sVersion) {
            this.deprecatedK8sVersion = deprecatedK8sVersion;
            return this;
        }
        public String getDeprecatedK8sVersion() {
            return this.deprecatedK8sVersion;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setRequestUri(String requestUri) {
            this.requestUri = requestUri;
            return this;
        }
        public String getRequestUri() {
            return this.requestUri;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setSourceIps(String sourceIps) {
            this.sourceIps = sourceIps;
            return this;
        }
        public String getSourceIps() {
            return this.sourceIps;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public ListClusterDeprecatedAPIResponseBodyDatasData setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

    }

    public static class ListClusterDeprecatedAPIResponseBodyDatas extends TeaModel {
        @NameInMap("current")
        public Integer current;

        @NameInMap("data")
        public java.util.List<ListClusterDeprecatedAPIResponseBodyDatasData> data;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListClusterDeprecatedAPIResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            ListClusterDeprecatedAPIResponseBodyDatas self = new ListClusterDeprecatedAPIResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public ListClusterDeprecatedAPIResponseBodyDatas setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public ListClusterDeprecatedAPIResponseBodyDatas setData(java.util.List<ListClusterDeprecatedAPIResponseBodyDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListClusterDeprecatedAPIResponseBodyDatasData> getData() {
            return this.data;
        }

        public ListClusterDeprecatedAPIResponseBodyDatas setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterDeprecatedAPIResponseBodyDatas setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
