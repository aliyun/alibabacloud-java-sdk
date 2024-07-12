// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;save_original_field&quot;:true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    /**
     * <strong>example:</strong>
     * <p>featureEntity1</p>
     */
    @NameInMap("FeatureEntityName")
    public String featureEntityName;

    @NameInMap("Fields")
    public java.util.List<GetFeatureViewResponseBodyFields> fields;

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
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtSyncTime")
    public String gmtSyncTime;

    /**
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("JoinId")
    public String joinId;

    /**
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
     * <strong>example:</strong>
     * <p>featureView1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>12321421412****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>from feature_store_py.fs_client import FeatureStoreClient\nimport datetime\nfrom feature_store_py.fs_datasource import MaxComputeDataSource\nimport sys\n\ncur_day = args[&quot;dt&quot;]\nprint(&quot;cur_day = &quot;, cur_day)\n\naccess_key_id = o.account.access_id\naccess_key_secret = o.account.secret_access_key\nfs = FeatureStoreClient(access_key_id=access_key_id, access_key_secret=access_key_secret, region=&quot;cn-beijing&quot;)\ncur_project_name = &quot;p1&quot;\nproject = fs.get_project(cur_project_name)\n\nfeature_view_name = &quot;user_fea&quot;\nbatch_feature_view = project.get_feature_view(feature_view_name)\ntask = batch_feature_view.publish_table(partitions={&quot;ds&quot;:cur_day}, mode=&quot;Overwrite&quot;)\ntask.wait()\ntask.print_summary()\n</p>
     */
    @NameInMap("PublishTableScript")
    public String publishTableScript;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("RegisterDatasourceId")
    public String registerDatasourceId;

    /**
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("RegisterDatasourceName")
    public String registerDatasourceName;

    /**
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("RegisterTable")
    public String registerTable;

    /**
     * <strong>example:</strong>
     * <p>72F15A8A-5A28-5B18-A0DE-0EABD7D3245A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncOnlineTable")
    public Boolean syncOnlineTable;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("TTL")
    public Integer TTL;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <strong>example:</strong>
     * <p>Batch</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("WriteMethod")
    public String writeMethod;

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

    public static class GetFeatureViewResponseBodyFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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

        public GetFeatureViewResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
