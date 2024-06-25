// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1FC47DED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The applications.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXqn3ly@741623b4e915df8</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>a3</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static ListServicesResponseBodyServicesService build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServicesService self = new ListServicesResponseBodyServicesService();
            return TeaModel.build(map, self);
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

        public ListServicesResponseBodyServicesService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
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
