// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadClassNameResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the system. For more information about error codes, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadClassNameResponseBodyData> data;

    /**
     * <p>The message returned when the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73FD6AE8-898F-5D09-9763-69B8A875488A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadClassNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadClassNameResponseBody self = new ReadClassNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadClassNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadClassNameResponseBody setData(java.util.List<ReadClassNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadClassNameResponseBodyData> getData() {
        return this.data;
    }

    public ReadClassNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadClassNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadClassNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadClassNameResponseBodyData extends TeaModel {
        /**
         * <p>The message category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The message category name.</p>
         * 
         * <strong>example:</strong>
         * <p>安全消息</p>
         */
        @NameInMap("Name")
        public String name;

        public static ReadClassNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadClassNameResponseBodyData self = new ReadClassNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadClassNameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ReadClassNameResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
