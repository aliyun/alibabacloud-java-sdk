// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListNluModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListNluModelsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>7401D698-0AAC-5909-B68E-88C68805FFB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNluModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNluModelsResponseBody self = new ListNluModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNluModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNluModelsResponseBody setData(java.util.List<ListNluModelsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNluModelsResponseBodyData> getData() {
        return this.data;
    }

    public ListNluModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNluModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNluModelsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListNluModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNluModelsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListNluModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNluModelsResponseBodyData self = new ListNluModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNluModelsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNluModelsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
