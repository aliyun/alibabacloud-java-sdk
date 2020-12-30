// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficByRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficDataList")
    public GetTrafficByRegionResponseBodyTrafficDataList trafficDataList;

    @NameInMap("Code")
    public Integer code;

    public static GetTrafficByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficByRegionResponseBody self = new GetTrafficByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficByRegionResponseBody setTrafficDataList(GetTrafficByRegionResponseBodyTrafficDataList trafficDataList) {
        this.trafficDataList = trafficDataList;
        return this;
    }
    public GetTrafficByRegionResponseBodyTrafficDataList getTrafficDataList() {
        return this.trafficDataList;
    }

    public GetTrafficByRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetTrafficByRegionResponseBodyTrafficDataListTrafficData extends TeaModel {
        @NameInMap("Traffic")
        public Long traffic;

        @NameInMap("Name")
        public String name;

        public static GetTrafficByRegionResponseBodyTrafficDataListTrafficData build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficByRegionResponseBodyTrafficDataListTrafficData self = new GetTrafficByRegionResponseBodyTrafficDataListTrafficData();
            return TeaModel.build(map, self);
        }

        public GetTrafficByRegionResponseBodyTrafficDataListTrafficData setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

        public GetTrafficByRegionResponseBodyTrafficDataListTrafficData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTrafficByRegionResponseBodyTrafficDataList extends TeaModel {
        @NameInMap("TrafficData")
        public java.util.List<GetTrafficByRegionResponseBodyTrafficDataListTrafficData> trafficData;

        public static GetTrafficByRegionResponseBodyTrafficDataList build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficByRegionResponseBodyTrafficDataList self = new GetTrafficByRegionResponseBodyTrafficDataList();
            return TeaModel.build(map, self);
        }

        public GetTrafficByRegionResponseBodyTrafficDataList setTrafficData(java.util.List<GetTrafficByRegionResponseBodyTrafficDataListTrafficData> trafficData) {
            this.trafficData = trafficData;
            return this;
        }
        public java.util.List<GetTrafficByRegionResponseBodyTrafficDataListTrafficData> getTrafficData() {
            return this.trafficData;
        }

    }

}
