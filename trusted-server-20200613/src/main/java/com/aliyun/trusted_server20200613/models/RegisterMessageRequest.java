// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class RegisterMessageRequest extends TeaModel {
    @NameInMap("Extensions")
    public String extensions;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PropertyAffiliation")
    public Integer propertyAffiliation;

    @NameInMap("PropertyName")
    public String propertyName;

    @NameInMap("PropertyPrivateIp")
    public String propertyPrivateIp;

    @NameInMap("PropertyPublicIp")
    public String propertyPublicIp;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static RegisterMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMessageRequest self = new RegisterMessageRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMessageRequest setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public RegisterMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RegisterMessageRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RegisterMessageRequest setPropertyAffiliation(Integer propertyAffiliation) {
        this.propertyAffiliation = propertyAffiliation;
        return this;
    }
    public Integer getPropertyAffiliation() {
        return this.propertyAffiliation;
    }

    public RegisterMessageRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public RegisterMessageRequest setPropertyPrivateIp(String propertyPrivateIp) {
        this.propertyPrivateIp = propertyPrivateIp;
        return this;
    }
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    public RegisterMessageRequest setPropertyPublicIp(String propertyPublicIp) {
        this.propertyPublicIp = propertyPublicIp;
        return this;
    }
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    public RegisterMessageRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
