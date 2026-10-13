// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncPluginsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListContextDatabaseSyncPluginsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncPluginsResponseBody self = new ListContextDatabaseSyncPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncPluginsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncPluginsResponseBody setData(java.util.List<ListContextDatabaseSyncPluginsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListContextDatabaseSyncPluginsResponseBodyData> getData() {
        return this.data;
    }

    public ListContextDatabaseSyncPluginsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncPluginsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncPluginsResponseBodyData extends TeaModel {
        /**
         * <p>The authorization method.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kind&quot;:&quot;oauth&quot;,&quot;phases&quot;:[&quot;discovery&quot;]}</p>
         */
        @NameInMap("Authorization")
        public String authorization;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team DingTalk data source</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The icon.</p>
         * 
         * <strong>example:</strong>
         * <p>/icons/dingtalk.svg</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The plugin type. This operation returns only plugins of the source type.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The datasource config template (JSON character string, structure varies depending on the plugin).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;hint&quot;:&quot;Select import scope&quot;,&quot;fields&quot;:[{&quot;key&quot;:&quot;folderIds&quot;,&quot;type&quot;:&quot;string-list&quot;,&quot;label&quot;:&quot;Folder / document scope&quot;}]}</p>
         */
        @NameInMap("SourceConfig")
        public String sourceConfig;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListContextDatabaseSyncPluginsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncPluginsResponseBodyData self = new ListContextDatabaseSyncPluginsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public ListContextDatabaseSyncPluginsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
