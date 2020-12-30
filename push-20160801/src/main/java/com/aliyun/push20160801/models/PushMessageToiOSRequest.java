// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToiOSRequest extends TeaModel {
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

    public static PushMessageToiOSRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToiOSRequest self = new PushMessageToiOSRequest();
        return TeaModel.build(map, self);
    }

    public PushMessageToiOSRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushMessageToiOSRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushMessageToiOSRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushMessageToiOSRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushMessageToiOSRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushMessageToiOSRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

}
