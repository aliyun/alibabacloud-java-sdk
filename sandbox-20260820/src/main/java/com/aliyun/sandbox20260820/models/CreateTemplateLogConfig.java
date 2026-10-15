// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateLogConfig extends TeaModel {
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

    public static CreateTemplateLogConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateLogConfig self = new CreateTemplateLogConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateLogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateTemplateLogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
