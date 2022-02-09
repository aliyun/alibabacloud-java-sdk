// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsKafkaEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOmsKafkaEndpointsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOmsKafkaEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsKafkaEndpointsResponseBody self = new ListOmsKafkaEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsKafkaEndpointsResponseBody setData(java.util.List<ListOmsKafkaEndpointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOmsKafkaEndpointsResponseBodyData> getData() {
        return this.data;
    }

    public ListOmsKafkaEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOmsKafkaEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOmsKafkaEndpointsResponseBodyData extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Name")
        public String name;

        public static ListOmsKafkaEndpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsKafkaEndpointsResponseBodyData self = new ListOmsKafkaEndpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsKafkaEndpointsResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListOmsKafkaEndpointsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
