// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SLSCollectConfig extends TeaModel {
    @NameInMap("LogPath")
    public String logPath;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("LogtailName")
    public String logtailName;

    @NameInMap("MachineGroup")
    public String machineGroup;

    @NameInMap("ProjectName")
    public String projectName;

    public static SLSCollectConfig build(java.util.Map<String, ?> map) throws Exception {
        SLSCollectConfig self = new SLSCollectConfig();
        return TeaModel.build(map, self);
    }

    public SLSCollectConfig setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public SLSCollectConfig setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public SLSCollectConfig setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public SLSCollectConfig setLogtailName(String logtailName) {
        this.logtailName = logtailName;
        return this;
    }
    public String getLogtailName() {
        return this.logtailName;
    }

    public SLSCollectConfig setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
        return this;
    }
    public String getMachineGroup() {
        return this.machineGroup;
    }

    public SLSCollectConfig setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
