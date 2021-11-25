// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateCustomerRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Contacter")
    public String contacter;

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

    public static CreateCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerRequest self = new CreateCustomerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCustomerRequest setContacter(String contacter) {
        this.contacter = contacter;
        return this;
    }
    public String getContacter() {
        return this.contacter;
    }

    public CreateCustomerRequest setDingding(String dingding) {
        this.dingding = dingding;
        return this;
    }
    public String getDingding() {
        return this.dingding;
    }

    public CreateCustomerRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCustomerRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateCustomerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCustomerRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public CreateCustomerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomerRequest setOuterId(String outerId) {
        this.outerId = outerId;
        return this;
    }
    public String getOuterId() {
        return this.outerId;
    }

    public CreateCustomerRequest setOuterIdType(Integer outerIdType) {
        this.outerIdType = outerIdType;
        return this;
    }
    public Integer getOuterIdType() {
        return this.outerIdType;
    }

    public CreateCustomerRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCustomerRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public CreateCustomerRequest setProdLineId(Long prodLineId) {
        this.prodLineId = prodLineId;
        return this;
    }
    public Long getProdLineId() {
        return this.prodLineId;
    }

    public CreateCustomerRequest setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

}
