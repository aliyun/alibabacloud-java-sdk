// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-fuzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
         * <strong>example:</strong>
         * <p>sas_cspm_dp_cn-***80001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>sas_vul_dp_cn</p>
         */
        @NameInMap("Modules")
        public String modules;

        /**
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
