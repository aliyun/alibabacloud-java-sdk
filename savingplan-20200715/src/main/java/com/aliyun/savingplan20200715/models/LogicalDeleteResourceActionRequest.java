// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class LogicalDeleteResourceActionRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("GmtWakeup")
    public String gmtWakeup;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    public static LogicalDeleteResourceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        LogicalDeleteResourceActionRequest self = new LogicalDeleteResourceActionRequest();
        return TeaModel.build(map, self);
    }

    public LogicalDeleteResourceActionRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public LogicalDeleteResourceActionRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public LogicalDeleteResourceActionRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LogicalDeleteResourceActionRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public LogicalDeleteResourceActionRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public LogicalDeleteResourceActionRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public LogicalDeleteResourceActionRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public LogicalDeleteResourceActionRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public LogicalDeleteResourceActionRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public LogicalDeleteResourceActionRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LogicalDeleteResourceActionRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

}
