// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceDirectory")
    public GetRegisteredServicesResponseBodyServiceDirectory serviceDirectory;

    @NameInMap("Services")
    public java.util.List<String> services;

    public static GetRegisteredServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesResponseBody self = new GetRegisteredServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegisteredServicesResponseBody setServiceDirectory(GetRegisteredServicesResponseBodyServiceDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
        return this;
    }
    public GetRegisteredServicesResponseBodyServiceDirectory getServiceDirectory() {
        return this.serviceDirectory;
    }

    public GetRegisteredServicesResponseBody setServices(java.util.List<String> services) {
        this.services = services;
        return this;
    }
    public java.util.List<String> getServices() {
        return this.services;
    }

    public static class GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Marker")
        public String marker;

        public static GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages self = new GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

    }

    public static class GetRegisteredServicesResponseBodyServiceDirectory extends TeaModel {
        @NameInMap("ServiceListStages")
        public java.util.List<GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages> serviceListStages;

        @NameInMap("Services")
        public java.util.Map<String, ServiceDirectoryServicesValue> services;

        public static GetRegisteredServicesResponseBodyServiceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServicesResponseBodyServiceDirectory self = new GetRegisteredServicesResponseBodyServiceDirectory();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServicesResponseBodyServiceDirectory setServiceListStages(java.util.List<GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages> serviceListStages) {
            this.serviceListStages = serviceListStages;
            return this;
        }
        public java.util.List<GetRegisteredServicesResponseBodyServiceDirectoryServiceListStages> getServiceListStages() {
            return this.serviceListStages;
        }

        public GetRegisteredServicesResponseBodyServiceDirectory setServices(java.util.Map<String, ServiceDirectoryServicesValue> services) {
            this.services = services;
            return this;
        }
        public java.util.Map<String, ServiceDirectoryServicesValue> getServices() {
            return this.services;
        }

    }

}
