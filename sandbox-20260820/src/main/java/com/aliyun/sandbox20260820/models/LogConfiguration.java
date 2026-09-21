// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class LogConfiguration extends TeaModel {
    /**
     * <p>The name of the Simple Log Service Logstore that receives sandbox runtime logs.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-runtime</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the Simple Log Service project that receives sandbox runtime logs.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-log-cn-hangzhou</p>
     */
    @NameInMap("project")
    public String project;

    public static LogConfiguration build(java.util.Map<String, ?> map) throws Exception {
        LogConfiguration self = new LogConfiguration();
        return TeaModel.build(map, self);
    }

    public LogConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public LogConfiguration setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
