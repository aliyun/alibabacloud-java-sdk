// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAdvancedMonitorStateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAdvancedMonitorStateResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAdvancedMonitorStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedMonitorStateResponseBody self = new GetAdvancedMonitorStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvancedMonitorStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAdvancedMonitorStateResponseBody setData(java.util.List<GetAdvancedMonitorStateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAdvancedMonitorStateResponseBodyData> getData() {
        return this.data;
    }

    public GetAdvancedMonitorStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAdvancedMonitorStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAdvancedMonitorStateResponseBodyData extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        public static GetAdvancedMonitorStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAdvancedMonitorStateResponseBodyData self = new GetAdvancedMonitorStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAdvancedMonitorStateResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
