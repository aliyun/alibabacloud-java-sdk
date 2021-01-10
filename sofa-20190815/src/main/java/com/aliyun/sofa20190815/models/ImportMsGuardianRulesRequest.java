// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsGuardianRulesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ImportMsGuardianRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMsGuardianRulesRequest self = new ImportMsGuardianRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportMsGuardianRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ImportMsGuardianRulesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportMsGuardianRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
