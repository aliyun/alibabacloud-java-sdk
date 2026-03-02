// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateProfileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F62225F8-DDE4-526E-A88B-08906DED5060</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProfileResponseBody self = new CreateProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProfileResponseBody setData(CreateProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProfileResponseBodyData getData() {
        return this.data;
    }

    public CreateProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProfileResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>210235A52L5248C0000N</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ST-JobTemplate</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>schema id</p>
         * 
         * <strong>example:</strong>
         * <p>33440</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProfileResponseBodyData self = new CreateProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProfileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProfileResponseBodyData setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

}
