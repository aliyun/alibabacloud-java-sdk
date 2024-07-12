// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>from feature_store_py.fs_client import FeatureStoreClient\nfrom feature_store_py.fs_project import FeatureStoreProject\nfrom feature_store_py.fs_datasource import LabelInput, MaxComputeDataSource, TrainingSetOutput\nfrom feature_store_py.fs_features import FeatureSelector\nfrom feature_store_py.fs_config import LabelInputConfig, PartitionConfig, FeatureViewConfig\nfrom feature_store_py.fs_config import TrainSetOutputConfig, EASDeployConfig\nimport datetime\nimport sys\n\ncur_day = args[&quot;dt&quot;]\nprint(&quot;cur_day = &quot;, cur_day)\noffset = datetime.timedelta(days=-1)\npre_day = (datetime.datetime.strptime(cur_day, &quot;%Y%m%d&quot;) + offset).strftime(&quot;%Y%m%d&quot;)\nprint(&quot;pre_day = &quot;, pre_day)\n\n\naccess_key_id = o.account.access_id\naccess_key_secret = o.account.secret_access_key\nfs = FeatureStoreClient(access_key_id=access_key_id, access_key_secret=access_key_secret, region=&quot;cn-beijing&quot;)\ncur_project_name = &quot;p1&quot;\nproject = fs.get_project(cur_project_name)\n\nlabel_partitions = PartitionConfig(name = &quot;ds&quot;, value = cur_day)\nlabel_input_config = LabelInputConfig(partition_config=label_partitions)\n\nfeature_view_1_partitions = PartitionConfig(name = &quot;ds&quot;, value = pre_day)\nfeature_view_1_config = FeatureViewConfig(name = &quot;user_fea&quot;,\npartition_config=feature_view_1_partitions)\n\nfeature_view_2_partitions = PartitionConfig(name = &quot;ds&quot;, value = pre_day)\nfeature_view_2_config = FeatureViewConfig(name = &quot;seq_fea&quot;,\npartition_config=feature_view_2_partitions)\n\nfeature_view_3_partitions = PartitionConfig(name = &quot;ds&quot;, value = pre_day)\nfeature_view_3_config = FeatureViewConfig(name = &quot;item_fea&quot;,\npartition_config=feature_view_3_partitions)\n\nfeature_view_config_list = [feature_view_1_config,feature_view_2_config,feature_view_3_config]\ntrain_set_partitions = PartitionConfig(name = &quot;ds&quot;, value = cur_day)\ntrain_set_output_config = TrainSetOutputConfig(partition_config=train_set_partitions)\n\n\nmodel_name = &quot;rank_v1&quot;\ncur_model = project.get_model(model_name)\ntask = cur_model.export_train_set(label_input_config, feature_view_config_list, train_set_output_config)\ntask.wait()\nprint(&quot;task_summary = &quot;, task.task_summary)\n</p>
     */
    @NameInMap("ExportTrainingSetTableScript")
    public String exportTrainingSetTableScript;

    @NameInMap("Features")
    public java.util.List<GetModelFeatureResponseBodyFeatures> features;

    /**
     * <strong>example:</strong>
     * <p>2023-07-04T14:46:22.227+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2023-07-04T14:46:22.227+08:00</p>
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
    @NameInMap("LabelTableName")
    public String labelTableName;

    /**
     * <strong>example:</strong>
     * <p>model_feature1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1231243253****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Relations")
    public GetModelFeatureResponseBodyRelations relations;

    /**
     * <strong>example:</strong>
     * <p>0C89F5E1-7F24-5EEC-9F05-508A39278CC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>table2</p>
     */
    @NameInMap("TrainingSetFGTable")
    public String trainingSetFGTable;

    /**
     * <strong>example:</strong>
     * <p>table1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>feature2</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <strong>example:</strong>
         * <p>feature_view_1</p>
         */
        @NameInMap("FeatureViewName")
        public String featureViewName;

        /**
         * <strong>example:</strong>
         * <p>feature1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>INT32</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>FeatureEntity</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>Domain ID。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>feature_entity_1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>model_feature_2</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <strong>example:</strong>
         * <p>feature_entity_3</p>
         */
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
