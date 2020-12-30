// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToAndroidRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    @NameInMap("Title")
    public String title;

    @NameInMap("Body")
    public String body;

    @NameInMap("JobKey")
    public String jobKey;

    @NameInMap("ExtParameters")
    public String extParameters;

    public static PushNoticeToAndroidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToAndroidRequest self = new PushNoticeToAndroidRequest();
        return TeaModel.build(map, self);
    }

    public PushNoticeToAndroidRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushNoticeToAndroidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushNoticeToAndroidRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushNoticeToAndroidRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushNoticeToAndroidRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushNoticeToAndroidRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushNoticeToAndroidRequest setExtParameters(String extParameters) {
        this.extParameters = extParameters;
        return this;
    }
    public String getExtParameters() {
        return this.extParameters;
    }

}
