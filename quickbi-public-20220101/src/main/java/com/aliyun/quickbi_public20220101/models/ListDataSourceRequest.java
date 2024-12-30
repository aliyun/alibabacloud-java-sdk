// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("DsType")
    public String dsType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-**<strong><strong>c7d-8af9-dedf0ad0</strong></strong></p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceRequest self = new ListDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public ListDataSourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
