// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ChangeVisibilityModelRequest extends TeaModel {
    @NameInMap("DataPortalId")
    public String dataPortalId;

    @NameInMap("MenuIds")
    public String menuIds;

    @NameInMap("ShowOnlyWithAccess")
    public Boolean showOnlyWithAccess;

    public static ChangeVisibilityModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityModelRequest self = new ChangeVisibilityModelRequest();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityModelRequest setDataPortalId(String dataPortalId) {
        this.dataPortalId = dataPortalId;
        return this;
    }
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    public ChangeVisibilityModelRequest setMenuIds(String menuIds) {
        this.menuIds = menuIds;
        return this;
    }
    public String getMenuIds() {
        return this.menuIds;
    }

    public ChangeVisibilityModelRequest setShowOnlyWithAccess(Boolean showOnlyWithAccess) {
        this.showOnlyWithAccess = showOnlyWithAccess;
        return this;
    }
    public Boolean getShowOnlyWithAccess() {
        return this.showOnlyWithAccess;
    }

}
