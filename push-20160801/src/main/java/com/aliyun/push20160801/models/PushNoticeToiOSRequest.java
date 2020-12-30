// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    @NameInMap("ApnsEnv")
    public String apnsEnv;

    @NameInMap("Title")
    public String title;

    @NameInMap("Body")
    public String body;

    @NameInMap("JobKey")
    public String jobKey;

    @NameInMap("ExtParameters")
    public String extParameters;

    public static PushNoticeToiOSRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSRequest self = new PushNoticeToiOSRequest();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushNoticeToiOSRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushNoticeToiOSRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushNoticeToiOSRequest setApnsEnv(String apnsEnv) {
        this.apnsEnv = apnsEnv;
        return this;
    }
    public String getApnsEnv() {
        return this.apnsEnv;
    }

    public PushNoticeToiOSRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushNoticeToiOSRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushNoticeToiOSRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushNoticeToiOSRequest setExtParameters(String extParameters) {
        this.extParameters = extParameters;
        return this;
    }
    public String getExtParameters() {
        return this.extParameters;
    }

}
