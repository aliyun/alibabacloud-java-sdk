// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClusterCnnfStatusUserConfirmRequest extends TeaModel {
    /**
     * <p>The IDs of the clusters.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <p>Specifies whether to fix the blocking status of the cluster. Valid values:</p>
     * <br>
     * <p>*   true: yes</p>
     * <p>*   false: no</p>
     */
    @NameInMap("UserConfirm")
    public Boolean userConfirm;

    public static ModifyClusterCnnfStatusUserConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterCnnfStatusUserConfirmRequest self = new ModifyClusterCnnfStatusUserConfirmRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterCnnfStatusUserConfirmRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public ModifyClusterCnnfStatusUserConfirmRequest setUserConfirm(Boolean userConfirm) {
        this.userConfirm = userConfirm;
        return this;
    }
    public Boolean getUserConfirm() {
        return this.userConfirm;
    }

}
