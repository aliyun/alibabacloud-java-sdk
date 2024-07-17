// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDeployGraphResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public GetDeployGraphResponseBodyResult result;

    public static GetDeployGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeployGraphResponseBody self = new GetDeployGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeployGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeployGraphResponseBody setResult(GetDeployGraphResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeployGraphResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeployGraphResponseBodyResultGraphIndexMetas extends TeaModel {
        /**
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>hz_pre_vpc_domain_1</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The deployment ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>2409</p>
         */
        @NameInMap("tableDeployId")
        public Long tableDeployId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test_api_hz_pre_vpc_domain_1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The name of the QRS worker.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_qrs</p>
         */
        @NameInMap("zoneName")
        public String zoneName;

        public static GetDeployGraphResponseBodyResultGraphIndexMetas build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResultGraphIndexMetas self = new GetDeployGraphResponseBodyResultGraphIndexMetas();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setTableDeployId(Long tableDeployId) {
            this.tableDeployId = tableDeployId;
            return this;
        }
        public Long getTableDeployId() {
            return this.tableDeployId;
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetDeployGraphResponseBodyResultGraphIndexMetas setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class GetDeployGraphResponseBodyResultGraphOnlineMaster extends TeaModel {
        /**
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>hz_pre_vpc_domain_1</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5377</p>
         */
        @NameInMap("hippoId")
        public String hippoId;

        /**
         * <p>The ID of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The name of the online cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_hz_pre_vpc_domain_1</p>
         */
        @NameInMap("name")
        public String name;

        public static GetDeployGraphResponseBodyResultGraphOnlineMaster build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResultGraphOnlineMaster self = new GetDeployGraphResponseBodyResultGraphOnlineMaster();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResultGraphOnlineMaster setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDeployGraphResponseBodyResultGraphOnlineMaster setHippoId(String hippoId) {
            this.hippoId = hippoId;
            return this;
        }
        public String getHippoId() {
            return this.hippoId;
        }

        public GetDeployGraphResponseBodyResultGraphOnlineMaster setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDeployGraphResponseBodyResultGraphOnlineMaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDeployGraphResponseBodyResultGraphTableMetas extends TeaModel {
        /**
         * <p>The ID of the offline deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("buildDeployId")
        public Long buildDeployId;

        /**
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>hz_pre_vpc_domain_1</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The deployment ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>2177</p>
         */
        @NameInMap("tableDeployId")
        public Long tableDeployId;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api_hz_pre_vpc_domain_1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDeployGraphResponseBodyResultGraphTableMetas build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResultGraphTableMetas self = new GetDeployGraphResponseBodyResultGraphTableMetas();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setBuildDeployId(Long buildDeployId) {
            this.buildDeployId = buildDeployId;
            return this;
        }
        public Long getBuildDeployId() {
            return this.buildDeployId;
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setTableDeployId(Long tableDeployId) {
            this.tableDeployId = tableDeployId;
            return this;
        }
        public Long getTableDeployId() {
            return this.tableDeployId;
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetDeployGraphResponseBodyResultGraphTableMetas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDeployGraphResponseBodyResultGraphZoneMetas extends TeaModel {
        /**
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>hz_pre_vpc_domain_1</p>
         */
        @NameInMap("domainInfo")
        public String domainInfo;

        /**
         * <p>The name of the Query Result Searcher (QRS) worker.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the service that is used to manage the relationships between online clusters and indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_hz_pre_vpc_domain_1</p>
         */
        @NameInMap("suezAdminName")
        public String suezAdminName;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_qrs_hz_pre_vpc_domain_1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>qrs</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDeployGraphResponseBodyResultGraphZoneMetas build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResultGraphZoneMetas self = new GetDeployGraphResponseBodyResultGraphZoneMetas();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResultGraphZoneMetas setDomainInfo(String domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public String getDomainInfo() {
            return this.domainInfo;
        }

        public GetDeployGraphResponseBodyResultGraphZoneMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeployGraphResponseBodyResultGraphZoneMetas setSuezAdminName(String suezAdminName) {
            this.suezAdminName = suezAdminName;
            return this;
        }
        public String getSuezAdminName() {
            return this.suezAdminName;
        }

        public GetDeployGraphResponseBodyResultGraphZoneMetas setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetDeployGraphResponseBodyResultGraphZoneMetas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDeployGraphResponseBodyResultGraph extends TeaModel {
        /**
         * <p>The index metadata.</p>
         */
        @NameInMap("indexMetas")
        public java.util.List<GetDeployGraphResponseBodyResultGraphIndexMetas> indexMetas;

        /**
         * <p>The metadata of online clusters.</p>
         */
        @NameInMap("onlineMaster")
        public java.util.List<GetDeployGraphResponseBodyResultGraphOnlineMaster> onlineMaster;

        /**
         * <p>The association relationships between data sources and indexes.</p>
         */
        @NameInMap("tableIndexRelation")
        public java.util.Map<String, java.util.List<String>> tableIndexRelation;

        /**
         * <p>The metadata of data sources.</p>
         */
        @NameInMap("tableMetas")
        public java.util.List<GetDeployGraphResponseBodyResultGraphTableMetas> tableMetas;

        /**
         * <p>The association relationships between zones and indexes.</p>
         */
        @NameInMap("zoneIndexRelation")
        public java.util.Map<String, java.util.List<String>> zoneIndexRelation;

        /**
         * <p>The zone metadata.</p>
         */
        @NameInMap("zoneMetas")
        public java.util.List<GetDeployGraphResponseBodyResultGraphZoneMetas> zoneMetas;

        public static GetDeployGraphResponseBodyResultGraph build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResultGraph self = new GetDeployGraphResponseBodyResultGraph();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResultGraph setIndexMetas(java.util.List<GetDeployGraphResponseBodyResultGraphIndexMetas> indexMetas) {
            this.indexMetas = indexMetas;
            return this;
        }
        public java.util.List<GetDeployGraphResponseBodyResultGraphIndexMetas> getIndexMetas() {
            return this.indexMetas;
        }

        public GetDeployGraphResponseBodyResultGraph setOnlineMaster(java.util.List<GetDeployGraphResponseBodyResultGraphOnlineMaster> onlineMaster) {
            this.onlineMaster = onlineMaster;
            return this;
        }
        public java.util.List<GetDeployGraphResponseBodyResultGraphOnlineMaster> getOnlineMaster() {
            return this.onlineMaster;
        }

        public GetDeployGraphResponseBodyResultGraph setTableIndexRelation(java.util.Map<String, java.util.List<String>> tableIndexRelation) {
            this.tableIndexRelation = tableIndexRelation;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTableIndexRelation() {
            return this.tableIndexRelation;
        }

        public GetDeployGraphResponseBodyResultGraph setTableMetas(java.util.List<GetDeployGraphResponseBodyResultGraphTableMetas> tableMetas) {
            this.tableMetas = tableMetas;
            return this;
        }
        public java.util.List<GetDeployGraphResponseBodyResultGraphTableMetas> getTableMetas() {
            return this.tableMetas;
        }

        public GetDeployGraphResponseBodyResultGraph setZoneIndexRelation(java.util.Map<String, java.util.List<String>> zoneIndexRelation) {
            this.zoneIndexRelation = zoneIndexRelation;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getZoneIndexRelation() {
            return this.zoneIndexRelation;
        }

        public GetDeployGraphResponseBodyResultGraph setZoneMetas(java.util.List<GetDeployGraphResponseBodyResultGraphZoneMetas> zoneMetas) {
            this.zoneMetas = zoneMetas;
            return this;
        }
        public java.util.List<GetDeployGraphResponseBodyResultGraphZoneMetas> getZoneMetas() {
            return this.zoneMetas;
        }

    }

    public static class GetDeployGraphResponseBodyResult extends TeaModel {
        /**
         * <p>The deployment information.</p>
         */
        @NameInMap("graph")
        public GetDeployGraphResponseBodyResultGraph graph;

        public static GetDeployGraphResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeployGraphResponseBodyResult self = new GetDeployGraphResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeployGraphResponseBodyResult setGraph(GetDeployGraphResponseBodyResultGraph graph) {
            this.graph = graph;
            return this;
        }
        public GetDeployGraphResponseBodyResultGraph getGraph() {
            return this.graph;
        }

    }

}
