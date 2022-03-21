// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class ListResourceBasicInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ResourceIds")
    public String resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Service")
    public String service;

    public static ListResourceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceBasicInfoRequest self = new ListResourceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceBasicInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListResourceBasicInfoRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public ListResourceBasicInfoRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceBasicInfoRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
