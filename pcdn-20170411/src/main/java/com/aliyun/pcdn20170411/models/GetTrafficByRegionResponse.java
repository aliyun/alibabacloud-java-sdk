// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficByRegionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("TrafficDataList")
    @Validation(required = true)
    public GetTrafficByRegionResponseTrafficDataList trafficDataList;

    public static GetTrafficByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficByRegionResponse self = new GetTrafficByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficByRegionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficByRegionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTrafficByRegionResponse setTrafficDataList(GetTrafficByRegionResponseTrafficDataList trafficDataList) {
        this.trafficDataList = trafficDataList;
        return this;
    }
    public GetTrafficByRegionResponseTrafficDataList getTrafficDataList() {
        return this.trafficDataList;
    }

    public static class GetTrafficByRegionResponseTrafficDataListTrafficData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Traffic")
        @Validation(required = true)
        public Long traffic;

        public static GetTrafficByRegionResponseTrafficDataListTrafficData build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficByRegionResponseTrafficDataListTrafficData self = new GetTrafficByRegionResponseTrafficDataListTrafficData();
            return TeaModel.build(map, self);
        }

        public GetTrafficByRegionResponseTrafficDataListTrafficData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrafficByRegionResponseTrafficDataListTrafficData setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class GetTrafficByRegionResponseTrafficDataList extends TeaModel {
        @NameInMap("TrafficData")
        @Validation(required = true)
        public java.util.List<GetTrafficByRegionResponseTrafficDataListTrafficData> trafficData;

        public static GetTrafficByRegionResponseTrafficDataList build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficByRegionResponseTrafficDataList self = new GetTrafficByRegionResponseTrafficDataList();
            return TeaModel.build(map, self);
        }

        public GetTrafficByRegionResponseTrafficDataList setTrafficData(java.util.List<GetTrafficByRegionResponseTrafficDataListTrafficData> trafficData) {
            this.trafficData = trafficData;
            return this;
        }
        public java.util.List<GetTrafficByRegionResponseTrafficDataListTrafficData> getTrafficData() {
            return this.trafficData;
        }

    }

}
