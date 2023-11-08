// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListServiceAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Name")
        public String name;

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
