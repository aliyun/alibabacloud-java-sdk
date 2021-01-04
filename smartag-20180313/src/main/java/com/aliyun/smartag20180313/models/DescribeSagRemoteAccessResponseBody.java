// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRemoteAccessResponseBody extends TeaModel {
    @NameInMap("RemoteAccesses")
    public DescribeSagRemoteAccessResponseBodyRemoteAccesses remoteAccesses;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSagRemoteAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRemoteAccessResponseBody self = new DescribeSagRemoteAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRemoteAccessResponseBody setRemoteAccesses(DescribeSagRemoteAccessResponseBodyRemoteAccesses remoteAccesses) {
        this.remoteAccesses = remoteAccesses;
        return this;
    }
    public DescribeSagRemoteAccessResponseBodyRemoteAccesses getRemoteAccesses() {
        return this.remoteAccesses;
    }

    public DescribeSagRemoteAccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSagRemoteAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRemoteAccessResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeSagRemoteAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSagRemoteAccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("RemoteAccessIp")
        public String remoteAccessIp;

        public static DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess self = new DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess();
            return TeaModel.build(map, self);
        }

        public DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess setRemoteAccessIp(String remoteAccessIp) {
            this.remoteAccessIp = remoteAccessIp;
            return this;
        }
        public String getRemoteAccessIp() {
            return this.remoteAccessIp;
        }

    }

    public static class DescribeSagRemoteAccessResponseBodyRemoteAccesses extends TeaModel {
        @NameInMap("RemoteAccess")
        public java.util.List<DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess> remoteAccess;

        public static DescribeSagRemoteAccessResponseBodyRemoteAccesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRemoteAccessResponseBodyRemoteAccesses self = new DescribeSagRemoteAccessResponseBodyRemoteAccesses();
            return TeaModel.build(map, self);
        }

        public DescribeSagRemoteAccessResponseBodyRemoteAccesses setRemoteAccess(java.util.List<DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess> remoteAccess) {
            this.remoteAccess = remoteAccess;
            return this;
        }
        public java.util.List<DescribeSagRemoteAccessResponseBodyRemoteAccessesRemoteAccess> getRemoteAccess() {
            return this.remoteAccess;
        }

    }

}
