// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureResponseBody extends TeaModel {
    @NameInMap("ExportTrainingSetTableScript")
    public String exportTrainingSetTableScript;

    @NameInMap("Features")
    public java.util.List<GetModelFeatureResponseBodyFeatures> features;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("LabelTableId")
    public String labelTableId;

    @NameInMap("LabelTableName")
    public String labelTableName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Relations")
    public GetModelFeatureResponseBodyRelations relations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrainingSetFGTable")
    public String trainingSetFGTable;

    @NameInMap("TrainingSetTable")
    public String trainingSetTable;

    public static GetModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureResponseBody self = new GetModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureResponseBody setExportTrainingSetTableScript(String exportTrainingSetTableScript) {
        this.exportTrainingSetTableScript = exportTrainingSetTableScript;
        return this;
    }
    public String getExportTrainingSetTableScript() {
        return this.exportTrainingSetTableScript;
    }

    public GetModelFeatureResponseBody setFeatures(java.util.List<GetModelFeatureResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<GetModelFeatureResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public GetModelFeatureResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetModelFeatureResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetModelFeatureResponseBody setLabelTableId(String labelTableId) {
        this.labelTableId = labelTableId;
        return this;
    }
    public String getLabelTableId() {
        return this.labelTableId;
    }

    public GetModelFeatureResponseBody setLabelTableName(String labelTableName) {
        this.labelTableName = labelTableName;
        return this;
    }
    public String getLabelTableName() {
        return this.labelTableName;
    }

    public GetModelFeatureResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetModelFeatureResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetModelFeatureResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetModelFeatureResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetModelFeatureResponseBody setRelations(GetModelFeatureResponseBodyRelations relations) {
        this.relations = relations;
        return this;
    }
    public GetModelFeatureResponseBodyRelations getRelations() {
        return this.relations;
    }

    public GetModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelFeatureResponseBody setTrainingSetFGTable(String trainingSetFGTable) {
        this.trainingSetFGTable = trainingSetFGTable;
        return this;
    }
    public String getTrainingSetFGTable() {
        return this.trainingSetFGTable;
    }

    public GetModelFeatureResponseBody setTrainingSetTable(String trainingSetTable) {
        this.trainingSetTable = trainingSetTable;
        return this;
    }
    public String getTrainingSetTable() {
        return this.trainingSetTable;
    }

    public static class GetModelFeatureResponseBodyFeatures extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("FeatureViewId")
        public String featureViewId;

        @NameInMap("FeatureViewName")
        public String featureViewName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetModelFeatureResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureResponseBodyFeatures self = new GetModelFeatureResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureResponseBodyFeatures setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetModelFeatureResponseBodyFeatures setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public GetModelFeatureResponseBodyFeatures setFeatureViewName(String featureViewName) {
            this.featureViewName = featureViewName;
            return this;
        }
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        public GetModelFeatureResponseBodyFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModelFeatureResponseBodyFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetModelFeatureResponseBodyRelationsDomains extends TeaModel {
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>Domain ID。</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetModelFeatureResponseBodyRelationsDomains build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureResponseBodyRelationsDomains self = new GetModelFeatureResponseBodyRelationsDomains();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureResponseBodyRelationsDomains setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetModelFeatureResponseBodyRelationsDomains setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetModelFeatureResponseBodyRelationsDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetModelFeatureResponseBodyRelationsLinks extends TeaModel {
        @NameInMap("From")
        public String from;

        @NameInMap("Link")
        public String link;

        @NameInMap("To")
        public String to;

        public static GetModelFeatureResponseBodyRelationsLinks build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureResponseBodyRelationsLinks self = new GetModelFeatureResponseBodyRelationsLinks();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureResponseBodyRelationsLinks setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetModelFeatureResponseBodyRelationsLinks setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetModelFeatureResponseBodyRelationsLinks setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class GetModelFeatureResponseBodyRelations extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<GetModelFeatureResponseBodyRelationsDomains> domains;

        @NameInMap("Links")
        public java.util.List<GetModelFeatureResponseBodyRelationsLinks> links;

        public static GetModelFeatureResponseBodyRelations build(java.util.Map<String, ?> map) throws Exception {
            GetModelFeatureResponseBodyRelations self = new GetModelFeatureResponseBodyRelations();
            return TeaModel.build(map, self);
        }

        public GetModelFeatureResponseBodyRelations setDomains(java.util.List<GetModelFeatureResponseBodyRelationsDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<GetModelFeatureResponseBodyRelationsDomains> getDomains() {
            return this.domains;
        }

        public GetModelFeatureResponseBodyRelations setLinks(java.util.List<GetModelFeatureResponseBodyRelationsLinks> links) {
            this.links = links;
            return this;
        }
        public java.util.List<GetModelFeatureResponseBodyRelationsLinks> getLinks() {
            return this.links;
        }

    }

}
