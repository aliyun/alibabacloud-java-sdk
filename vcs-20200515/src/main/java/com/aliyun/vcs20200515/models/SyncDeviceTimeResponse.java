// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SyncDeviceTimeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("NTPServer")
    @Validation(required = true)
    public String NTPServer;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RetryInterval")
    @Validation(required = true)
    public String retryInterval;

    @NameInMap("SyncInterval")
    @Validation(required = true)
    public String syncInterval;

    @NameInMap("TimeStamp")
    @Validation(required = true)
    public String timeStamp;

    public static SyncDeviceTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceTimeResponse self = new SyncDeviceTimeResponse();
        return TeaModel.build(map, self);
    }

    public SyncDeviceTimeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncDeviceTimeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncDeviceTimeResponse setNTPServer(String NTPServer) {
        this.NTPServer = NTPServer;
        return this;
    }
    public String getNTPServer() {
        return this.NTPServer;
    }

    public SyncDeviceTimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncDeviceTimeResponse setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public SyncDeviceTimeResponse setSyncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
        return this;
    }
    public String getSyncInterval() {
        return this.syncInterval;
    }

    public SyncDeviceTimeResponse setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
