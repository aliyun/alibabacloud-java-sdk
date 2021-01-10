// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsGuardianAppsRequest extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RunMode")
    public String runMode;

    public static DeleteMsGuardianAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsGuardianAppsRequest self = new DeleteMsGuardianAppsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsGuardianAppsRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DeleteMsGuardianAppsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMsGuardianAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMsGuardianAppsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteMsGuardianAppsRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

}
