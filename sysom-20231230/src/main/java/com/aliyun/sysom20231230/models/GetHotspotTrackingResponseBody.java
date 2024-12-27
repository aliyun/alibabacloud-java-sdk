// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotTrackingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetHotspotTrackingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHotspotTrackingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTrackingResponseBody self = new GetHotspotTrackingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotTrackingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotTrackingResponseBody setData(GetHotspotTrackingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotTrackingResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotTrackingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotTrackingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotspotTrackingResponseBodyDataFlame extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotTrackingResponseBodyDataFlame build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotTrackingResponseBodyDataFlame self = new GetHotspotTrackingResponseBodyDataFlame();
            return TeaModel.build(map, self);
        }

        public GetHotspotTrackingResponseBodyDataFlame setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotTrackingResponseBodyDataFlame setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

    public static class GetHotspotTrackingResponseBodyDataSeries extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotTrackingResponseBodyDataSeries build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotTrackingResponseBodyDataSeries self = new GetHotspotTrackingResponseBodyDataSeries();
            return TeaModel.build(map, self);
        }

        public GetHotspotTrackingResponseBodyDataSeries setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotTrackingResponseBodyDataSeries setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

    public static class GetHotspotTrackingResponseBodyData extends TeaModel {
        @NameInMap("flame")
        public GetHotspotTrackingResponseBodyDataFlame flame;

        @NameInMap("series")
        public GetHotspotTrackingResponseBodyDataSeries series;

        public static GetHotspotTrackingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotTrackingResponseBodyData self = new GetHotspotTrackingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotTrackingResponseBodyData setFlame(GetHotspotTrackingResponseBodyDataFlame flame) {
            this.flame = flame;
            return this;
        }
        public GetHotspotTrackingResponseBodyDataFlame getFlame() {
            return this.flame;
        }

        public GetHotspotTrackingResponseBodyData setSeries(GetHotspotTrackingResponseBodyDataSeries series) {
            this.series = series;
            return this;
        }
        public GetHotspotTrackingResponseBodyDataSeries getSeries() {
            return this.series;
        }

    }

}
