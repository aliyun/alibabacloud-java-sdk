// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UntagResourceAllTagsRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    // 资源Id
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 云产品服务Code
    @NameInMap("Service")
    public String service;

    public static UntagResourceAllTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceAllTagsRequest self = new UntagResourceAllTagsRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourceAllTagsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UntagResourceAllTagsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourceAllTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourceAllTagsRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
