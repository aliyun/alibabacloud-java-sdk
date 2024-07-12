// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLabelTablesResponseBody extends TeaModel {
    @NameInMap("LabelTables")
    public java.util.List<ListLabelTablesResponseBodyLabelTables> labelTables;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>datasource1</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

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
         * <p>3</p>
         */
        @NameInMap("LabelTableId")
        public String labelTableId;

        /**
         * <strong>example:</strong>
         * <p>label_table1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123214213214</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>project1</p>
         */
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
