// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListServiceAccountsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8349374D-0F22-5CAB-9DE3-8CCE8EFA71FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of service accounts.</p>
     */
    @NameInMap("ServiceAccounts")
    public java.util.List<ListServiceAccountsResponseBodyServiceAccounts> serviceAccounts;

    public static ListServiceAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceAccountsResponseBody self = new ListServiceAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceAccountsResponseBody setServiceAccounts(java.util.List<ListServiceAccountsResponseBodyServiceAccounts> serviceAccounts) {
        this.serviceAccounts = serviceAccounts;
        return this;
    }
    public java.util.List<ListServiceAccountsResponseBodyServiceAccounts> getServiceAccounts() {
        return this.serviceAccounts;
    }

    public static class ListServiceAccountsResponseBodyServiceAccounts extends TeaModel {
        /**
         * <p>The name of the service account.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-reviews</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the service account resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static ListServiceAccountsResponseBodyServiceAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListServiceAccountsResponseBodyServiceAccounts self = new ListServiceAccountsResponseBodyServiceAccounts();
            return TeaModel.build(map, self);
        }

        public ListServiceAccountsResponseBodyServiceAccounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceAccountsResponseBodyServiceAccounts setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
