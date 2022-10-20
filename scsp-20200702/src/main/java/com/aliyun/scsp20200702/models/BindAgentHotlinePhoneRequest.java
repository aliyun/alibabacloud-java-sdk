// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class BindAgentHotlinePhoneRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static BindAgentHotlinePhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAgentHotlinePhoneRequest self = new BindAgentHotlinePhoneRequest();
        return TeaModel.build(map, self);
    }

    public BindAgentHotlinePhoneRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindAgentHotlinePhoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public BindAgentHotlinePhoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindAgentHotlinePhoneRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public BindAgentHotlinePhoneRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
