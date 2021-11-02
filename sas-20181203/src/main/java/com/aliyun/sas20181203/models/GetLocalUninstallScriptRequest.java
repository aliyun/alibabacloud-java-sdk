// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalUninstallScriptRequest extends TeaModel {
    @NameInMap("InternalNetwork")
    public Boolean internalNetwork;

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("Uuid")
    public String uuid;

    public static GetLocalUninstallScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLocalUninstallScriptRequest self = new GetLocalUninstallScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetLocalUninstallScriptRequest setInternalNetwork(Boolean internalNetwork) {
        this.internalNetwork = internalNetwork;
        return this;
    }
    public Boolean getInternalNetwork() {
        return this.internalNetwork;
    }

    public GetLocalUninstallScriptRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetLocalUninstallScriptRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
