// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class ModifyNumberSupplierRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SupplierId")
    public String supplierId;

    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("Numbers")
    public String numbers;

    @NameInMap("ThrottlingPolicy")
    public String throttlingPolicy;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    @NameInMap("UseCccNumberPicker")
    public Boolean useCccNumberPicker;

    public static ModifyNumberSupplierRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNumberSupplierRequest self = new ModifyNumberSupplierRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNumberSupplierRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyNumberSupplierRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public ModifyNumberSupplierRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public ModifyNumberSupplierRequest setNumbers(String numbers) {
        this.numbers = numbers;
        return this;
    }
    public String getNumbers() {
        return this.numbers;
    }

    public ModifyNumberSupplierRequest setThrottlingPolicy(String throttlingPolicy) {
        this.throttlingPolicy = throttlingPolicy;
        return this;
    }
    public String getThrottlingPolicy() {
        return this.throttlingPolicy;
    }

    public ModifyNumberSupplierRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public ModifyNumberSupplierRequest setUseCccNumberPicker(Boolean useCccNumberPicker) {
        this.useCccNumberPicker = useCccNumberPicker;
        return this;
    }
    public Boolean getUseCccNumberPicker() {
        return this.useCccNumberPicker;
    }

}
