// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawPluginsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>An array of diagnostic objects.</p>
     */
    @NameInMap("Diagnostics")
    public java.util.List<DescribePolarClawPluginsResponseBodyDiagnostics> diagnostics;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>An array of plugin objects.</p>
     */
    @NameInMap("Plugins")
    public java.util.List<DescribePolarClawPluginsResponseBodyPlugins> plugins;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarClawPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawPluginsResponseBody self = new DescribePolarClawPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawPluginsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawPluginsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawPluginsResponseBody setDiagnostics(java.util.List<DescribePolarClawPluginsResponseBodyDiagnostics> diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
    public java.util.List<DescribePolarClawPluginsResponseBodyDiagnostics> getDiagnostics() {
        return this.diagnostics;
    }

    public DescribePolarClawPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawPluginsResponseBody setPlugins(java.util.List<DescribePolarClawPluginsResponseBodyPlugins> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.List<DescribePolarClawPluginsResponseBodyPlugins> getPlugins() {
        return this.plugins;
    }

    public DescribePolarClawPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarClawPluginsResponseBodyDiagnostics extends TeaModel {
        /**
         * <p>The severity level. Valid values: <code>error</code> and <code>warn</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The detailed diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>loaded without install/load-path provenance; treat as untracked local code</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the associated plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw-lark</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The source file path associated with the diagnostic.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/extensions/openclaw-lark/index.js</p>
         */
        @NameInMap("Source")
        public String source;

        public static DescribePolarClawPluginsResponseBodyDiagnostics build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawPluginsResponseBodyDiagnostics self = new DescribePolarClawPluginsResponseBodyDiagnostics();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawPluginsResponseBodyDiagnostics setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribePolarClawPluginsResponseBodyDiagnostics setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePolarClawPluginsResponseBodyDiagnostics setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public DescribePolarClawPluginsResponseBodyDiagnostics setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class DescribePolarClawPluginsResponseBodyPlugins extends TeaModel {
        /**
         * <p>A list of channel IDs, which can be empty.</p>
         */
        @NameInMap("ChannelIds")
        public java.util.List<String> channelIds;

        /**
         * <p>The description of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>Lark/Feishu channel plugin with im/doc/wiki/drive/task/calendar tools</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message, or <code>null</code> if no error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The format of the plugin, which can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw-lark</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>Feishu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The origin of the plugin. Valid values: <code>bundled</code>, <code>global</code>, and <code>user-install</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>A list of provider IDs, which can be empty.</p>
         */
        @NameInMap("ProviderIds")
        public java.util.List<String> providerIds;

        /**
         * <p>The file path to the plugin\&quot;s entry point.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/extensions/openclaw-lark/index.js</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the plugin. Valid values: <code>loaded</code>, <code>disabled</code>, and <code>error</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>loaded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>2026.4.7</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribePolarClawPluginsResponseBodyPlugins build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawPluginsResponseBodyPlugins self = new DescribePolarClawPluginsResponseBodyPlugins();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawPluginsResponseBodyPlugins setChannelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            return this;
        }
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setProviderIds(java.util.List<String> providerIds) {
            this.providerIds = providerIds;
            return this;
        }
        public java.util.List<String> getProviderIds() {
            return this.providerIds;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePolarClawPluginsResponseBodyPlugins setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
