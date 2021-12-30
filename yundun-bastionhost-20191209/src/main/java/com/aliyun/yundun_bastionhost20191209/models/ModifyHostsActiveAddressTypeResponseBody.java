// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ModifyHostsActiveAddressTypeResponseBodyResults> results;

    public static ModifyHostsActiveAddressTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsActiveAddressTypeResponseBody self = new ModifyHostsActiveAddressTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHostsActiveAddressTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHostsActiveAddressTypeResponseBody setResults(java.util.List<ModifyHostsActiveAddressTypeResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyHostsActiveAddressTypeResponseBodyResults> getResults() {
        return this.results;
    }

    public static class ModifyHostsActiveAddressTypeResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Message")
        public String message;

        public static ModifyHostsActiveAddressTypeResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostsActiveAddressTypeResponseBodyResults self = new ModifyHostsActiveAddressTypeResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyHostsActiveAddressTypeResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyHostsActiveAddressTypeResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ModifyHostsActiveAddressTypeResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
