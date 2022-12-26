// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableBruteForceRecordRequest extends TeaModel {
    @NameInMap("BlockIp")
    public String blockIp;

    @NameInMap("Bound")
    public String bound;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Uuid")
    public String uuid;

    public static DisableBruteForceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableBruteForceRecordRequest self = new DisableBruteForceRecordRequest();
        return TeaModel.build(map, self);
    }

    public DisableBruteForceRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DisableBruteForceRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public DisableBruteForceRecordRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DisableBruteForceRecordRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DisableBruteForceRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DisableBruteForceRecordRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
