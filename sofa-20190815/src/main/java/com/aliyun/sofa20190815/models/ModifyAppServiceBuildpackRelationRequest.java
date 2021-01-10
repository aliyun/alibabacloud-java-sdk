// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyAppServiceBuildpackRelationRequest extends TeaModel {
    @NameInMap("NewAppServiceJsonStr")
    public String newAppServiceJsonStr;

    @NameInMap("OriginalAppServiceJsonStr")
    public String originalAppServiceJsonStr;

    public static ModifyAppServiceBuildpackRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppServiceBuildpackRelationRequest self = new ModifyAppServiceBuildpackRelationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppServiceBuildpackRelationRequest setNewAppServiceJsonStr(String newAppServiceJsonStr) {
        this.newAppServiceJsonStr = newAppServiceJsonStr;
        return this;
    }
    public String getNewAppServiceJsonStr() {
        return this.newAppServiceJsonStr;
    }

    public ModifyAppServiceBuildpackRelationRequest setOriginalAppServiceJsonStr(String originalAppServiceJsonStr) {
        this.originalAppServiceJsonStr = originalAppServiceJsonStr;
        return this;
    }
    public String getOriginalAppServiceJsonStr() {
        return this.originalAppServiceJsonStr;
    }

}
