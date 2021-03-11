// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamURLRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("Type")
    public String type;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("OutHostType")
    public String outHostType;

    @NameInMap("Location")
    public String location;

    @NameInMap("Auth")
    public Boolean auth;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Transcode")
    public String transcode;

    public static DescribeStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamURLRequest self = new DescribeStreamURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamURLRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeStreamURLRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStreamURLRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeStreamURLRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeStreamURLRequest setOutHostType(String outHostType) {
        this.outHostType = outHostType;
        return this;
    }
    public String getOutHostType() {
        return this.outHostType;
    }

    public DescribeStreamURLRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeStreamURLRequest setAuth(Boolean auth) {
        this.auth = auth;
        return this;
    }
    public Boolean getAuth() {
        return this.auth;
    }

    public DescribeStreamURLRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public DescribeStreamURLRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeStreamURLRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeStreamURLRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeStreamURLRequest setTranscode(String transcode) {
        this.transcode = transcode;
        return this;
    }
    public String getTranscode() {
        return this.transcode;
    }

}
