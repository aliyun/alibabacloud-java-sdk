// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotPidListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.InvalidParameter</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetHotspotPidListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
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

    public static GetHotspotPidListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotPidListResponseBody self = new GetHotspotPidListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotPidListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotPidListResponseBody setData(GetHotspotPidListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotPidListResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotPidListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotPidListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotspotPidListResponseBodyData extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotPidListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotPidListResponseBodyData self = new GetHotspotPidListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotPidListResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotPidListResponseBodyData setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

}
