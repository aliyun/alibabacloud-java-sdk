// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServiceSubsRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    public static ListMsSgServiceSubsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServiceSubsRequest self = new ListMsSgServiceSubsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgServiceSubsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListMsSgServiceSubsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsSgServiceSubsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
