// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteDataReflowDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDataReflowDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataReflowDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataReflowDataResponseBody self = new DeleteDataReflowDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataReflowDataResponseBody setData(DeleteDataReflowDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataReflowDataResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataReflowDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDataReflowDataResponseBodyData extends TeaModel {
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("Status")
        public String status;

        public static DeleteDataReflowDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataReflowDataResponseBodyData self = new DeleteDataReflowDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataReflowDataResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DeleteDataReflowDataResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteDataReflowDataResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public DeleteDataReflowDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
