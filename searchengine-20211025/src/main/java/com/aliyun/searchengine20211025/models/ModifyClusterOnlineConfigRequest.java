// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOnlineConfigRequest extends TeaModel {
    @NameInMap("advancedConfigVersionId")
    public Integer advancedConfigVersionId;

    @NameInMap("clusters")
    public java.util.List<String> clusters;

    public static ModifyClusterOnlineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOnlineConfigRequest self = new ModifyClusterOnlineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOnlineConfigRequest setAdvancedConfigVersionId(Integer advancedConfigVersionId) {
        this.advancedConfigVersionId = advancedConfigVersionId;
        return this;
    }
    public Integer getAdvancedConfigVersionId() {
        return this.advancedConfigVersionId;
    }

    public ModifyClusterOnlineConfigRequest setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

}
