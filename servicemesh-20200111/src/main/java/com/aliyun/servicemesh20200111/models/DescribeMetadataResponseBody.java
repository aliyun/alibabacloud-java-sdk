// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMetadataResponseBody extends TeaModel {
    /**
     * <p>The metadata of ASM, which contains basic information about ASM.</p>
     */
    @NameInMap("MetaData")
    public DescribeMetadataResponseBodyMetaData metaData;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetadataResponseBody self = new DescribeMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetadataResponseBody setMetaData(DescribeMetadataResponseBodyMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public DescribeMetadataResponseBodyMetaData getMetaData() {
        return this.metaData;
    }

    public DescribeMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetadataResponseBodyMetaDataProEdition extends TeaModel {
        /**
         * <p>The current version.</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The CRDs of the versions.</p>
         */
        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        /**
         * <p>The ASM version and the corresponding Istio version.</p>
         */
        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

        /**
         * <p>The supported versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeMetadataResponseBodyMetaDataProEdition build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetadataResponseBodyMetaDataProEdition self = new DescribeMetadataResponseBodyMetaDataProEdition();
            return TeaModel.build(map, self);
        }

        public DescribeMetadataResponseBodyMetaDataProEdition setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeMetadataResponseBodyMetaDataProEdition setVersionCrds(java.util.List<java.util.Map<String, ?>> versionCrds) {
            this.versionCrds = versionCrds;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        public DescribeMetadataResponseBodyMetaDataProEdition setVersionRegistry(java.util.List<java.util.Map<String, ?>> versionRegistry) {
            this.versionRegistry = versionRegistry;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        public DescribeMetadataResponseBodyMetaDataProEdition setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

    public static class DescribeMetadataResponseBodyMetaData extends TeaModel {
        /**
         * <p>The current version.</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The version information about ASM of a commercial edition.</p>
         */
        @NameInMap("ProEdition")
        public DescribeMetadataResponseBodyMetaDataProEdition proEdition;

        /**
         * <p>The regions where ASM instances can be created.</p>
         */
        @NameInMap("Regions")
        public java.util.List<String> regions;

        /**
         * <p>The Custom Resource Definitions (CRDs) of the versions.</p>
         */
        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        /**
         * <p>The ASM version and the corresponding Istio version.</p>
         */
        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

        /**
         * <p>The supported versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeMetadataResponseBodyMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetadataResponseBodyMetaData self = new DescribeMetadataResponseBodyMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeMetadataResponseBodyMetaData setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeMetadataResponseBodyMetaData setProEdition(DescribeMetadataResponseBodyMetaDataProEdition proEdition) {
            this.proEdition = proEdition;
            return this;
        }
        public DescribeMetadataResponseBodyMetaDataProEdition getProEdition() {
            return this.proEdition;
        }

        public DescribeMetadataResponseBodyMetaData setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public DescribeMetadataResponseBodyMetaData setVersionCrds(java.util.List<java.util.Map<String, ?>> versionCrds) {
            this.versionCrds = versionCrds;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        public DescribeMetadataResponseBodyMetaData setVersionRegistry(java.util.List<java.util.Map<String, ?>> versionRegistry) {
            this.versionRegistry = versionRegistry;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        public DescribeMetadataResponseBodyMetaData setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
