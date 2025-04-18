// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceBindNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateInstanceBindNumberResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateInstanceBindNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceBindNumberResponseBody self = new CreateInstanceBindNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceBindNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceBindNumberResponseBody setData(CreateInstanceBindNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateInstanceBindNumberResponseBodyData getData() {
        return this.data;
    }

    public CreateInstanceBindNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateInstanceBindNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstanceBindNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceBindNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateInstanceBindNumberResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>96b847ad-2683-4794-b7b4-7ef094fb81f6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreateInstanceBindNumberResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceBindNumberResponseBodyDataList self = new CreateInstanceBindNumberResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CreateInstanceBindNumberResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceBindNumberResponseBodyDataList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateInstanceBindNumberResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CreateInstanceBindNumberResponseBodyDataList> list;

        public static CreateInstanceBindNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceBindNumberResponseBodyData self = new CreateInstanceBindNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInstanceBindNumberResponseBodyData setList(java.util.List<CreateInstanceBindNumberResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CreateInstanceBindNumberResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
