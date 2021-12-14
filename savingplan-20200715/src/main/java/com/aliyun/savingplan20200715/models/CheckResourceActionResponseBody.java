// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CheckResourceActionResponseBody extends TeaModel {
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

    @NameInMap("Level")
    public Long level;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    @NameInMap("Url")
    public String url;

    public static CheckResourceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceActionResponseBody self = new CheckResourceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceActionResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CheckResourceActionResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CheckResourceActionResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public CheckResourceActionResponseBody setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public CheckResourceActionResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public CheckResourceActionResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public CheckResourceActionResponseBody setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CheckResourceActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResourceActionResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public CheckResourceActionResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CheckResourceActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckResourceActionResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public CheckResourceActionResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public CheckResourceActionResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
