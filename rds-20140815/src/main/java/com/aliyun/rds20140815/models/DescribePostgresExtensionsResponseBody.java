// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePostgresExtensionsResponseBody extends TeaModel {
    /**
     * <p>The list of extensions that are installed on the specified database.</p>
     */
    @NameInMap("InstalledExtensions")
    public java.util.List<DescribePostgresExtensionsResponseBodyInstalledExtensions> installedExtensions;

    /**
     * <p>The overview of the extension.</p>
     */
    @NameInMap("Overview")
    public java.util.Map<String, ?> overview;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of extensions that are not installed on the specified database.</p>
     */
    @NameInMap("UninstalledExtensions")
    public java.util.List<DescribePostgresExtensionsResponseBodyUninstalledExtensions> uninstalledExtensions;

    public static DescribePostgresExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostgresExtensionsResponseBody self = new DescribePostgresExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostgresExtensionsResponseBody setInstalledExtensions(java.util.List<DescribePostgresExtensionsResponseBodyInstalledExtensions> installedExtensions) {
        this.installedExtensions = installedExtensions;
        return this;
    }
    public java.util.List<DescribePostgresExtensionsResponseBodyInstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    public DescribePostgresExtensionsResponseBody setOverview(java.util.Map<String, ?> overview) {
        this.overview = overview;
        return this;
    }
    public java.util.Map<String, ?> getOverview() {
        return this.overview;
    }

    public DescribePostgresExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostgresExtensionsResponseBody setUninstalledExtensions(java.util.List<DescribePostgresExtensionsResponseBodyUninstalledExtensions> uninstalledExtensions) {
        this.uninstalledExtensions = uninstalledExtensions;
        return this;
    }
    public java.util.List<DescribePostgresExtensionsResponseBodyUninstalledExtensions> getUninstalledExtensions() {
        return this.uninstalledExtensions;
    }

    public static class DescribePostgresExtensionsResponseBodyInstalledExtensions extends TeaModel {
        /**
         * <p>The category of the extension.</p>
         * <br>
         * <p>*   **external_access**</p>
         * <p>*   **index_support**</p>
         * <p>*   **information_stat**</p>
         * <p>*   **geography_space**</p>
         * <p>*   **vector_engine**</p>
         * <p>*   **timing_engine**</p>
         * <p>*   **data_type**</p>
         * <p>*   **encrypt_secure**</p>
         * <p>*   **text_process**</p>
         * <p>*   **operation_maintenance**</p>
         * <p>*   **self_develop**</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The purpose of the extension.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default version of the extension.</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The current version of the extension.</p>
         */
        @NameInMap("InstalledVersion")
        public String installedVersion;

        /**
         * <p>The name of the extension.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user of the extension.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the extension.</p>
         * <br>
         * <p>*   **0**: The extension is displayed by default.</p>
         * <p>*   **1**: The extension is preferentially displayed.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The extensions on which the current extension depends when it is installed.</p>
         */
        @NameInMap("Requires")
        public String requires;

        public static DescribePostgresExtensionsResponseBodyInstalledExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribePostgresExtensionsResponseBodyInstalledExtensions self = new DescribePostgresExtensionsResponseBodyInstalledExtensions();
            return TeaModel.build(map, self);
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setInstalledVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            return this;
        }
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribePostgresExtensionsResponseBodyInstalledExtensions setRequires(String requires) {
            this.requires = requires;
            return this;
        }
        public String getRequires() {
            return this.requires;
        }

    }

    public static class DescribePostgresExtensionsResponseBodyUninstalledExtensions extends TeaModel {
        /**
         * <p>The category of the extension.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The purpose of the extension.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default version of the extension.</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The current version of the extension.</p>
         */
        @NameInMap("InstalledVersion")
        public String installedVersion;

        /**
         * <p>The name of the extension.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user of the extension.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the extension.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The extensions on which the current extension depends when it is installed.</p>
         */
        @NameInMap("Requires")
        public String requires;

        public static DescribePostgresExtensionsResponseBodyUninstalledExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribePostgresExtensionsResponseBodyUninstalledExtensions self = new DescribePostgresExtensionsResponseBodyUninstalledExtensions();
            return TeaModel.build(map, self);
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setInstalledVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            return this;
        }
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribePostgresExtensionsResponseBodyUninstalledExtensions setRequires(String requires) {
            this.requires = requires;
            return this;
        }
        public String getRequires() {
            return this.requires;
        }

    }

}
