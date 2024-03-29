// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSRequest extends TeaModel {
    @NameInMap("ApnsEnv")
    public String apnsEnv;

    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Body")
    public String body;

    @NameInMap("ExtParameters")
    public String extParameters;

    @NameInMap("JobKey")
    public String jobKey;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    @NameInMap("Title")
    public String title;

    public static PushNoticeToiOSRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSRequest self = new PushNoticeToiOSRequest();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSRequest setApnsEnv(String apnsEnv) {
        this.apnsEnv = apnsEnv;
        return this;
    }
    public String getApnsEnv() {
        return this.apnsEnv;
    }

    public PushNoticeToiOSRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushNoticeToiOSRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushNoticeToiOSRequest setExtParameters(String extParameters) {
        this.extParameters = extParameters;
        return this;
    }
    public String getExtParameters() {
        return this.extParameters;
    }

    public PushNoticeToiOSRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
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

    public PushNoticeToiOSRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
