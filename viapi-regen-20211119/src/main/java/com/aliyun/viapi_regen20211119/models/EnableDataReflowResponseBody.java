// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class EnableDataReflowResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnableDataReflowResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableDataReflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDataReflowResponseBody self = new EnableDataReflowResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDataReflowResponseBody setData(EnableDataReflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableDataReflowResponseBodyData getData() {
        return this.data;
    }

    public EnableDataReflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnableDataReflowResponseBodyData extends TeaModel {
        @NameInMap("DataReflowOssPath")
        public String dataReflowOssPath;

        @NameInMap("DataReflowRate")
        public Long dataReflowRate;

        @NameInMap("EnableDataReflowFlag")
        public Boolean enableDataReflowFlag;

        @NameInMap("ServiceId")
        public Long serviceId;

        public static EnableDataReflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableDataReflowResponseBodyData self = new EnableDataReflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableDataReflowResponseBodyData setDataReflowOssPath(String dataReflowOssPath) {
            this.dataReflowOssPath = dataReflowOssPath;
            return this;
        }
        public String getDataReflowOssPath() {
            return this.dataReflowOssPath;
        }

        public EnableDataReflowResponseBodyData setDataReflowRate(Long dataReflowRate) {
            this.dataReflowRate = dataReflowRate;
            return this;
        }
        public Long getDataReflowRate() {
            return this.dataReflowRate;
        }

        public EnableDataReflowResponseBodyData setEnableDataReflowFlag(Boolean enableDataReflowFlag) {
            this.enableDataReflowFlag = enableDataReflowFlag;
            return this;
        }
        public Boolean getEnableDataReflowFlag() {
            return this.enableDataReflowFlag;
        }

        public EnableDataReflowResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

    }

}
