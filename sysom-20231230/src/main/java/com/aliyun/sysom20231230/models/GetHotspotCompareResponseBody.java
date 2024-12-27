// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotCompareResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetHotspotCompareResponseBodyData data;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetHotspotCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotCompareResponseBody self = new GetHotspotCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotCompareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotCompareResponseBody setData(GetHotspotCompareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotCompareResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotCompareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotCompareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotspotCompareResponseBodyDataFlame extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotCompareResponseBodyDataFlame build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotCompareResponseBodyDataFlame self = new GetHotspotCompareResponseBodyDataFlame();
            return TeaModel.build(map, self);
        }

        public GetHotspotCompareResponseBodyDataFlame setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotCompareResponseBodyDataFlame setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

    public static class GetHotspotCompareResponseBodyDataSeriesInstance1 extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotCompareResponseBodyDataSeriesInstance1 build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotCompareResponseBodyDataSeriesInstance1 self = new GetHotspotCompareResponseBodyDataSeriesInstance1();
            return TeaModel.build(map, self);
        }

        public GetHotspotCompareResponseBodyDataSeriesInstance1 setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotCompareResponseBodyDataSeriesInstance1 setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

    public static class GetHotspotCompareResponseBodyDataSeriesInstance2 extends TeaModel {
        @NameInMap("columns")
        public java.util.List<String> columns;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static GetHotspotCompareResponseBodyDataSeriesInstance2 build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotCompareResponseBodyDataSeriesInstance2 self = new GetHotspotCompareResponseBodyDataSeriesInstance2();
            return TeaModel.build(map, self);
        }

        public GetHotspotCompareResponseBodyDataSeriesInstance2 setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHotspotCompareResponseBodyDataSeriesInstance2 setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

    public static class GetHotspotCompareResponseBodyData extends TeaModel {
        @NameInMap("flame")
        public GetHotspotCompareResponseBodyDataFlame flame;

        @NameInMap("series_instance1")
        public GetHotspotCompareResponseBodyDataSeriesInstance1 seriesInstance1;

        @NameInMap("series_instance2")
        public GetHotspotCompareResponseBodyDataSeriesInstance2 seriesInstance2;

        public static GetHotspotCompareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotCompareResponseBodyData self = new GetHotspotCompareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotCompareResponseBodyData setFlame(GetHotspotCompareResponseBodyDataFlame flame) {
            this.flame = flame;
            return this;
        }
        public GetHotspotCompareResponseBodyDataFlame getFlame() {
            return this.flame;
        }

        public GetHotspotCompareResponseBodyData setSeriesInstance1(GetHotspotCompareResponseBodyDataSeriesInstance1 seriesInstance1) {
            this.seriesInstance1 = seriesInstance1;
            return this;
        }
        public GetHotspotCompareResponseBodyDataSeriesInstance1 getSeriesInstance1() {
            return this.seriesInstance1;
        }

        public GetHotspotCompareResponseBodyData setSeriesInstance2(GetHotspotCompareResponseBodyDataSeriesInstance2 seriesInstance2) {
            this.seriesInstance2 = seriesInstance2;
            return this;
        }
        public GetHotspotCompareResponseBodyDataSeriesInstance2 getSeriesInstance2() {
            return this.seriesInstance2;
        }

    }

}
