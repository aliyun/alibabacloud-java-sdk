// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStoresgetallappsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutStoresgetallappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStoresgetallappsRequest self = new GetLinkeBahamutStoresgetallappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStoresgetallappsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeBahamutStoresgetallappsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public GetLinkeBahamutStoresgetallappsRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
