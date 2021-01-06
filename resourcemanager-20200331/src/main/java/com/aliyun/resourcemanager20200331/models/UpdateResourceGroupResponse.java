// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceGroup")
    @Validation(required = true)
    public UpdateResourceGroupResponseResourceGroup resourceGroup;

    public static UpdateResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupResponse self = new UpdateResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceGroupResponse setResourceGroup(UpdateResourceGroupResponseResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public UpdateResourceGroupResponseResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class UpdateResourceGroupResponseResourceGroup extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static UpdateResourceGroupResponseResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceGroupResponseResourceGroup self = new UpdateResourceGroupResponseResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateResourceGroupResponseResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateResourceGroupResponseResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateResourceGroupResponseResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateResourceGroupResponseResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateResourceGroupResponseResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
