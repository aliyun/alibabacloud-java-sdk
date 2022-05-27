// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public StopServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StopServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopServiceResponseBody self = new StopServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopServiceResponseBody setData(StopServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopServiceResponseBodyData getData() {
        return this.data;
    }

    public StopServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopServiceResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ServiceDescription")
        public String serviceDescription;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        public static StopServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopServiceResponseBodyData self = new StopServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopServiceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StopServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StopServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public StopServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public StopServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
