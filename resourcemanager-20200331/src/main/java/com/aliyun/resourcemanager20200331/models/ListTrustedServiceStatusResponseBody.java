// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("EnabledServicePrincipals")
    public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals enabledServicePrincipals;

    public static ListTrustedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedServiceStatusResponseBody self = new ListTrustedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrustedServiceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrustedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrustedServiceStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrustedServiceStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrustedServiceStatusResponseBody setEnabledServicePrincipals(ListTrustedServiceStatusResponseBodyEnabledServicePrincipals enabledServicePrincipals) {
        this.enabledServicePrincipals = enabledServicePrincipals;
        return this;
    }
    public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals getEnabledServicePrincipals() {
        return this.enabledServicePrincipals;
    }

    public static class ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal extends TeaModel {
        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

        @NameInMap("EnableTime")
        public String enableTime;

        public static ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal self = new ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal();
            return TeaModel.build(map, self);
        }

        public ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        public ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal setEnableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public String getEnableTime() {
            return this.enableTime;
        }

    }

    public static class ListTrustedServiceStatusResponseBodyEnabledServicePrincipals extends TeaModel {
        @NameInMap("EnabledServicePrincipal")
        public java.util.List<ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal> enabledServicePrincipal;

        public static ListTrustedServiceStatusResponseBodyEnabledServicePrincipals build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedServiceStatusResponseBodyEnabledServicePrincipals self = new ListTrustedServiceStatusResponseBodyEnabledServicePrincipals();
            return TeaModel.build(map, self);
        }

        public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals setEnabledServicePrincipal(java.util.List<ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal> enabledServicePrincipal) {
            this.enabledServicePrincipal = enabledServicePrincipal;
            return this;
        }
        public java.util.List<ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal> getEnabledServicePrincipal() {
            return this.enabledServicePrincipal;
        }

    }

}
