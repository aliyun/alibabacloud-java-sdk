// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeResponseBody extends TeaModel {
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
        /**
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>OK</strong>: The call was successful.</p>
         * </li>
         * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
         * </li>
         * <li><p><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</p>
         * </li>
         * <li><p><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</p>
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
         * <p>None</p>
         */
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
