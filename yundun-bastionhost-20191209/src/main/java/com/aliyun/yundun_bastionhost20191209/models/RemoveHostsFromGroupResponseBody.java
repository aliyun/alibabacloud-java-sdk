// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<RemoveHostsFromGroupResponseBodyResults> results;

    public static RemoveHostsFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupResponseBody self = new RemoveHostsFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveHostsFromGroupResponseBody setResults(java.util.List<RemoveHostsFromGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveHostsFromGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveHostsFromGroupResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("HostId")
        public String hostId;

        public static RemoveHostsFromGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveHostsFromGroupResponseBodyResults self = new RemoveHostsFromGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveHostsFromGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveHostsFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveHostsFromGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public RemoveHostsFromGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
