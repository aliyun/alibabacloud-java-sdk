// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
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
        /**
         * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
         * <ul>
         * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role for Security Center (SAS). Security Center uses this role to access your resources in other Alibaba Cloud services.</li>
         * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role for Security Center - Cloud Security Posture Management (CSPM). SAS-CSPM uses this role to access your resources in other Alibaba Cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForWebsiteBuildPublish</p>
         */
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
