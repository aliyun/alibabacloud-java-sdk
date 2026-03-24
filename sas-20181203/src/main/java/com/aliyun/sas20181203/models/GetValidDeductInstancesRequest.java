// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesRequest extends TeaModel {
    /**
     * <p>Resource package instance ID, can be queried through <a href="">QueryResourcePackageInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_cspm_dp_cn-***80001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Resource package name code, values:</p>
     * <ul>
     * <li>Vulnerability resource package: <strong>sas_vul_dp_cn</strong></li>
     * <li>CSPM resource package: <strong>sas_cspm_dp_cn</strong></li>
     * <li>Anti-virus resource package: <strong>sas_viruspackage_dp_cn</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas_vul_dp_cn</p>
     */
    @NameInMap("Modules")
    public String modules;

    /**
     * <p>Resource package status, default is valid (valid), not modifiable.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetValidDeductInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidDeductInstancesRequest self = new GetValidDeductInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetValidDeductInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetValidDeductInstancesRequest setModules(String modules) {
        this.modules = modules;
        return this;
    }
    public String getModules() {
        return this.modules;
    }

    public GetValidDeductInstancesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
