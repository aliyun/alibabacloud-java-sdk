// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public UpdateResourceGroupResponseBodyResourceGroup resourceGroup;

    public static UpdateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupResponseBody self = new UpdateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceGroupResponseBody setResourceGroup(UpdateResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public UpdateResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class UpdateResourceGroupResponseBodyResourceGroup extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Id")
        public String id;

        public static UpdateResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceGroupResponseBodyResourceGroup self = new UpdateResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateResourceGroupResponseBodyResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
