// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamURLRequest extends TeaModel {
    @NameInMap("Auth")
    public Boolean auth;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("Id")
    public String id;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Transcode")
    public String transcode;

    @NameInMap("Type")
    public String type;

    public static DescribeStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamURLRequest self = new DescribeStreamURLRequest();
        return TeaModel.build(map, self);
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

    public DescribeStreamURLRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeStreamURLRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeStreamURLRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStreamURLRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamURLRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeStreamURLRequest setTranscode(String transcode) {
        this.transcode = transcode;
        return this;
    }
    public String getTranscode() {
        return this.transcode;
    }

    public DescribeStreamURLRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
