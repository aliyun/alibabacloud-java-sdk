// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ProjectId")
    public String projectId;

    public static ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest self = new ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ConfirmLinkefabricFabricDevstageincludegrayornetpreRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
