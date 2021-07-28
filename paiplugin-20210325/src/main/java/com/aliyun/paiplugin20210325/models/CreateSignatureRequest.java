// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateSignatureRequest extends TeaModel {
    // 签名归属方的三证合一，OSS地址，必须以https开头，使用前需要授权
    @NameInMap("Certificates")
    public String certificates;

    // 申请说明
    @NameInMap("Description")
    public String description;

    // 签名名称
    @NameInMap("Name")
    public String name;

    // 授权委托书(Power of attorney)， OSS地址，必须以https或oss开头，使用前需要授权，同上
    @NameInMap("PowerOfAttorney")
    public String powerOfAttorney;

    // 无需填写
    @NameInMap("ProcessInstanceID")
    public String processInstanceID;

    public static CreateSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureRequest self = new CreateSignatureRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignatureRequest setCertificates(String certificates) {
        this.certificates = certificates;
        return this;
    }
    public String getCertificates() {
        return this.certificates;
    }

    public CreateSignatureRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSignatureRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSignatureRequest setPowerOfAttorney(String powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
        return this;
    }
    public String getPowerOfAttorney() {
        return this.powerOfAttorney;
    }

    public CreateSignatureRequest setProcessInstanceID(String processInstanceID) {
        this.processInstanceID = processInstanceID;
        return this;
    }
    public String getProcessInstanceID() {
        return this.processInstanceID;
    }

}
