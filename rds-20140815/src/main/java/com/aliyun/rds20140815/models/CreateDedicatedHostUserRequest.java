// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostUserRequest extends TeaModel {
    @NameInMap("DedicatedHostName")
    @Validation(required = true)
    public String dedicatedHostName;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("UserPassword")
    @Validation(required = true)
    public String userPassword;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostUserRequest self = new CreateDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostUserRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public CreateDedicatedHostUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDedicatedHostUserRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

    public CreateDedicatedHostUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
