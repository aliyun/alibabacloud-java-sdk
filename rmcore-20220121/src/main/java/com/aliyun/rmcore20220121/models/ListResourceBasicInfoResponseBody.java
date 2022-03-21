// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class ListResourceBasicInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListResourceBasicInfoResponseBodyResources> resources;

    @NameInMap("Success")
    public String success;

    public static ListResourceBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceBasicInfoResponseBody self = new ListResourceBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceBasicInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListResourceBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceBasicInfoResponseBody setResources(java.util.List<ListResourceBasicInfoResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourceBasicInfoResponseBodyResources> getResources() {
        return this.resources;
    }

    public ListResourceBasicInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListResourceBasicInfoResponseBodyResources extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Service")
        public String service;

        public static ListResourceBasicInfoResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourceBasicInfoResponseBodyResources self = new ListResourceBasicInfoResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourceBasicInfoResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceBasicInfoResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceBasicInfoResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourceBasicInfoResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceBasicInfoResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceBasicInfoResponseBodyResources setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
