// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsPortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.</p>
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
         * <ul>
         * <li></li>
         * </ul>
         */
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
