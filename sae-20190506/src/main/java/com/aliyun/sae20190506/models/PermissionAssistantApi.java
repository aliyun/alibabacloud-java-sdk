// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PermissionAssistantApi extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("updateTime")
    public String updateTime;

    public static PermissionAssistantApi build(java.util.Map<String, ?> map) throws Exception {
        PermissionAssistantApi self = new PermissionAssistantApi();
        return TeaModel.build(map, self);
    }

    public PermissionAssistantApi setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PermissionAssistantApi setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PermissionAssistantApi setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PermissionAssistantApi setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PermissionAssistantApi setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
