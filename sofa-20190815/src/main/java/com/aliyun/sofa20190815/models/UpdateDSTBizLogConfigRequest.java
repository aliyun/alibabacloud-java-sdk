// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDSTBizLogConfigRequest extends TeaModel {
    @NameInMap("AdvSetValid")
    public Boolean advSetValid;

    @NameInMap("BizLogConfigId")
    public Long bizLogConfigId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogBeginRegex")
    public String logBeginRegex;

    @NameInMap("LogPath")
    public String logPath;

    public static UpdateDSTBizLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSTBizLogConfigRequest self = new UpdateDSTBizLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDSTBizLogConfigRequest setAdvSetValid(Boolean advSetValid) {
        this.advSetValid = advSetValid;
        return this;
    }
    public Boolean getAdvSetValid() {
        return this.advSetValid;
    }

    public UpdateDSTBizLogConfigRequest setBizLogConfigId(Long bizLogConfigId) {
        this.bizLogConfigId = bizLogConfigId;
        return this;
    }
    public Long getBizLogConfigId() {
        return this.bizLogConfigId;
    }

    public UpdateDSTBizLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDSTBizLogConfigRequest setLogBeginRegex(String logBeginRegex) {
        this.logBeginRegex = logBeginRegex;
        return this;
    }
    public String getLogBeginRegex() {
        return this.logBeginRegex;
    }

    public UpdateDSTBizLogConfigRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

}
