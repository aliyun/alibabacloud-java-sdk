// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    @NameInMap("VulNames")
    public java.util.List<String> vulNames;

    public static OperateVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsRequest self = new OperateVulsRequest();
        return TeaModel.build(map, self);
    }

    public OperateVulsRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateVulsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperateVulsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public OperateVulsRequest setVulNames(java.util.List<String> vulNames) {
        this.vulNames = vulNames;
        return this;
    }
    public java.util.List<String> getVulNames() {
        return this.vulNames;
    }

}
