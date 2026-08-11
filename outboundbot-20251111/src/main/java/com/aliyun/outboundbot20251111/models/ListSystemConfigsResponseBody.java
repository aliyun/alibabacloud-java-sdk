// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListSystemConfigsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSystemConfigsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb001</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSystemConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigsResponseBody self = new ListSystemConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSystemConfigsResponseBody setData(java.util.List<ListSystemConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSystemConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListSystemConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSystemConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSystemConfigsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListSystemConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSystemConfigsResponseBodyData extends TeaModel {
        /**
         * <p>The creation time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786085104904</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The system configuration name.\
         * callableTime: the outbound job window.\
         * calleeDailyAttemptLimit: the maximum number of daily calls to a single callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>callableTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration type ID.\
         * If ObjectType is set to INSTANCE, this parameter specifies the instance ID.\
         * If ObjectType is set to TENANT, this parameter specifies the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The configuration type.\
         * INSTANCE: instance-level.\
         * TENANT: tenant-level.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The update time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786085104904</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <p>The system configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSystemConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSystemConfigsResponseBodyData self = new ListSystemConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSystemConfigsResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSystemConfigsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSystemConfigsResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListSystemConfigsResponseBodyData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListSystemConfigsResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListSystemConfigsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
