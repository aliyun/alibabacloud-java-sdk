// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("App")
    public String app;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushDomain")
    public String pushDomain;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Id")
    public String id;

    public static DescribeStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamResponseBody self = new DescribeStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeStreamResponseBody setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public DescribeStreamResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeStreamResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeStreamResponseBody setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public DescribeStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeStreamResponseBody setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public DescribeStreamResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeStreamResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeStreamResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeStreamResponseBody setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public DescribeStreamResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeStreamResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
