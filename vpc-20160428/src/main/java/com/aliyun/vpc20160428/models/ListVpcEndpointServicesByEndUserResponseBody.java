// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services;

    public static ListVpcEndpointServicesByEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserResponseBody self = new ListVpcEndpointServicesByEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setServices(java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListVpcEndpointServicesByEndUserResponseBodyServices extends TeaModel {
        @NameInMap("DefaultPolicyDocument")
        public String defaultPolicyDocument;

        @NameInMap("ServiceDomain")
        public String serviceDomain;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SupportPolicy")
        public Boolean supportPolicy;

        public static ListVpcEndpointServicesByEndUserResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserResponseBodyServices self = new ListVpcEndpointServicesByEndUserResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setDefaultPolicyDocument(String defaultPolicyDocument) {
            this.defaultPolicyDocument = defaultPolicyDocument;
            return this;
        }
        public String getDefaultPolicyDocument() {
            return this.defaultPolicyDocument;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }
        public String getServiceDomain() {
            return this.serviceDomain;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setSupportPolicy(Boolean supportPolicy) {
            this.supportPolicy = supportPolicy;
            return this;
        }
        public Boolean getSupportPolicy() {
            return this.supportPolicy;
        }

    }

}
