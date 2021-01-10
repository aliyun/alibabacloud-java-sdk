// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDSTBizLogConfigRequest extends TeaModel {
    @NameInMap("AdvSetValid")
    public Boolean advSetValid;

    @NameInMap("App")
    public String app;

    @NameInMap("CheckCondition")
    public String checkCondition;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogBeginRegex")
    public String logBeginRegex;

    @NameInMap("LogPath")
    public String logPath;

    @NameInMap("LogSample")
    public String logSample;

    @NameInMap("Name")
    public String name;

    public static CreateDSTBizLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDSTBizLogConfigRequest self = new CreateDSTBizLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateDSTBizLogConfigRequest setAdvSetValid(Boolean advSetValid) {
        this.advSetValid = advSetValid;
        return this;
    }
    public Boolean getAdvSetValid() {
        return this.advSetValid;
    }

    public CreateDSTBizLogConfigRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateDSTBizLogConfigRequest setCheckCondition(String checkCondition) {
        this.checkCondition = checkCondition;
        return this;
    }
    public String getCheckCondition() {
        return this.checkCondition;
    }

    public CreateDSTBizLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDSTBizLogConfigRequest setLogBeginRegex(String logBeginRegex) {
        this.logBeginRegex = logBeginRegex;
        return this;
    }
    public String getLogBeginRegex() {
        return this.logBeginRegex;
    }

    public CreateDSTBizLogConfigRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public CreateDSTBizLogConfigRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public CreateDSTBizLogConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
