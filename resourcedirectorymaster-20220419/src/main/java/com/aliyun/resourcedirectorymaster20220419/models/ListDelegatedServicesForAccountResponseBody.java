// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountResponseBody extends TeaModel {
    /**
     * <p>The information about the trusted services.</p>
     * <blockquote>
     * <p>If the value of this parameter is empty, the member is not specified as a delegated administrator account.</p>
     * </blockquote>
     */
    @NameInMap("DelegatedServices")
    public ListDelegatedServicesForAccountResponseBodyDelegatedServices delegatedServices;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D9C03B94-9396-4794-A74B-13DC437556A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDelegatedServicesForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedServicesForAccountResponseBody self = new ListDelegatedServicesForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDelegatedServicesForAccountResponseBody setDelegatedServices(ListDelegatedServicesForAccountResponseBodyDelegatedServices delegatedServices) {
        this.delegatedServices = delegatedServices;
        return this;
    }
    public ListDelegatedServicesForAccountResponseBodyDelegatedServices getDelegatedServices() {
        return this.delegatedServices;
    }

    public ListDelegatedServicesForAccountResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDelegatedServicesForAccountResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDelegatedServicesForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService extends TeaModel {
        /**
         * <p>The time when the member was specified as a delegated administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>1616652684164</p>
         */
        @NameInMap("DelegationEnabledTime")
        public String delegationEnabledTime;

        /**
         * <p>The identifier of the trusted service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfw.aliyuncs.com</p>
         */
        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

        /**
         * <p>The status of the trusted service. Valid values:</p>
         * <ul>
         * <li>ENABLED: enabled</li>
         * <li>DISABLED: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService build(java.util.Map<String, ?> map) throws Exception {
            ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService self = new ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService();
            return TeaModel.build(map, self);
        }

        public ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService setDelegationEnabledTime(String delegationEnabledTime) {
            this.delegationEnabledTime = delegationEnabledTime;
            return this;
        }
        public String getDelegationEnabledTime() {
            return this.delegationEnabledTime;
        }

        public ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        public ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDelegatedServicesForAccountResponseBodyDelegatedServices extends TeaModel {
        @NameInMap("DelegatedService")
        public java.util.List<ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService> delegatedService;

        public static ListDelegatedServicesForAccountResponseBodyDelegatedServices build(java.util.Map<String, ?> map) throws Exception {
            ListDelegatedServicesForAccountResponseBodyDelegatedServices self = new ListDelegatedServicesForAccountResponseBodyDelegatedServices();
            return TeaModel.build(map, self);
        }

        public ListDelegatedServicesForAccountResponseBodyDelegatedServices setDelegatedService(java.util.List<ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService> delegatedService) {
            this.delegatedService = delegatedService;
            return this;
        }
        public java.util.List<ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService> getDelegatedService() {
            return this.delegatedService;
        }

    }

}
