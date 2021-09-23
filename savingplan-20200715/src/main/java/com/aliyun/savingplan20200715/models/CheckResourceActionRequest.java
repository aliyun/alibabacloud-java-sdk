// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CheckResourceActionRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    @NameInMap("Url")
    public String url;

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

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Prompt")
    public String prompt;

    public static CheckResourceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceActionRequest self = new CheckResourceActionRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceActionRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CheckResourceActionRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public CheckResourceActionRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CheckResourceActionRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public CheckResourceActionRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResourceActionRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public CheckResourceActionRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CheckResourceActionRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckResourceActionRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public CheckResourceActionRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public CheckResourceActionRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public CheckResourceActionRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public CheckResourceActionRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CheckResourceActionRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
