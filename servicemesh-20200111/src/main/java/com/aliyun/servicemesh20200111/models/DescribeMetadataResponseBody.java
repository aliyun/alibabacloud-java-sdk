// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMetadataResponseBody extends TeaModel {
    @NameInMap("MetaData")
    public DescribeMetadataResponseBodyMetaData metaData;

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
        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

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
        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("ProEdition")
        public DescribeMetadataResponseBodyMetaDataProEdition proEdition;

        @NameInMap("Regions")
        public java.util.List<String> regions;

        @NameInMap("VersionCrds")
        public java.util.List<java.util.Map<String, ?>> versionCrds;

        @NameInMap("VersionRegistry")
        public java.util.List<java.util.Map<String, ?>> versionRegistry;

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
