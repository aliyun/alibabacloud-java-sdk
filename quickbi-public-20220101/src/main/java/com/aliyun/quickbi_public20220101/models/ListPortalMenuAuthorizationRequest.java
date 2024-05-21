// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationRequest extends TeaModel {
    /**
     * <p>The ID of the BI portal.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    public static ListPortalMenuAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenuAuthorizationRequest self = new ListPortalMenuAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListPortalMenuAuthorizationRequest setDataPortalId(String dataPortalId) {
        this.dataPortalId = dataPortalId;
        return this;
    }
    public String getDataPortalId() {
        return this.dataPortalId;
    }

}
