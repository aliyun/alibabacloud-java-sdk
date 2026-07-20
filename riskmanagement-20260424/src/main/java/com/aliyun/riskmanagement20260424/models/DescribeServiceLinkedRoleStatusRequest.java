// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
