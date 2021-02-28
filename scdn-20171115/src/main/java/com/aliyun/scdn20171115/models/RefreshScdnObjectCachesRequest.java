// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class RefreshScdnObjectCachesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("ObjectType")
    public String objectType;

    public static RefreshScdnObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshScdnObjectCachesRequest self = new RefreshScdnObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshScdnObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshScdnObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RefreshScdnObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshScdnObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
