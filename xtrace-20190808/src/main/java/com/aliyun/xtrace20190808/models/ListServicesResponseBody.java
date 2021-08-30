// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public ListServicesResponseBodyServices services;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setServices(ListServicesResponseBodyServices services) {
        this.services = services;
        return this;
    }
    public ListServicesResponseBodyServices getServices() {
        return this.services;
    }

    public static class ListServicesResponseBodyServicesService extends TeaModel {
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("RegionId")
        public String regionId;

        public static ListServicesResponseBodyServicesService build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesService self = new ListServicesResponseBodyServicesService();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServicesService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServicesResponseBodyServicesService setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListServicesResponseBodyServicesService setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListServicesResponseBodyServices extends TeaModel {
        @NameInMap("Service")
        public java.util.List<ListServicesResponseBodyServicesService> service;

        public static ListServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServices self = new ListServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServices setService(java.util.List<ListServicesResponseBodyServicesService> service) {
            this.service = service;
            return this;
        }
        public java.util.List<ListServicesResponseBodyServicesService> getService() {
            return this.service;
        }

    }

}
