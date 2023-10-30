// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupResponseBody extends TeaModel {
    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).</p>
     * <br>
     * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Removes one or more hosts from a host group.</p>
     */
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
        /**
         * <p>RemoveHostsFromGroup</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>RemoveHostsFromGroup</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>WB662865</p>
         */
        @NameInMap("Message")
        public String message;

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

        public RemoveHostsFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
