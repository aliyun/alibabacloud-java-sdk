// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
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
         * <p>Make sure that the specified bastion host ID and host IDs are valid and call the operation again.</p>
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
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The ID of the host.</p>
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
         * <p>无</p>
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
