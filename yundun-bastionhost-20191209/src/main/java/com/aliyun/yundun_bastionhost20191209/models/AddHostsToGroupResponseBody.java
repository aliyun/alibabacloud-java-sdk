// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddHostsToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
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
        /**
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>OK</strong>: The call was successful.</p>
         * </li>
         * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
         * </li>
         * <li><p><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</p>
         * <blockquote>
         * <p>Make sure that the request parameters are valid and call the operation again.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</p>
         * <blockquote>
         * <p>Make sure that the specified bastion host ID and host IDs are valid. Then, call the operation again.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("Message")
        public String message;

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

        public AddHostsToGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
