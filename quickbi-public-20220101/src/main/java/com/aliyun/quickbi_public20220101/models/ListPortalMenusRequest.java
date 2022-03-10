// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusRequest extends TeaModel {
    @NameInMap("DataPortalId")
    public String dataPortalId;

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
