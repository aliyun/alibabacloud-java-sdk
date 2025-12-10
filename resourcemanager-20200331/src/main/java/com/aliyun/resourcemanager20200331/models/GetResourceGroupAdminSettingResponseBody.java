// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupAdminSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreatorAsAdmin")
    public Boolean creatorAsAdmin;

    /**
     * <strong>example:</strong>
     * <p>776B05B3-A0B0-464B-A191-F4E1119A94B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceGroupAdminSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupAdminSettingResponseBody self = new GetResourceGroupAdminSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupAdminSettingResponseBody setCreatorAsAdmin(Boolean creatorAsAdmin) {
        this.creatorAsAdmin = creatorAsAdmin;
        return this;
    }
    public Boolean getCreatorAsAdmin() {
        return this.creatorAsAdmin;
    }

    public GetResourceGroupAdminSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
