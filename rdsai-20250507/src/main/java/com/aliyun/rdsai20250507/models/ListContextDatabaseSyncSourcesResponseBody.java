// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncSourcesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListContextDatabaseSyncSourcesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncSourcesResponseBody self = new ListContextDatabaseSyncSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncSourcesResponseBody setData(ListContextDatabaseSyncSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncSourcesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncSourcesResponseBodyDataSources extends TeaModel {
        /**
         * <p>The confirmation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("ConfirmedAt")
        public String confirmedAt;

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team document scope</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of selected node identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;doc:1234567890&quot;]</p>
         */
        @NameInMap("SelectedNodeKeys")
        public java.util.List<String> selectedNodeKeys;

        /**
         * <p>The selection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>subtree</p>
         */
        @NameInMap("SelectionPolicy")
        public String selectionPolicy;

        /**
         * <p>The datasource config. The structure varies based on the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
         */
        @NameInMap("SourceConfig")
        public String sourceConfig;

        public static ListContextDatabaseSyncSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncSourcesResponseBodyDataSources self = new ListContextDatabaseSyncSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setConfirmedAt(String confirmedAt) {
            this.confirmedAt = confirmedAt;
            return this;
        }
        public String getConfirmedAt() {
            return this.confirmedAt;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setSelectedNodeKeys(java.util.List<String> selectedNodeKeys) {
            this.selectedNodeKeys = selectedNodeKeys;
            return this;
        }
        public java.util.List<String> getSelectedNodeKeys() {
            return this.selectedNodeKeys;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setSelectionPolicy(String selectionPolicy) {
            this.selectionPolicy = selectionPolicy;
            return this;
        }
        public String getSelectionPolicy() {
            return this.selectionPolicy;
        }

        public ListContextDatabaseSyncSourcesResponseBodyDataSources setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

    }

    public static class ListContextDatabaseSyncSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of data selection scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:&quot;src-as1llqmkol****&quot;, &quot;ConnectionId&quot;:&quot;conn-as1llqmkol****&quot;, &quot;Name&quot;:&quot;R&amp;D team document scope&quot;, &quot;SourceConfig&quot;:&quot;{\&quot;folderIds\&quot;:[\&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%5C%5C%22%5D,%5C%5C%22pageSize%5C%5C%22:50,%5C%5C%22maxDepth%5C%5C%22:5%7D%22%7D%5D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****\\&quot;],\\&quot;pageSize\\&quot;:50,\\&quot;maxDepth\\&quot;:5}&quot;}]</a></p>
         */
        @NameInMap("Sources")
        public java.util.List<ListContextDatabaseSyncSourcesResponseBodyDataSources> sources;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContextDatabaseSyncSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncSourcesResponseBodyData self = new ListContextDatabaseSyncSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncSourcesResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncSourcesResponseBodyData setSources(java.util.List<ListContextDatabaseSyncSourcesResponseBodyDataSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncSourcesResponseBodyDataSources> getSources() {
            return this.sources;
        }

        public ListContextDatabaseSyncSourcesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
