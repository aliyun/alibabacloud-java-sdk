// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddHostsToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AddHostsToGroupResponseBodyResults> results;

    public static AddHostsToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToGroupResponseBody self = new AddHostsToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHostsToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHostsToGroupResponseBody setResults(java.util.List<AddHostsToGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddHostsToGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddHostsToGroupResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("HostId")
        public String hostId;

        public static AddHostsToGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddHostsToGroupResponseBodyResults self = new AddHostsToGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddHostsToGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddHostsToGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddHostsToGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AddHostsToGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
