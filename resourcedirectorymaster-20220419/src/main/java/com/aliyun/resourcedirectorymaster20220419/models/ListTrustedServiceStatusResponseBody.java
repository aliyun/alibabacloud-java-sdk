// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusResponseBody extends TeaModel {
    @NameInMap("EnabledServicePrincipals")
    public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals enabledServicePrincipals;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTrustedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedServiceStatusResponseBody self = new ListTrustedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrustedServiceStatusResponseBody setEnabledServicePrincipals(ListTrustedServiceStatusResponseBodyEnabledServicePrincipals enabledServicePrincipals) {
        this.enabledServicePrincipals = enabledServicePrincipals;
        return this;
    }
    public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals getEnabledServicePrincipals() {
        return this.enabledServicePrincipals;
    }

    public ListTrustedServiceStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrustedServiceStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrustedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrustedServiceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal extends TeaModel {
        @NameInMap("EnableTime")
        public String enableTime;

        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

        public static ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal self = new ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal();
            return TeaModel.build(map, self);
        }

        public ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal setEnableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public String getEnableTime() {
            return this.enableTime;
        }

        public ListTrustedServiceStatusResponseBodyEnabledServicePrincipalsEnabledServicePrincipal setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public String getServicePrincipal() {
            return this.servicePrincipal;
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
