// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DelegatedServices")
    public ListDelegatedServicesForAccountResponseBodyDelegatedServices delegatedServices;

    public static ListDelegatedServicesForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedServicesForAccountResponseBody self = new ListDelegatedServicesForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDelegatedServicesForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDelegatedServicesForAccountResponseBody setDelegatedServices(ListDelegatedServicesForAccountResponseBodyDelegatedServices delegatedServices) {
        this.delegatedServices = delegatedServices;
        return this;
    }
    public ListDelegatedServicesForAccountResponseBodyDelegatedServices getDelegatedServices() {
        return this.delegatedServices;
    }

    public static class ListDelegatedServicesForAccountResponseBodyDelegatedServicesDelegatedService extends TeaModel {
        @NameInMap("DelegationEnabledTime")
        public String delegationEnabledTime;

        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

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
