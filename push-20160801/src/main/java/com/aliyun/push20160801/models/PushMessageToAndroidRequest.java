// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToAndroidRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Body")
    public String body;

    @NameInMap("JobKey")
    public String jobKey;

    @NameInMap("StoreOffline")
    public Boolean storeOffline;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    @NameInMap("Title")
    public String title;

    public static PushMessageToAndroidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToAndroidRequest self = new PushMessageToAndroidRequest();
        return TeaModel.build(map, self);
    }

    public PushMessageToAndroidRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushMessageToAndroidRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PushMessageToAndroidRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public PushMessageToAndroidRequest setStoreOffline(Boolean storeOffline) {
        this.storeOffline = storeOffline;
        return this;
    }
    public Boolean getStoreOffline() {
        return this.storeOffline;
    }

    public PushMessageToAndroidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushMessageToAndroidRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

    public PushMessageToAndroidRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
