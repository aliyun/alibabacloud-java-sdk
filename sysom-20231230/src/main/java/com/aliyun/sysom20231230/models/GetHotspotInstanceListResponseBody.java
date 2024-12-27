// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotInstanceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetHotspotInstanceListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHotspotInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotInstanceListResponseBody self = new GetHotspotInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotInstanceListResponseBody setData(GetHotspotInstanceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotInstanceListResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotspotInstanceListResponseBodyData extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<String> values;

        public static GetHotspotInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotInstanceListResponseBodyData self = new GetHotspotInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotInstanceListResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotInstanceListResponseBodyData setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
