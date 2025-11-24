// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMetadataResponseBody extends TeaModel {
    /**
     * <p>The ASM metadata, including the basic information about ASM.</p>
     */
    @NameInMap("MetaData")
    public DescribeMetadataResponseBodyMetaData metaData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F93DDAD7-6E04-5AC3-86F4-852708******</p>
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

    public static class DescribeMetadataResponseBodyMetaDataPlaygroundScene extends TeaModel {
        /**
         * <p>The observability scenarios.</p>
         */
        @NameInMap("observability")
        public java.util.List<String> observability;

        /**
         * <p>Other scenarios.</p>
         */
        @NameInMap("other")
        public java.util.List<String> other;

        /**
         * <p>The security scenarios.</p>
         */
        @NameInMap("security")
        public java.util.List<String> security;

        /**
         * <p>The traffic management scenarios.</p>
         */
        @NameInMap("trafficManagement")
        public java.util.List<String> trafficManagement;

        public static DescribeMetadataResponseBodyMetaDataPlaygroundScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetadataResponseBodyMetaDataPlaygroundScene self = new DescribeMetadataResponseBodyMetaDataPlaygroundScene();
            return TeaModel.build(map, self);
        }

        public DescribeMetadataResponseBodyMetaDataPlaygroundScene setObservability(java.util.List<String> observability) {
            this.observability = observability;
            return this;
        }
        public java.util.List<String> getObservability() {
            return this.observability;
        }

        public DescribeMetadataResponseBodyMetaDataPlaygroundScene setOther(java.util.List<String> other) {
            this.other = other;
            return this;
        }
        public java.util.List<String> getOther() {
            return this.other;
        }

        public DescribeMetadataResponseBodyMetaDataPlaygroundScene setSecurity(java.util.List<String> security) {
            this.security = security;
            return this;
        }
        public java.util.List<String> getSecurity() {
            return this.security;
        }

        public DescribeMetadataResponseBodyMetaDataPlaygroundScene setTrafficManagement(java.util.List<String> trafficManagement) {
            this.trafficManagement = trafficManagement;
            return this;
        }
        public java.util.List<String> getTrafficManagement() {
            return this.trafficManagement;
        }

    }

    public static class DescribeMetadataResponseBodyMetaDataProEdition extends TeaModel {
        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.14.3.87-g96cf7305-aliyun</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The CRDs of all ASM versions.</p>
         */
        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        /**
         * <p>The Istio versions corresponding to the ASM versions.</p>
         */
        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

        /**
         * <p>The list of ASM versions.</p>
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
         * <p>The Kubernetes versions compatible with ASM.</p>
         */
        @NameInMap("CompatibilityInfoList")
        public java.util.List<java.util.Map<String, ?>> compatibilityInfoList;

        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.14.3.87-g96cf7305-aliyun</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The data of the ASM Playground.</p>
         */
        @NameInMap("PlaygroundScene")
        public DescribeMetadataResponseBodyMetaDataPlaygroundScene playgroundScene;

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
         * <p>The custom resource definitions (CRDs) of all ASM versions.</p>
         */
        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        /**
         * <p>The Istio versions corresponding to the ASM versions.</p>
         */
        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

        /**
         * <p>The list of ASM versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeMetadataResponseBodyMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetadataResponseBodyMetaData self = new DescribeMetadataResponseBodyMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeMetadataResponseBodyMetaData setCompatibilityInfoList(java.util.List<java.util.Map<String, ?>> compatibilityInfoList) {
            this.compatibilityInfoList = compatibilityInfoList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getCompatibilityInfoList() {
            return this.compatibilityInfoList;
        }

        public DescribeMetadataResponseBodyMetaData setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeMetadataResponseBodyMetaData setPlaygroundScene(DescribeMetadataResponseBodyMetaDataPlaygroundScene playgroundScene) {
            this.playgroundScene = playgroundScene;
            return this;
        }
        public DescribeMetadataResponseBodyMetaDataPlaygroundScene getPlaygroundScene() {
            return this.playgroundScene;
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
