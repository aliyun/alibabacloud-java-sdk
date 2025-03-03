// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The trusted services that are enabled.</p>
     */
    @NameInMap("EnabledServicePrincipals")
    public ListTrustedServiceStatusResponseBodyEnabledServicePrincipals enabledServicePrincipals;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The time when the trusted service was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-18T15:32:10.473Z</p>
         */
        @NameInMap("EnableTime")
        public String enableTime;

        /**
         * <p>The identification of the trusted service.</p>
         * 
         * <strong>example:</strong>
         * <p>config.aliyuncs.com</p>
         */
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
