// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMonitorResultResponseData data;

    public static GetMonitorResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultResponse self = new GetMonitorResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMonitorResultResponseDataRecords extends TeaModel {
        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("LeftUpY")
        @Validation(required = true)
        public String leftUpY;

        @NameInMap("LeftUpX")
        @Validation(required = true)
        public String leftUpX;

        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("MonitorPicUrl")
        @Validation(required = true)
        public String monitorPicUrl;

        public static GetMonitorResultResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseDataRecords self = new GetMonitorResultResponseDataRecords();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMonitorResultResponseData extends TeaModel {
        @NameInMap("MaxId")
        @Validation(required = true)
        public String maxId;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetMonitorResultResponseDataRecords> records;

        public static GetMonitorResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseData self = new GetMonitorResultResponseData();
            return TeaModel.build(map, self);
        }

    }

}
