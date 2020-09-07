// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DropDedicatedHostUserRequest extends TeaModel {
    @NameInMap("DedicatedHostName")
    @Validation(required = true)
    public String dedicatedHostName;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("RegionId")
    public String regionId;

    public static DropDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DropDedicatedHostUserRequest self = new DropDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

    public DropDedicatedHostUserRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public DropDedicatedHostUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DropDedicatedHostUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
