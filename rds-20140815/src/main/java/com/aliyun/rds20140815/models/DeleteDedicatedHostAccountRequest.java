// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostAccountRequest extends TeaModel {
    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDedicatedHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostAccountRequest self = new DeleteDedicatedHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostAccountRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DeleteDedicatedHostAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeleteDedicatedHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
