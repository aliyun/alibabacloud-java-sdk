// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddFileProtectBindMachineRequest extends TeaModel {
    /**
     * <p>The list of servers for which the alert protection level is enabled.</p>
     */
    @NameInMap("AlertUuids")
    public java.util.List<String> alertUuids;

    /**
     * <p>The list of servers for which tamper-proofing is enabled.</p>
     */
    @NameInMap("BlockUuids")
    public java.util.List<String> blockUuids;

    /**
     * <p>The list of servers for which file protection is disabled.</p>
     */
    @NameInMap("NoneUuids")
    public java.util.List<String> noneUuids;

    public static AddFileProtectBindMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileProtectBindMachineRequest self = new AddFileProtectBindMachineRequest();
        return TeaModel.build(map, self);
    }

    public AddFileProtectBindMachineRequest setAlertUuids(java.util.List<String> alertUuids) {
        this.alertUuids = alertUuids;
        return this;
    }
    public java.util.List<String> getAlertUuids() {
        return this.alertUuids;
    }

    public AddFileProtectBindMachineRequest setBlockUuids(java.util.List<String> blockUuids) {
        this.blockUuids = blockUuids;
        return this;
    }
    public java.util.List<String> getBlockUuids() {
        return this.blockUuids;
    }

    public AddFileProtectBindMachineRequest setNoneUuids(java.util.List<String> noneUuids) {
        this.noneUuids = noneUuids;
        return this;
    }
    public java.util.List<String> getNoneUuids() {
        return this.noneUuids;
    }

}
