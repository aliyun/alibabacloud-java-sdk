// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryTypeResponseBody extends TeaModel {
    /**
     * <p>An array that consists of image repository types.</p>
     */
    @NameInMap("RegistryTypeInfos")
    public java.util.List<ListPrivateRegistryTypeResponseBodyRegistryTypeInfos> registryTypeInfos;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
     */
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
        /**
         * <p>The number of image repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The name of the image repository type. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong>: Container Registry</li>
         * <li><strong>harbor</strong>: Harbor</li>
         * <li><strong>quay</strong>: Quay</li>
         * <li><strong>CI/CD</strong>: Jenkins</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
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
