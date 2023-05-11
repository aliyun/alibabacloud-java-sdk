// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusRequest extends TeaModel {
    /**
     * <p>The ID of the BI portal.</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>The user ID in the Quick BI. When passed in, the list displays only the menus that the user has permissions on.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListPortalMenusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenusRequest self = new ListPortalMenusRequest();
        return TeaModel.build(map, self);
    }

    public ListPortalMenusRequest setDataPortalId(String dataPortalId) {
        this.dataPortalId = dataPortalId;
        return this;
    }
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    public ListPortalMenusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
