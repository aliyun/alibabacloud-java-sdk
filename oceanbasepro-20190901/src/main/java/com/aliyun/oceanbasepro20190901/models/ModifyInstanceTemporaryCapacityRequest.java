// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTemporaryCapacityRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The disk size. Unit: GB.</p>
     */
    @NameInMap("DiskSize")
    public String diskSize;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specification.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyInstanceTemporaryCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTemporaryCapacityRequest self = new ModifyInstanceTemporaryCapacityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTemporaryCapacityRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ModifyInstanceTemporaryCapacityRequest setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

    public ModifyInstanceTemporaryCapacityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceTemporaryCapacityRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
