// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SLSConfig extends TeaModel {
    @NameInMap("collectConfigs")
    public java.util.List<SLSConfigCollectConfigs> collectConfigs;

    public static SLSConfig build(java.util.Map<String, ?> map) throws Exception {
        SLSConfig self = new SLSConfig();
        return TeaModel.build(map, self);
    }

    public SLSConfig setCollectConfigs(java.util.List<SLSConfigCollectConfigs> collectConfigs) {
        this.collectConfigs = collectConfigs;
        return this;
    }
    public java.util.List<SLSConfigCollectConfigs> getCollectConfigs() {
        return this.collectConfigs;
    }

    public static class SLSConfigCollectConfigs extends TeaModel {
        @NameInMap("logPath")
        public String logPath;

        @NameInMap("logType")
        public String logType;

        @NameInMap("logstoreName")
        public String logstoreName;

        @NameInMap("logtailName")
        public String logtailName;

        @NameInMap("projectName")
        public String projectName;

        public static SLSConfigCollectConfigs build(java.util.Map<String, ?> map) throws Exception {
            SLSConfigCollectConfigs self = new SLSConfigCollectConfigs();
            return TeaModel.build(map, self);
        }

        public SLSConfigCollectConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public SLSConfigCollectConfigs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public SLSConfigCollectConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public SLSConfigCollectConfigs setLogtailName(String logtailName) {
            this.logtailName = logtailName;
            return this;
        }
        public String getLogtailName() {
            return this.logtailName;
        }

        public SLSConfigCollectConfigs setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
