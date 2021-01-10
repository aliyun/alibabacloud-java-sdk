// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCUnifiedAccessInstanceRequest extends TeaModel {
    @NameInMap("DataJsonStr")
    public String dataJsonStr;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCUnifiedAccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCUnifiedAccessInstanceRequest self = new UpdateLDCUnifiedAccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCUnifiedAccessInstanceRequest setDataJsonStr(String dataJsonStr) {
        this.dataJsonStr = dataJsonStr;
        return this;
    }
    public String getDataJsonStr() {
        return this.dataJsonStr;
    }

    public UpdateLDCUnifiedAccessInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
