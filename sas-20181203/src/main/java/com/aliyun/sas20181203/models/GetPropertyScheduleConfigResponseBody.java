// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPropertyScheduleConfigResponseBody extends TeaModel {
    @NameInMap("PropertyScheduleConfig")
    public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig propertyScheduleConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPropertyScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPropertyScheduleConfigResponseBody self = new GetPropertyScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPropertyScheduleConfigResponseBody setPropertyScheduleConfig(GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig propertyScheduleConfig) {
        this.propertyScheduleConfig = propertyScheduleConfig;
        return this;
    }
    public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig getPropertyScheduleConfig() {
        return this.propertyScheduleConfig;
    }

    public GetPropertyScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig extends TeaModel {
        @NameInMap("NextScheduleTime")
        public Long nextScheduleTime;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("Type")
        public String type;

        public static GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig self = new GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setNextScheduleTime(Long nextScheduleTime) {
            this.nextScheduleTime = nextScheduleTime;
            return this;
        }
        public Long getNextScheduleTime() {
            return this.nextScheduleTime;
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
