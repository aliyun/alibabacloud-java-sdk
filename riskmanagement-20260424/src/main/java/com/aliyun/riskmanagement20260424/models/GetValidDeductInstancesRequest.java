// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-fuzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request parameters.</p>
     */
    @NameInMap("SdkRequest")
    public GetValidDeductInstancesRequestSdkRequest sdkRequest;

    public static GetValidDeductInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidDeductInstancesRequest self = new GetValidDeductInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetValidDeductInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetValidDeductInstancesRequest setSdkRequest(GetValidDeductInstancesRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public GetValidDeductInstancesRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class GetValidDeductInstancesRequestSdkRequest extends TeaModel {
        /**
         * <p>The resource plan instance ID. You can call QueryResourcePackageInstances to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_cspm_dp_cn-***80001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The resource plan name code. Valid values:</p>
         * <ul>
         * <li>Vulnerability resource plan: <strong>sas_vul_dp_cn</strong></li>
         * <li>CSPM resource plan: <strong>sas_cspm_dp_cn</strong></li>
         * <li>Anti-virus Edition resource plan: <strong>sas_viruspackage_dp_cn</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas_vul_dp_cn</p>
         */
        @NameInMap("Modules")
        public String modules;

        /**
         * <p>The resource plan status. Default value: valid. This parameter cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetValidDeductInstancesRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            GetValidDeductInstancesRequestSdkRequest self = new GetValidDeductInstancesRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public GetValidDeductInstancesRequestSdkRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetValidDeductInstancesRequestSdkRequest setModules(String modules) {
            this.modules = modules;
            return this;
        }
        public String getModules() {
            return this.modules;
        }

        public GetValidDeductInstancesRequestSdkRequest setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
