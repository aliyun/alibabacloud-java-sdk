// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableVersionResponseBody extends TeaModel {
    /**
     * <p>The latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.2</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of versions.</p>
     */
    @NameInMap("Versions")
    public java.util.List<DescribeApplicationAvailableVersionResponseBodyVersions> versions;

    public static DescribeApplicationAvailableVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableVersionResponseBody self = new DescribeApplicationAvailableVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableVersionResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public DescribeApplicationAvailableVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationAvailableVersionResponseBody setVersions(java.util.List<DescribeApplicationAvailableVersionResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableVersionResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class DescribeApplicationAvailableVersionResponseBodyVersions extends TeaModel {
        /**
         * <p>The release date.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T00:00:00Z</p>
         */
        @NameInMap("ReleaseDate")
        public String releaseDate;

        /**
         * <p>The release notes of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The release type.</p>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static DescribeApplicationAvailableVersionResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableVersionResponseBodyVersions self = new DescribeApplicationAvailableVersionResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableVersionResponseBodyVersions setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public DescribeApplicationAvailableVersionResponseBodyVersions setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeApplicationAvailableVersionResponseBodyVersions setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeApplicationAvailableVersionResponseBodyVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeApplicationAvailableVersionResponseBodyVersions setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

}
