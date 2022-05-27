// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponseBody self = new UpdateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponseBody setData(UpdateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateServiceResponseBodyData getData() {
        return this.data;
    }

    public UpdateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateServiceResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ServiceDescription")
        public String serviceDescription;

        @NameInMap("ServiceName")
        public String serviceName;

        public static UpdateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceResponseBodyData self = new UpdateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateServiceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public UpdateServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
