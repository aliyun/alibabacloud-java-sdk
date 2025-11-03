// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryExtraResponseBody extends TeaModel {
    /**
     * <p>The additional configuration information about the image repository.</p>
     */
    @NameInMap("ImageRegistryExtraInfos")
    public java.util.List<ListImageRegistryExtraResponseBodyImageRegistryExtraInfos> imageRegistryExtraInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImageRegistryExtraResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryExtraResponseBody self = new ListImageRegistryExtraResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryExtraResponseBody setImageRegistryExtraInfos(java.util.List<ListImageRegistryExtraResponseBodyImageRegistryExtraInfos> imageRegistryExtraInfos) {
        this.imageRegistryExtraInfos = imageRegistryExtraInfos;
        return this;
    }
    public java.util.List<ListImageRegistryExtraResponseBodyImageRegistryExtraInfos> getImageRegistryExtraInfos() {
        return this.imageRegistryExtraInfos;
    }

    public ListImageRegistryExtraResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageRegistryExtraResponseBodyImageRegistryExtraInfos extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The authorization token.</p>
         * 
         * <strong>example:</strong>
         * <p>64ad8ddf-6a4c-46b5-8dea-b105a06bd534</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>113441</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The namespace of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>public-goods</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>25363</p>
         */
        @NameInMap("RegistryId")
        public Long registryId;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong>: Container Registry.</li>
         * <li><strong>harbor</strong>: Harbor.</li>
         * <li><strong>quay</strong>: Quay.</li>
         * <li><strong>CI/CD</strong>: Jenkins.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>harbor</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        public static ListImageRegistryExtraResponseBodyImageRegistryExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            ListImageRegistryExtraResponseBodyImageRegistryExtraInfos self = new ListImageRegistryExtraResponseBodyImageRegistryExtraInfos();
            return TeaModel.build(map, self);
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setRegistryId(Long registryId) {
            this.registryId = registryId;
            return this;
        }
        public Long getRegistryId() {
            return this.registryId;
        }

        public ListImageRegistryExtraResponseBodyImageRegistryExtraInfos setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

    }

}
