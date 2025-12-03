// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class ListGlobalUserConfigRequest extends TeaModel {
    @NameInMap("ModuleList")
    public java.util.List<String> moduleList;

    public static ListGlobalUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalUserConfigRequest self = new ListGlobalUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListGlobalUserConfigRequest setModuleList(java.util.List<String> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<String> getModuleList() {
        return this.moduleList;
    }

}
