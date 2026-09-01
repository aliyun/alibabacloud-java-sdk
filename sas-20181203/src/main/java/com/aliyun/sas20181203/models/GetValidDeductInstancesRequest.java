// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesRequest extends TeaModel {
    /**
     * <p>Instance ID of the resource plan instance. You can call <a href="">QueryResourcePackageInstances</a> to query instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_cspm_dp_cn-***80001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The code of the resource plan. Valid values:</p>
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
     * <p>The status of the resource plan. The default value is valid. This parameter does not support modification.</p>
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
