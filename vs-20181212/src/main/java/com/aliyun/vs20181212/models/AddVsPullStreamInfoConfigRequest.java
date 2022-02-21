// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddVsPullStreamInfoConfigRequest extends TeaModel {
    @NameInMap("Always")
    public String always;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StreamName")
    public String streamName;

    public static AddVsPullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVsPullStreamInfoConfigRequest self = new AddVsPullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddVsPullStreamInfoConfigRequest setAlways(String always) {
        this.always = always;
        return this;
    }
    public String getAlways() {
        return this.always;
    }

    public AddVsPullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddVsPullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddVsPullStreamInfoConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddVsPullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddVsPullStreamInfoConfigRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public AddVsPullStreamInfoConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddVsPullStreamInfoConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
