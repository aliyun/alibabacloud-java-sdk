// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPDbnodesRequest extends TeaModel {
    @NameInMap("FilterAvailable")
    public Boolean filterAvailable;

    @NameInMap("FilterInstanceType")
    public String filterInstanceType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchqueryODPDbnodesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPDbnodesRequest self = new BatchqueryODPDbnodesRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPDbnodesRequest setFilterAvailable(Boolean filterAvailable) {
        this.filterAvailable = filterAvailable;
        return this;
    }
    public Boolean getFilterAvailable() {
        return this.filterAvailable;
    }

    public BatchqueryODPDbnodesRequest setFilterInstanceType(String filterInstanceType) {
        this.filterInstanceType = filterInstanceType;
        return this;
    }
    public String getFilterInstanceType() {
        return this.filterInstanceType;
    }

    public BatchqueryODPDbnodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
