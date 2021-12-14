// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class PhysicalDeleteResourceActionResponseBody extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Country")
    public String country;

    @NameInMap("GmtWakeup")
    public String gmtWakeup;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    public static PhysicalDeleteResourceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhysicalDeleteResourceActionResponseBody self = new PhysicalDeleteResourceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public PhysicalDeleteResourceActionResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PhysicalDeleteResourceActionResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public PhysicalDeleteResourceActionResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public PhysicalDeleteResourceActionResponseBody setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public PhysicalDeleteResourceActionResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public PhysicalDeleteResourceActionResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public PhysicalDeleteResourceActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhysicalDeleteResourceActionResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public PhysicalDeleteResourceActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PhysicalDeleteResourceActionResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public PhysicalDeleteResourceActionResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

}
