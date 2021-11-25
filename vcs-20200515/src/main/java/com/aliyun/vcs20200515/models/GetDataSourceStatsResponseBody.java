// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDataSourceStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetDataSourceStatsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDataSourceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceStatsResponseBody self = new GetDataSourceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataSourceStatsResponseBody setData(java.util.List<GetDataSourceStatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataSourceStatsResponseBodyData> getData() {
        return this.data;
    }

    public GetDataSourceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataSourceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataSourceStatsResponseBodyData extends TeaModel {
        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("Items")
        public java.util.Map<String, ?> items;

        @NameInMap("Total")
        public Long total;

        public static GetDataSourceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceStatsResponseBodyData self = new GetDataSourceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceStatsResponseBodyData setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public GetDataSourceStatsResponseBodyData setItems(java.util.Map<String, ?> items) {
            this.items = items;
            return this;
        }
        public java.util.Map<String, ?> getItems() {
            return this.items;
        }

        public GetDataSourceStatsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
