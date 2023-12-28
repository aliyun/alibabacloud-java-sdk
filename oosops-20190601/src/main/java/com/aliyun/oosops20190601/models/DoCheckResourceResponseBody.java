// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DoCheckResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("bid")
    public String bid;

    @NameInMap("country")
    public String country;

    @NameInMap("gmtWakeup")
    public String gmtWakeup;

    @NameInMap("hid")
    public Integer hid;

    @NameInMap("interrupt")
    public Boolean interrupt;

    @NameInMap("invoker")
    public String invoker;

    @NameInMap("level")
    public Integer level;

    @NameInMap("message")
    public String message;

    @NameInMap("pk")
    public String pk;

    @NameInMap("prompt")
    public String prompt;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("taskExtraData")
    public String taskExtraData;

    @NameInMap("taskIdentifier")
    public String taskIdentifier;

    @NameInMap("url")
    public String url;

    public static DoCheckResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoCheckResourceResponseBody self = new DoCheckResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DoCheckResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoCheckResourceResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DoCheckResourceResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoCheckResourceResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public DoCheckResourceResponseBody setHid(Integer hid) {
        this.hid = hid;
        return this;
    }
    public Integer getHid() {
        return this.hid;
    }

    public DoCheckResourceResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public DoCheckResourceResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public DoCheckResourceResponseBody setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public DoCheckResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoCheckResourceResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoCheckResourceResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DoCheckResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DoCheckResourceResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoCheckResourceResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public DoCheckResourceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
