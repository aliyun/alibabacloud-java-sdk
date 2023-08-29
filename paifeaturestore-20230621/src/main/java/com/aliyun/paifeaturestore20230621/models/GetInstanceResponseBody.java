// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("Progress")
    public Double progress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setProgress(Double progress) {
        this.progress = progress;
        return this;
    }
    public Double getProgress() {
        return this.progress;
    }

    public GetInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
