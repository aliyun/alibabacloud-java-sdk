// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourcesResponseBody extends TeaModel {
    @NameInMap("Datasources")
    public java.util.List<ListDatasourcesResponseBodyDatasources> datasources;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Config")
        public String config;

        @NameInMap("DatasourceId")
        public String datasourceId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uri")
        public String uri;

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
