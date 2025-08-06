// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BlockVodObjectCachesRequest extends TeaModel {
    @NameInMap("Maxage")
    public Integer maxage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static BlockVodObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        BlockVodObjectCachesRequest self = new BlockVodObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public BlockVodObjectCachesRequest setMaxage(Integer maxage) {
        this.maxage = maxage;
        return this;
    }
    public Integer getMaxage() {
        return this.maxage;
    }

    public BlockVodObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public BlockVodObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BlockVodObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BlockVodObjectCachesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
