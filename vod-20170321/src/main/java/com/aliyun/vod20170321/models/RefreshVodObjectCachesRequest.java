// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesRequest extends TeaModel {
    /**
     * <p>The granularity of the resources to be refreshed. Valid values:</p>
     * <br>
     * <p>*   **File**: refreshes one or more files. This is the default value.</p>
     * <p>*   **Directory**: refreshes the files under one or more directories.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>Refreshes files on Alibaba Cloud CDN nodes. You can refresh multiple files at a time based on URLs.</p>
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
