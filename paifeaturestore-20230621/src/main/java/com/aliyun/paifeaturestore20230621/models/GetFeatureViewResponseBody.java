// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureViewResponseBody extends TeaModel {
    /**
     * <p>The configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;save_original_field&quot;:true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The feature entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    /**
     * <p>The feature entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>featureEntity1</p>
     */
    @NameInMap("FeatureEntityName")
    public String featureEntityName;

    /**
     * <p>The list of fields.</p>
     */
    @NameInMap("Fields")
    public java.util.List<GetFeatureViewResponseBodyFields> fields;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The synchronization time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtSyncTime")
    public String gmtSyncTime;

    /**
     * <p>The join ID of the feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("JoinId")
    public String joinId;

    /**
     * <p>The most recent synchronization configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;mode&quot;: &quot;overwrite&quot;,
     *     &quot;partitions&quot;: {
     *         &quot;ds&quot;: {
     *             &quot;value&quot;: &quot;20230820&quot;
     *         }
     *     },
     *     &quot;event_time&quot;: &quot;&quot;,
     *     &quot;config&quot;: {},
     *     &quot;offline_to_online&quot;: true
     * }</p>
     */
    @NameInMap("LastSyncConfig")
    public String lastSyncConfig;

    /**
     * <p>The name of the mock data table for the stream feature view.</p>
     * 
     * <strong>example:</strong>
     * <p>item_table_mock_1</p>
     */
    @NameInMap("MockTableName")
    public String mockTableName;

    /**
     * <p>The feature view name.</p>
     * 
     * <strong>example:</strong>
     * <p>featureView1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>12321421412****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The script for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>from feature_store_py.fs_client import FeatureStoreClient\nimport datetime\nfrom feature_store_py.fs_datasource import MaxComputeDataSource\nimport sys\n\ncur_day = args[\&quot;dt\&quot;]\nprint(\&quot;cur_day = \&quot;, cur_day)\n\naccess_key_id = o.account.access_id\naccess_key_secret = o.account.secret_access_key\nfs = FeatureStoreClient(access_key_id=access_key_id, access_key_secret=access_key_secret, region=\&quot;cn-beijing\&quot;)\ncur_project_name = \&quot;p1\&quot;\nproject = fs.get_project(cur_project_name)\n\nfeature_view_name = \&quot;user_fea\&quot;\nbatch_feature_view = project.get_feature_view(feature_view_name)\ntask = batch_feature_view.publish_table(partitions={\&quot;ds\&quot;:cur_day}, mode=\&quot;Overwrite\&quot;)\ntask.wait()\ntask.print_summary()\n</p>
     */
    @NameInMap("PublishTableScript")
    public String publishTableScript;

    /**
     * <p>The ID of the data source where the registered table resides.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("RegisterDatasourceId")
    public String registerDatasourceId;

    /**
     * <p>The name of the data source where the registered table resides.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("RegisterDatasourceName")
    public String registerDatasourceName;

    /**
     * <p>The name of the registered table.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("RegisterTable")
    public String registerTable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72F15A8A-5A28-5B18-A0DE-0EABD7D3245A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether to synchronize the online feature table.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncOnlineTable")
    public Boolean syncOnlineTable;

    /**
     * <p>The time to live (TTL).</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("TTL")
    public Integer TTL;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>The type of the feature view. Valid values:</p>
     * <p>● <code>Batch</code>: A batch feature.</p>
     * <p>● <code>Stream</code>: A stream feature.</p>
     * 
     * <strong>example:</strong>
     * <p>Batch</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The write method. Valid values:</p>
     * <p>● <code>ByReadyMadeTable</code>: Registers the feature view by using an existing table.</p>
     * <p>● <code>Custom</code>: Uses a custom table structure.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("WriteMethod")
    public String writeMethod;

    /**
     * <p>Indicates whether to write data to the online managed storage.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WriteToFeatureDB")
    public Boolean writeToFeatureDB;

    public static GetFeatureViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureViewResponseBody self = new GetFeatureViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureViewResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetFeatureViewResponseBody setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public GetFeatureViewResponseBody setFeatureEntityName(String featureEntityName) {
        this.featureEntityName = featureEntityName;
        return this;
    }
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    public GetFeatureViewResponseBody setFields(java.util.List<GetFeatureViewResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetFeatureViewResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetFeatureViewResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetFeatureViewResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetFeatureViewResponseBody setGmtSyncTime(String gmtSyncTime) {
        this.gmtSyncTime = gmtSyncTime;
        return this;
    }
    public String getGmtSyncTime() {
        return this.gmtSyncTime;
    }

    public GetFeatureViewResponseBody setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public GetFeatureViewResponseBody setLastSyncConfig(String lastSyncConfig) {
        this.lastSyncConfig = lastSyncConfig;
        return this;
    }
    public String getLastSyncConfig() {
        return this.lastSyncConfig;
    }

    public GetFeatureViewResponseBody setMockTableName(String mockTableName) {
        this.mockTableName = mockTableName;
        return this;
    }
    public String getMockTableName() {
        return this.mockTableName;
    }

    public GetFeatureViewResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFeatureViewResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetFeatureViewResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetFeatureViewResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFeatureViewResponseBody setPublishTableScript(String publishTableScript) {
        this.publishTableScript = publishTableScript;
        return this;
    }
    public String getPublishTableScript() {
        return this.publishTableScript;
    }

    public GetFeatureViewResponseBody setRegisterDatasourceId(String registerDatasourceId) {
        this.registerDatasourceId = registerDatasourceId;
        return this;
    }
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    public GetFeatureViewResponseBody setRegisterDatasourceName(String registerDatasourceName) {
        this.registerDatasourceName = registerDatasourceName;
        return this;
    }
    public String getRegisterDatasourceName() {
        return this.registerDatasourceName;
    }

    public GetFeatureViewResponseBody setRegisterTable(String registerTable) {
        this.registerTable = registerTable;
        return this;
    }
    public String getRegisterTable() {
        return this.registerTable;
    }

    public GetFeatureViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureViewResponseBody setSyncOnlineTable(Boolean syncOnlineTable) {
        this.syncOnlineTable = syncOnlineTable;
        return this;
    }
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    public GetFeatureViewResponseBody setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public GetFeatureViewResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetFeatureViewResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetFeatureViewResponseBody setWriteMethod(String writeMethod) {
        this.writeMethod = writeMethod;
        return this;
    }
    public String getWriteMethod() {
        return this.writeMethod;
    }

    public GetFeatureViewResponseBody setWriteToFeatureDB(Boolean writeToFeatureDB) {
        this.writeToFeatureDB = writeToFeatureDB;
        return this;
    }
    public Boolean getWriteToFeatureDB() {
        return this.writeToFeatureDB;
    }

    public static class GetFeatureViewResponseBodyFieldsTransformInput extends TeaModel {
        /**
         * <p>The modality type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Modality")
        public String modality;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>feature1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetFeatureViewResponseBodyFieldsTransformInput build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureViewResponseBodyFieldsTransformInput self = new GetFeatureViewResponseBodyFieldsTransformInput();
            return TeaModel.build(map, self);
        }

        public GetFeatureViewResponseBodyFieldsTransformInput setModality(String modality) {
            this.modality = modality;
            return this;
        }
        public String getModality() {
            return this.modality;
        }

        public GetFeatureViewResponseBodyFieldsTransformInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFeatureViewResponseBodyFieldsTransformInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetFeatureViewResponseBodyFieldsTransform extends TeaModel {
        /**
         * <p>The input for the feature transformation.</p>
         */
        @NameInMap("Input")
        public java.util.List<GetFeatureViewResponseBodyFieldsTransformInput> input;

        /**
         * <p>The LLM configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LLMConfigId")
        public Integer LLMConfigId;

        /**
         * <p>The feature transformation type.</p>
         * 
         * <strong>example:</strong>
         * <p>LLMEmbedding</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetFeatureViewResponseBodyFieldsTransform build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureViewResponseBodyFieldsTransform self = new GetFeatureViewResponseBodyFieldsTransform();
            return TeaModel.build(map, self);
        }

        public GetFeatureViewResponseBodyFieldsTransform setInput(java.util.List<GetFeatureViewResponseBodyFieldsTransformInput> input) {
            this.input = input;
            return this;
        }
        public java.util.List<GetFeatureViewResponseBodyFieldsTransformInput> getInput() {
            return this.input;
        }

        public GetFeatureViewResponseBodyFieldsTransform setLLMConfigId(Integer LLMConfigId) {
            this.LLMConfigId = LLMConfigId;
            return this;
        }
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        public GetFeatureViewResponseBodyFieldsTransform setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetFeatureViewResponseBodyFields extends TeaModel {
        /**
         * <p>The list of field attributes. Valid values:</p>
         * <p>● <code>Partition</code>: The partition field.</p>
         * <p>● <code>PrimaryKey</code>: The primary key.</p>
         * <p>● <code>EventTime</code>: The event time.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature transformation.</p>
         */
        @NameInMap("Transform")
        public java.util.List<GetFeatureViewResponseBodyFieldsTransform> transform;

        /**
         * <p>The data type of the field. Valid values:</p>
         * <p>● <code>int</code></p>
         * <p>● <code>string</code></p>
         * <p>● <code>float</code></p>
         * 
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetFeatureViewResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureViewResponseBodyFields self = new GetFeatureViewResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetFeatureViewResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetFeatureViewResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFeatureViewResponseBodyFields setTransform(java.util.List<GetFeatureViewResponseBodyFieldsTransform> transform) {
            this.transform = transform;
            return this;
        }
        public java.util.List<GetFeatureViewResponseBodyFieldsTransform> getTransform() {
            return this.transform;
        }

        public GetFeatureViewResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
