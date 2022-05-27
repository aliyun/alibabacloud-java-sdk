// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public StartServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StartServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartServiceResponseBody self = new StartServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartServiceResponseBody setData(StartServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartServiceResponseBodyData getData() {
        return this.data;
    }

    public StartServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartServiceResponseBodyData extends TeaModel {
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

        public static StartServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartServiceResponseBodyData self = new StartServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartServiceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StartServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StartServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public StartServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public StartServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
