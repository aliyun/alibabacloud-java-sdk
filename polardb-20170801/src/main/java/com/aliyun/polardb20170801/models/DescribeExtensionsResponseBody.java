// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeExtensionsResponseBody extends TeaModel {
    /**
     * <p>The information about installed plugins in the specified database.</p>
     */
    @NameInMap("InstalledExtensions")
    public java.util.List<DescribeExtensionsResponseBodyInstalledExtensions> installedExtensions;

    /**
     * <p>The plugin overview information.</p>
     * 
     * <strong>example:</strong>
     * <p>Test ticket creation, please ignore</p>
     */
    @NameInMap("Overview")
    public String overview;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>309073D4-9C99-511C-AF84-0C67A6F52E67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about uninstalled plugins in the specified database.</p>
     */
    @NameInMap("UninstalledExtensions")
    public java.util.List<DescribeExtensionsResponseBodyUninstalledExtensions> uninstalledExtensions;

    public static DescribeExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionsResponseBody self = new DescribeExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionsResponseBody setInstalledExtensions(java.util.List<DescribeExtensionsResponseBodyInstalledExtensions> installedExtensions) {
        this.installedExtensions = installedExtensions;
        return this;
    }
    public java.util.List<DescribeExtensionsResponseBodyInstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    public DescribeExtensionsResponseBody setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public DescribeExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExtensionsResponseBody setUninstalledExtensions(java.util.List<DescribeExtensionsResponseBodyUninstalledExtensions> uninstalledExtensions) {
        this.uninstalledExtensions = uninstalledExtensions;
        return this;
    }
    public java.util.List<DescribeExtensionsResponseBodyUninstalledExtensions> getUninstalledExtensions() {
        return this.uninstalledExtensions;
    }

    public static class DescribeExtensionsResponseBodyInstalledExtensions extends TeaModel {
        /**
         * <p>The plugin category.</p>
         * 
         * <strong>example:</strong>
         * <p>geography_space, self_develop</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The plugin description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default version of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>7.7</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The currently installed version of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>7.7</p>
         */
        @NameInMap("InstalledVersion")
        public String installedVersion;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>alton</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The plugins that this plugin depends on during installation.</p>
         * 
         * <strong>example:</strong>
         * <p>ganos_networking</p>
         */
        @NameInMap("Requires")
        public String requires;

        /**
         * <p>Specifies whether to restart the application. Valid values: true: Restart. false: Do not restart.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Restart")
        public String restart;

        public static DescribeExtensionsResponseBodyInstalledExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeExtensionsResponseBodyInstalledExtensions self = new DescribeExtensionsResponseBodyInstalledExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setInstalledVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            return this;
        }
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setRequires(String requires) {
            this.requires = requires;
            return this;
        }
        public String getRequires() {
            return this.requires;
        }

        public DescribeExtensionsResponseBodyInstalledExtensions setRestart(String restart) {
            this.restart = restart;
            return this;
        }
        public String getRestart() {
            return this.restart;
        }

    }

    public static class DescribeExtensionsResponseBodyUninstalledExtensions extends TeaModel {
        /**
         * <p>The plugin category.</p>
         * 
         * <strong>example:</strong>
         * <p>geography_space, self_develop</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The purpose of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default version of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>7.7</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The currently installed version of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>7.7</p>
         */
        @NameInMap("InstalledVersion")
        public String installedVersion;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>alton</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The plugins that this plugin depends on during installation.</p>
         * 
         * <strong>example:</strong>
         * <p>ganos_networking</p>
         */
        @NameInMap("Requires")
        public String requires;

        /**
         * <p>Specifies whether to restart the application. Valid values: true: Restart. false: Do not restart.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Restart")
        public String restart;

        public static DescribeExtensionsResponseBodyUninstalledExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeExtensionsResponseBodyUninstalledExtensions self = new DescribeExtensionsResponseBodyUninstalledExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setInstalledVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            return this;
        }
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setRequires(String requires) {
            this.requires = requires;
            return this;
        }
        public String getRequires() {
            return this.requires;
        }

        public DescribeExtensionsResponseBodyUninstalledExtensions setRestart(String restart) {
            this.restart = restart;
            return this;
        }
        public String getRestart() {
            return this.restart;
        }

    }

}
