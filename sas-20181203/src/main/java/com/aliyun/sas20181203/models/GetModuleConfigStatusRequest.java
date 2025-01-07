// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigStatusRequest extends TeaModel {
    /**
     * <p>The service modules that you want to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModuleNames")
    public java.util.List<String> moduleNames;

    public static GetModuleConfigStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigStatusRequest self = new GetModuleConfigStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigStatusRequest setModuleNames(java.util.List<String> moduleNames) {
        this.moduleNames = moduleNames;
        return this;
    }
    public java.util.List<String> getModuleNames() {
        return this.moduleNames;
    }

}
