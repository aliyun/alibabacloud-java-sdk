// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalInstallScriptRequest extends TeaModel {
    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("InternalNetwork")
    public Boolean internalNetwork;

    public static GetLocalInstallScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLocalInstallScriptRequest self = new GetLocalInstallScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetLocalInstallScriptRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public GetLocalInstallScriptRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetLocalInstallScriptRequest setInternalNetwork(Boolean internalNetwork) {
        this.internalNetwork = internalNetwork;
        return this;
    }
    public Boolean getInternalNetwork() {
        return this.internalNetwork;
    }

}
