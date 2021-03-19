// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class AddNumberSupplierRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SupplierName")
    public String supplierName;

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

    public static AddNumberSupplierRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNumberSupplierRequest self = new AddNumberSupplierRequest();
        return TeaModel.build(map, self);
    }

    public AddNumberSupplierRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddNumberSupplierRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public AddNumberSupplierRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public AddNumberSupplierRequest setNumbers(String numbers) {
        this.numbers = numbers;
        return this;
    }
    public String getNumbers() {
        return this.numbers;
    }

    public AddNumberSupplierRequest setThrottlingPolicy(String throttlingPolicy) {
        this.throttlingPolicy = throttlingPolicy;
        return this;
    }
    public String getThrottlingPolicy() {
        return this.throttlingPolicy;
    }

    public AddNumberSupplierRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public AddNumberSupplierRequest setUseCccNumberPicker(Boolean useCccNumberPicker) {
        this.useCccNumberPicker = useCccNumberPicker;
        return this;
    }
    public Boolean getUseCccNumberPicker() {
        return this.useCccNumberPicker;
    }

}
