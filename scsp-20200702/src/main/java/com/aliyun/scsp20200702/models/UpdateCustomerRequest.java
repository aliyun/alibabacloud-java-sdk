// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateCustomerRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Contacter")
    public String contacter;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("Dingding")
    public String dingding;

    @NameInMap("Email")
    public String email;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ManagerName")
    public String managerName;

    @NameInMap("Name")
    public String name;

    @NameInMap("OuterId")
    public String outerId;

    @NameInMap("OuterIdType")
    public Integer outerIdType;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Position")
    public String position;

    @NameInMap("ProdLineId")
    public Long prodLineId;

    @NameInMap("TypeCode")
    public String typeCode;

    public static UpdateCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerRequest self = new UpdateCustomerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateCustomerRequest setContacter(String contacter) {
        this.contacter = contacter;
        return this;
    }
    public String getContacter() {
        return this.contacter;
    }

    public UpdateCustomerRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public UpdateCustomerRequest setDingding(String dingding) {
        this.dingding = dingding;
        return this;
    }
    public String getDingding() {
        return this.dingding;
    }

    public UpdateCustomerRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateCustomerRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public UpdateCustomerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCustomerRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public UpdateCustomerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomerRequest setOuterId(String outerId) {
        this.outerId = outerId;
        return this;
    }
    public String getOuterId() {
        return this.outerId;
    }

    public UpdateCustomerRequest setOuterIdType(Integer outerIdType) {
        this.outerIdType = outerIdType;
        return this;
    }
    public Integer getOuterIdType() {
        return this.outerIdType;
    }

    public UpdateCustomerRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateCustomerRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public UpdateCustomerRequest setProdLineId(Long prodLineId) {
        this.prodLineId = prodLineId;
        return this;
    }
    public Long getProdLineId() {
        return this.prodLineId;
    }

    public UpdateCustomerRequest setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

}
