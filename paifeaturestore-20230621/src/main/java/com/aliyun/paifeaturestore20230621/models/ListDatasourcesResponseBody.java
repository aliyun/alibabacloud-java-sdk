// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourcesResponseBody extends TeaModel {
    @NameInMap("Datasources")
    public java.util.List<ListDatasourcesResponseBodyDatasources> datasources;

    /**
     * <strong>example:</strong>
     * <p>44933189-493B-5C43-A5C6-11EEC2A43520</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatasourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourcesResponseBody self = new ListDatasourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasourcesResponseBody setDatasources(java.util.List<ListDatasourcesResponseBodyDatasources> datasources) {
        this.datasources = datasources;
        return this;
    }
    public java.util.List<ListDatasourcesResponseBodyDatasources> getDatasources() {
        return this.datasources;
    }

    public ListDatasourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatasourcesResponseBodyDatasources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;address&quot;: &quot;&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>datasource1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>igraph_instance1</p>
         */
        @NameInMap("Uri")
        public String uri;

        /**
         * <strong>example:</strong>
         * <p>32324</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListDatasourcesResponseBodyDatasources build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourcesResponseBodyDatasources self = new ListDatasourcesResponseBodyDatasources();
            return TeaModel.build(map, self);
        }

        public ListDatasourcesResponseBodyDatasources setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDatasourcesResponseBodyDatasources setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListDatasourcesResponseBodyDatasources setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListDatasourcesResponseBodyDatasources setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListDatasourcesResponseBodyDatasources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasourcesResponseBodyDatasources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasourcesResponseBodyDatasources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public ListDatasourcesResponseBodyDatasources setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
