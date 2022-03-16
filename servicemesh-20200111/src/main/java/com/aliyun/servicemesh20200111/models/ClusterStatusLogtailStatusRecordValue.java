// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ClusterStatusLogtailStatusRecordValue extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("LogtailDetailStatus")
    public String logtailDetailStatus;

    @NameInMap("AccessLogDashboards")
    public java.util.List<ClusterStatusLogtailStatusRecordValueAccessLogDashboards> accessLogDashboards;

    public static ClusterStatusLogtailStatusRecordValue build(java.util.Map<String, ?> map) throws Exception {
        ClusterStatusLogtailStatusRecordValue self = new ClusterStatusLogtailStatusRecordValue();
        return TeaModel.build(map, self);
    }

    public ClusterStatusLogtailStatusRecordValue setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterStatusLogtailStatusRecordValue setLogtailDetailStatus(String logtailDetailStatus) {
        this.logtailDetailStatus = logtailDetailStatus;
        return this;
    }
    public String getLogtailDetailStatus() {
        return this.logtailDetailStatus;
    }

    public ClusterStatusLogtailStatusRecordValue setAccessLogDashboards(java.util.List<ClusterStatusLogtailStatusRecordValueAccessLogDashboards> accessLogDashboards) {
        this.accessLogDashboards = accessLogDashboards;
        return this;
    }
    public java.util.List<ClusterStatusLogtailStatusRecordValueAccessLogDashboards> getAccessLogDashboards() {
        return this.accessLogDashboards;
    }

    public static class ClusterStatusLogtailStatusRecordValueAccessLogDashboards extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static ClusterStatusLogtailStatusRecordValueAccessLogDashboards build(java.util.Map<String, ?> map) throws Exception {
            ClusterStatusLogtailStatusRecordValueAccessLogDashboards self = new ClusterStatusLogtailStatusRecordValueAccessLogDashboards();
            return TeaModel.build(map, self);
        }

        public ClusterStatusLogtailStatusRecordValueAccessLogDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ClusterStatusLogtailStatusRecordValueAccessLogDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
