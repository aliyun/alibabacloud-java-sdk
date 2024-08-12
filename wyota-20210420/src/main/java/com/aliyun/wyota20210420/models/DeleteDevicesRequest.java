// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Force")
    public String force;

    @NameInMap("SerialNos")
    public String serialNos;

    @NameInMap("Uuids")
    public String uuids;

    public static DeleteDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesRequest self = new DeleteDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public DeleteDevicesRequest setSerialNos(String serialNos) {
        this.serialNos = serialNos;
        return this;
    }
    public String getSerialNos() {
        return this.serialNos;
    }

    public DeleteDevicesRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
