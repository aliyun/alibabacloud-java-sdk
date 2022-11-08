// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DisableDataReflowResponseBody extends TeaModel {
    @NameInMap("Data")
    public DisableDataReflowResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DisableDataReflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDataReflowResponseBody self = new DisableDataReflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDataReflowResponseBody setData(DisableDataReflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableDataReflowResponseBodyData getData() {
        return this.data;
    }

    public DisableDataReflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DisableDataReflowResponseBodyData extends TeaModel {
        @NameInMap("EnableDataReflowFlag")
        public Boolean enableDataReflowFlag;

        @NameInMap("ServiceId")
        public Long serviceId;

        public static DisableDataReflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableDataReflowResponseBodyData self = new DisableDataReflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableDataReflowResponseBodyData setEnableDataReflowFlag(Boolean enableDataReflowFlag) {
            this.enableDataReflowFlag = enableDataReflowFlag;
            return this;
        }
        public Boolean getEnableDataReflowFlag() {
            return this.enableDataReflowFlag;
        }

        public DisableDataReflowResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

    }

}
