// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNodeNumRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
     * <p>- true: Only a dry-run request is sent and the number of nodes in the instance is not modified. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</p>
     * <p>- false: The actual request is sent and no dry run is performed. The number of nodes is changed if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of nodes in the cluster. If the cluster is deployed in n-n-n mode, the number of nodes in the cluster equals n × 3.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeNum")
    public String nodeNum;

    public static ModifyInstanceNodeNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNodeNumRequest self = new ModifyInstanceNodeNumRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNodeNumRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyInstanceNodeNumRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNodeNumRequest setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public String getNodeNum() {
        return this.nodeNum;
    }

}
