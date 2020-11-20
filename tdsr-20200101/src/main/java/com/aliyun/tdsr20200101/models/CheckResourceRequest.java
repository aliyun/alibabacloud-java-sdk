// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckResourceRequest extends TeaModel {
    @NameInMap("Country")
    @Validation(required = true)
    public String country;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Invoker")
    @Validation(required = true)
    public String invoker;

    @NameInMap("Pk")
    @Validation(required = true)
    public String pk;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("Hid")
    @Validation(required = true)
    public Long hid;

    @NameInMap("TaskIdentifier")
    @Validation(required = true)
    public String taskIdentifier;

    @NameInMap("TaskExtraData")
    @Validation(required = true)
    public String taskExtraData;

    @NameInMap("GmtWakeup")
    @Validation(required = true)
    public String gmtWakeup;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Url")
    public String url;

    @NameInMap("Prompt")
    public String prompt;

    public static CheckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRequest self = new CheckResourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CheckResourceRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public CheckResourceRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public CheckResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public CheckResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CheckResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public CheckResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public CheckResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public CheckResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public CheckResourceRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckResourceRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResourceRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CheckResourceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CheckResourceRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
