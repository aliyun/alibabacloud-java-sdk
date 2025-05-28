// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ChangeVisibilityModelRequest extends TeaModel {
    /**
     * <p>The ID of the BI portal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0d173abb53e84c8ca7495429163b****</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>The menu ID of the BI portal leaf node.</p>
     * <ul>
     * <li>The directory menu cannot be authorized.</li>
     * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 100.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54kqgoa****,pg1n135****</p>
     */
    @NameInMap("MenuIds")
    public String menuIds;

    /**
     * <p>Whether only authorization is visible. Valid values:</p>
     * <ul>
     * <li>true: Only the authorization is visible.</li>
     * <li>false: Both are visible.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
