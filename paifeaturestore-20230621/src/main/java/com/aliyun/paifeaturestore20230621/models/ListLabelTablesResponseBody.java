// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLabelTablesResponseBody extends TeaModel {
    @NameInMap("LabelTables")
    public java.util.List<ListLabelTablesResponseBodyLabelTables> labelTables;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLabelTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabelTablesResponseBody self = new ListLabelTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabelTablesResponseBody setLabelTables(java.util.List<ListLabelTablesResponseBodyLabelTables> labelTables) {
        this.labelTables = labelTables;
        return this;
    }
    public java.util.List<ListLabelTablesResponseBodyLabelTables> getLabelTables() {
        return this.labelTables;
    }

    public ListLabelTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLabelTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLabelTablesResponseBodyLabelTables extends TeaModel {
        @NameInMap("DatasourceId")
        public String datasourceId;

        @NameInMap("DatasourceName")
        public String datasourceName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("LabelTableId")
        public String labelTableId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        public static ListLabelTablesResponseBodyLabelTables build(java.util.Map<String, ?> map) throws Exception {
            ListLabelTablesResponseBodyLabelTables self = new ListLabelTablesResponseBodyLabelTables();
            return TeaModel.build(map, self);
        }

        public ListLabelTablesResponseBodyLabelTables setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListLabelTablesResponseBodyLabelTables setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListLabelTablesResponseBodyLabelTables setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListLabelTablesResponseBodyLabelTables setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListLabelTablesResponseBodyLabelTables setLabelTableId(String labelTableId) {
            this.labelTableId = labelTableId;
            return this;
        }
        public String getLabelTableId() {
            return this.labelTableId;
        }

        public ListLabelTablesResponseBodyLabelTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLabelTablesResponseBodyLabelTables setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListLabelTablesResponseBodyLabelTables setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListLabelTablesResponseBodyLabelTables setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
