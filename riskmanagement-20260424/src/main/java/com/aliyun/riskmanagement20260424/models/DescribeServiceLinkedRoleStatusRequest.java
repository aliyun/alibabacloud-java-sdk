// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the instance resides.</p>
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
    public DescribeServiceLinkedRoleStatusRequestSdkRequest sdkRequest;

    public static DescribeServiceLinkedRoleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusRequest self = new DescribeServiceLinkedRoleStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServiceLinkedRoleStatusRequest setSdkRequest(DescribeServiceLinkedRoleStatusRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public DescribeServiceLinkedRoleStatusRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class DescribeServiceLinkedRoleStatusRequestSdkRequest extends TeaModel {
        /**
         * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
         * <ul>
         * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role for Security Center (sas). Security Center uses this role to access your resources in other Alibaba Cloud services.</li>
         * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role for Security Center - CSPM (sas-cspm). sas-cspm uses this role to access your resources in other Alibaba Cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForSas</p>
         */
        @NameInMap("ServiceLinkedRole")
        public String serviceLinkedRole;

        public static DescribeServiceLinkedRoleStatusRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceLinkedRoleStatusRequestSdkRequest self = new DescribeServiceLinkedRoleStatusRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public DescribeServiceLinkedRoleStatusRequestSdkRequest setServiceLinkedRole(String serviceLinkedRole) {
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }
        public String getServiceLinkedRole() {
            return this.serviceLinkedRole;
        }

    }

}
