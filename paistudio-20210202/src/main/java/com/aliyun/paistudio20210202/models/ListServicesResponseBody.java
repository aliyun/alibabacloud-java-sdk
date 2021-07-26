// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Services")
    public java.util.List<ListServicesResponseBodyServices> services;

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

    public ListServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListServicesResponseBody setServices(java.util.List<ListServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListServicesResponseBodyServices extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("ServiceId")
        public String serviceId;

        public static ListServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServices self = new ListServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServices setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}
