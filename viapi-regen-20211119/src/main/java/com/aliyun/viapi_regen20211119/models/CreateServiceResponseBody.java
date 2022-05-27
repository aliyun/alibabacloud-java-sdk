// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setData(CreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateServiceResponseBodyData extends TeaModel {
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

        public static CreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyData self = new CreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public CreateServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
