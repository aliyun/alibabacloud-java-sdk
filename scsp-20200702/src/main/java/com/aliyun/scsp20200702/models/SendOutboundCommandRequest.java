// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SendOutboundCommandRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CustomerInfo")
    public String customerInfo;

    public static SendOutboundCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        SendOutboundCommandRequest self = new SendOutboundCommandRequest();
        return TeaModel.build(map, self);
    }

    public SendOutboundCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendOutboundCommandRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SendOutboundCommandRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public SendOutboundCommandRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SendOutboundCommandRequest setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
        return this;
    }
    public String getCustomerInfo() {
        return this.customerInfo;
    }

}
