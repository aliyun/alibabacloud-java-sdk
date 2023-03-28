// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If **NextToken** is returned, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of entries returned.</p>
     */
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
        /**
         * <p>The default access policy.</p>
         */
        @NameInMap("DefaultPolicyDocument")
        public String defaultPolicyDocument;

        /**
         * <p>The domain name of the cloud service to which the endpoint service belongs.</p>
         */
        @NameInMap("ServiceDomain")
        public String serviceDomain;

        /**
         * <p>The ID of the endpoint service.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the endpoint service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Indicate whether the endpoint service supports the access policy. Valid values:</p>
         * <br>
         * <p>*   **false**: no</p>
         * <p>*   **true**: yes</p>
         */
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
