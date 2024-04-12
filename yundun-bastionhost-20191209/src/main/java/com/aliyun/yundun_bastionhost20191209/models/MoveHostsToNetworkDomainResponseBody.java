// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveHostsToNetworkDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<MoveHostsToNetworkDomainResponseBodyResults> results;

    public static MoveHostsToNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveHostsToNetworkDomainResponseBody self = new MoveHostsToNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveHostsToNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveHostsToNetworkDomainResponseBody setResults(java.util.List<MoveHostsToNetworkDomainResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MoveHostsToNetworkDomainResponseBodyResults> getResults() {
        return this.results;
    }

    public static class MoveHostsToNetworkDomainResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Message")
        public String message;

        public static MoveHostsToNetworkDomainResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MoveHostsToNetworkDomainResponseBodyResults self = new MoveHostsToNetworkDomainResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MoveHostsToNetworkDomainResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MoveHostsToNetworkDomainResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public MoveHostsToNetworkDomainResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
