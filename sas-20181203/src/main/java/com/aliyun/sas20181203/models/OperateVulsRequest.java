// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    /**
     * <p>The operation on the vulnerabilities. Set the value to **vul_fix**, which indicates vulnerability fixing.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of the vulnerabilities that you want to fix. Set the value to **cve**, which indicates Linux software vulnerabilities.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of servers for which you want to fix vulnerabilities.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    /**
     * <p>The names of the vulnerabilities that you want to fix.</p>
     */
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
