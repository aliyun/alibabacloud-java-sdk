// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDeployGraphResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("domainName")
        public String domainName;

        @NameInMap("name")
        public String name;

        @NameInMap("tableDeployId")
        public Long tableDeployId;

        @NameInMap("tableName")
        public String tableName;

        @NameInMap("tag")
        public String tag;

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
        @NameInMap("domainName")
        public String domainName;

        @NameInMap("hippoId")
        public String hippoId;

        @NameInMap("id")
        public Long id;

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
        @NameInMap("buildDeployId")
        public Long buildDeployId;

        @NameInMap("domainName")
        public String domainName;

        @NameInMap("name")
        public String name;

        @NameInMap("tableDeployId")
        public Long tableDeployId;

        @NameInMap("tag")
        public String tag;

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
        @NameInMap("domainInfo")
        public String domainInfo;

        @NameInMap("name")
        public String name;

        @NameInMap("suezAdminName")
        public String suezAdminName;

        @NameInMap("tag")
        public String tag;

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
        @NameInMap("indexMetas")
        public java.util.List<GetDeployGraphResponseBodyResultGraphIndexMetas> indexMetas;

        @NameInMap("onlineMaster")
        public java.util.List<GetDeployGraphResponseBodyResultGraphOnlineMaster> onlineMaster;

        @NameInMap("tableIndexRelation")
        public java.util.Map<String, java.util.List<String>> tableIndexRelation;

        @NameInMap("tableMetas")
        public java.util.List<GetDeployGraphResponseBodyResultGraphTableMetas> tableMetas;

        @NameInMap("zoneIndexRelation")
        public java.util.Map<String, java.util.List<String>> zoneIndexRelation;

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
