// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource group.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource group was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the resource group.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The unique identifier of the resource group.</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceGroupResponseBodyResourceGroup self = new UpdateResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateResourceGroupResponseBodyResourceGroup setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
