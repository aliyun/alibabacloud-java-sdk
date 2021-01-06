// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("EnabledServicePrincipals")
    @Validation(required = true)
    public ListTrustedServiceStatusResponseEnabledServicePrincipals enabledServicePrincipals;

    public static ListTrustedServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedServiceStatusResponse self = new ListTrustedServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListTrustedServiceStatusResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrustedServiceStatusResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrustedServiceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrustedServiceStatusResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrustedServiceStatusResponse setEnabledServicePrincipals(ListTrustedServiceStatusResponseEnabledServicePrincipals enabledServicePrincipals) {
        this.enabledServicePrincipals = enabledServicePrincipals;
        return this;
    }
    public ListTrustedServiceStatusResponseEnabledServicePrincipals getEnabledServicePrincipals() {
        return this.enabledServicePrincipals;
    }

    public static class ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal extends TeaModel {
        @NameInMap("ServicePrincipal")
        @Validation(required = true)
        public String servicePrincipal;

        @NameInMap("EnableTime")
        @Validation(required = true)
        public String enableTime;

        public static ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal self = new ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal();
            return TeaModel.build(map, self);
        }

        public ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        public ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal setEnableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public String getEnableTime() {
            return this.enableTime;
        }

    }

    public static class ListTrustedServiceStatusResponseEnabledServicePrincipals extends TeaModel {
        @NameInMap("EnabledServicePrincipal")
        @Validation(required = true)
        public java.util.List<ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal> enabledServicePrincipal;

        public static ListTrustedServiceStatusResponseEnabledServicePrincipals build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedServiceStatusResponseEnabledServicePrincipals self = new ListTrustedServiceStatusResponseEnabledServicePrincipals();
            return TeaModel.build(map, self);
        }

        public ListTrustedServiceStatusResponseEnabledServicePrincipals setEnabledServicePrincipal(java.util.List<ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal> enabledServicePrincipal) {
            this.enabledServicePrincipal = enabledServicePrincipal;
            return this;
        }
        public java.util.List<ListTrustedServiceStatusResponseEnabledServicePrincipalsEnabledServicePrincipal> getEnabledServicePrincipal() {
            return this.enabledServicePrincipal;
        }

    }

}
