// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setData(GetServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceResponseBodyData getData() {
        return this.data;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceResponseBodyData extends TeaModel {
        @NameInMap("CurlExample")
        public String curlExample;

        @NameInMap("Errorcodes")
        public String errorcodes;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InputExample")
        public String inputExample;

        @NameInMap("InputParams")
        public String inputParams;

        @NameInMap("OutputExample")
        public String outputExample;

        @NameInMap("OutputParams")
        public String outputParams;

        @NameInMap("ServiceDescription")
        public String serviceDescription;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        public static GetServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyData self = new GetServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyData setCurlExample(String curlExample) {
            this.curlExample = curlExample;
            return this;
        }
        public String getCurlExample() {
            return this.curlExample;
        }

        public GetServiceResponseBodyData setErrorcodes(String errorcodes) {
            this.errorcodes = errorcodes;
            return this;
        }
        public String getErrorcodes() {
            return this.errorcodes;
        }

        public GetServiceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceResponseBodyData setInputExample(String inputExample) {
            this.inputExample = inputExample;
            return this;
        }
        public String getInputExample() {
            return this.inputExample;
        }

        public GetServiceResponseBodyData setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public GetServiceResponseBodyData setOutputExample(String outputExample) {
            this.outputExample = outputExample;
            return this;
        }
        public String getOutputExample() {
            return this.outputExample;
        }

        public GetServiceResponseBodyData setOutputParams(String outputParams) {
            this.outputParams = outputParams;
            return this;
        }
        public String getOutputParams() {
            return this.outputParams;
        }

        public GetServiceResponseBodyData setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public GetServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
