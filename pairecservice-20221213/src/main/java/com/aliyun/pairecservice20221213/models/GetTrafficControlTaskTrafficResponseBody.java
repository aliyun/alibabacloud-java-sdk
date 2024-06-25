// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTaskTrafficInfo")
    public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo;

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

    public GetTrafficControlTaskTrafficResponseBody setTrafficControlTaskTrafficInfo(GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo) {
        this.trafficControlTaskTrafficInfo = trafficControlTaskTrafficInfo;
        return this;
    }
    public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo getTrafficControlTaskTrafficInfo() {
        return this.trafficControlTaskTrafficInfo;
    }

    public static class GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("TrafficContorlTargetId")
        public String trafficContorlTargetId;

        public static GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics self = new GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics setTrafficContorlTargetId(String trafficContorlTargetId) {
            this.trafficContorlTargetId = trafficContorlTargetId;
            return this;
        }
        public String getTrafficContorlTargetId() {
            return this.trafficContorlTargetId;
        }

    }

    public static class GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo extends TeaModel {
        @NameInMap("TargetTraffics")
        public java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics> targetTraffics;

        @NameInMap("TaskTraffics")
        public java.util.Map<String, ?> taskTraffics;

        public static GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo self = new GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo setTargetTraffics(java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics> targetTraffics) {
            this.targetTraffics = targetTraffics;
            return this;
        }
        public java.util.List<GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfoTargetTraffics> getTargetTraffics() {
            return this.targetTraffics;
        }

        public GetTrafficControlTaskTrafficResponseBodyTrafficControlTaskTrafficInfo setTaskTraffics(java.util.Map<String, ?> taskTraffics) {
            this.taskTraffics = taskTraffics;
            return this;
        }
        public java.util.Map<String, ?> getTaskTraffics() {
            return this.taskTraffics;
        }

    }

}
