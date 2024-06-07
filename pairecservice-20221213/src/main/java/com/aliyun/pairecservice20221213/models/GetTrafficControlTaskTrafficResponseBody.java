// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTaskTraffic")
    public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic trafficControlTaskTraffic;

    public static GetTrafficControlTaskTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskTrafficResponseBody self = new GetTrafficControlTaskTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficControlTaskTrafficResponseBody setTrafficControlTaskTraffic(GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic trafficControlTaskTraffic) {
        this.trafficControlTaskTraffic = trafficControlTaskTraffic;
        return this;
    }
    public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic getTrafficControlTaskTraffic() {
        return this.trafficControlTaskTraffic;
    }

    public static class GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("TrafficContorlTargetId")
        public String trafficContorlTargetId;

        public static GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics self = new GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics setTrafficContorlTargetId(String trafficContorlTargetId) {
            this.trafficContorlTargetId = trafficContorlTargetId;
            return this;
        }
        public String getTrafficContorlTargetId() {
            return this.trafficContorlTargetId;
        }

    }

    public static class GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic extends TeaModel {
        @NameInMap("TargetTraffics")
        public java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics> targetTraffics;

        @NameInMap("TaskTraffics")
        public java.util.Map<String, ?> taskTraffics;

        public static GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic self = new GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic setTargetTraffics(java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics> targetTraffics) {
            this.targetTraffics = targetTraffics;
            return this;
        }
        public java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficTargetTraffics> getTargetTraffics() {
            return this.targetTraffics;
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTraffic setTaskTraffics(java.util.Map<String, ?> taskTraffics) {
            this.taskTraffics = taskTraffics;
            return this;
        }
        public java.util.Map<String, ?> getTaskTraffics() {
            return this.taskTraffics;
        }

    }

}
