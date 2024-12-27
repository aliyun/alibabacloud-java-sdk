// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotSpotUniqListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetHotSpotUniqListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetHotSpotUniqListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotSpotUniqListResponseBody self = new GetHotSpotUniqListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotSpotUniqListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotSpotUniqListResponseBody setData(GetHotSpotUniqListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotSpotUniqListResponseBodyData getData() {
        return this.data;
    }

    public GetHotSpotUniqListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotSpotUniqListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotSpotUniqListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetHotSpotUniqListResponseBodyData extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<String> values;

        public static GetHotSpotUniqListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotSpotUniqListResponseBodyData self = new GetHotSpotUniqListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotSpotUniqListResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotSpotUniqListResponseBodyData setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
