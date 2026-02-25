// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SLSCollectConfig extends TeaModel {
    /**
     * <p>The log path.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("LogPath")
    public String logPath;

    /**
     * <p>The log type. The following types of logs are supported:</p>
     * <ul>
     * <li>File collection logs</li>
     * <li>Standard output logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>file_log</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The name of the Logstore. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique in a project.</li>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sag-shanghai</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <p>The name for the Logtail configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>******-access-log-collector</p>
     */
    @NameInMap("LogtailName")
    public String logtailName;

    /**
     * <p>The name of the machine group of Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>Log Service Group</p>
     */
    @NameInMap("MachineGroup")
    public String machineGroup;

    /**
     * <p>The name of the SLS project.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
