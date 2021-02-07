// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppDescription")
    public String appDescription;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public UpdateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
