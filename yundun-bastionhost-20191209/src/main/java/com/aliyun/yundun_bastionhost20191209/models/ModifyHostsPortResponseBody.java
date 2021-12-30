// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsPortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ModifyHostsPortResponseBodyResults> results;

    public static ModifyHostsPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsPortResponseBody self = new ModifyHostsPortResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHostsPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHostsPortResponseBody setResults(java.util.List<ModifyHostsPortResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyHostsPortResponseBodyResults> getResults() {
        return this.results;
    }

    public static class ModifyHostsPortResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Message")
        public String message;

        public static ModifyHostsPortResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostsPortResponseBodyResults self = new ModifyHostsPortResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyHostsPortResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyHostsPortResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ModifyHostsPortResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
