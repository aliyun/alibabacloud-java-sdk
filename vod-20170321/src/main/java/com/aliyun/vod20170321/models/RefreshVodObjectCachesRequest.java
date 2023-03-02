// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesRequest extends TeaModel {
    /**
     * <p>The path of the resource to be refreshed. Separate multiple paths with line breaks (\n or \r\n).</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The granularity of the resources to be refreshed. Valid values:</p>
     * <br>
     * <p>*   **File**: refreshes one or more files. This is the default value.</p>
     * <p>*   **Directory**: refreshes the files under one or more directories.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshVodObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesRequest self = new RefreshVodObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshVodObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshVodObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshVodObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshVodObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
