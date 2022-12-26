// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryTypeResponseBody extends TeaModel {
    @NameInMap("RegistryTypeInfos")
    public java.util.List<ListPrivateRegistryTypeResponseBodyRegistryTypeInfos> registryTypeInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateRegistryTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryTypeResponseBody self = new ListPrivateRegistryTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryTypeResponseBody setRegistryTypeInfos(java.util.List<ListPrivateRegistryTypeResponseBodyRegistryTypeInfos> registryTypeInfos) {
        this.registryTypeInfos = registryTypeInfos;
        return this;
    }
    public java.util.List<ListPrivateRegistryTypeResponseBodyRegistryTypeInfos> getRegistryTypeInfos() {
        return this.registryTypeInfos;
    }

    public ListPrivateRegistryTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateRegistryTypeResponseBodyRegistryTypeInfos extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("RegistryType")
        public String registryType;

        public static ListPrivateRegistryTypeResponseBodyRegistryTypeInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateRegistryTypeResponseBodyRegistryTypeInfos self = new ListPrivateRegistryTypeResponseBodyRegistryTypeInfos();
            return TeaModel.build(map, self);
        }

        public ListPrivateRegistryTypeResponseBodyRegistryTypeInfos setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListPrivateRegistryTypeResponseBodyRegistryTypeInfos setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

    }

}
