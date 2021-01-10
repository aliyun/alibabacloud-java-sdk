// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportODPBizDbnodesRequest extends TeaModel {
    @NameInMap("DbInstanceIdsRepeatList")
    public java.util.List<String> dbInstanceIdsRepeatList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ImportODPBizDbnodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportODPBizDbnodesRequest self = new ImportODPBizDbnodesRequest();
        return TeaModel.build(map, self);
    }

    public ImportODPBizDbnodesRequest setDbInstanceIdsRepeatList(java.util.List<String> dbInstanceIdsRepeatList) {
        this.dbInstanceIdsRepeatList = dbInstanceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getDbInstanceIdsRepeatList() {
        return this.dbInstanceIdsRepeatList;
    }

    public ImportODPBizDbnodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
