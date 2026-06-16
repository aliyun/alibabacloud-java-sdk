// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public CreateServiceLinkedRoleRequestSdkRequest sdkRequest;

    public static CreateServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleRequest self = new CreateServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceLinkedRoleRequest setSdkRequest(CreateServiceLinkedRoleRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public CreateServiceLinkedRoleRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class CreateServiceLinkedRoleRequestSdkRequest extends TeaModel {
        @NameInMap("ServiceLinkedRole")
        public String serviceLinkedRole;

        public static CreateServiceLinkedRoleRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleRequestSdkRequest self = new CreateServiceLinkedRoleRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleRequestSdkRequest setServiceLinkedRole(String serviceLinkedRole) {
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }
        public String getServiceLinkedRole() {
            return this.serviceLinkedRole;
        }

    }

}
