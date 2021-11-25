// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SyncDeviceTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("NTPServer")
    public String NTPServer;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetryInterval")
    public String retryInterval;

    @NameInMap("SyncInterval")
    public String syncInterval;

    @NameInMap("TimeStamp")
    public String timeStamp;

    public static SyncDeviceTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceTimeResponseBody self = new SyncDeviceTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncDeviceTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncDeviceTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncDeviceTimeResponseBody setNTPServer(String NTPServer) {
        this.NTPServer = NTPServer;
        return this;
    }
    public String getNTPServer() {
        return this.NTPServer;
    }

    public SyncDeviceTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncDeviceTimeResponseBody setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public SyncDeviceTimeResponseBody setSyncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
        return this;
    }
    public String getSyncInterval() {
        return this.syncInterval;
    }

    public SyncDeviceTimeResponseBody setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
