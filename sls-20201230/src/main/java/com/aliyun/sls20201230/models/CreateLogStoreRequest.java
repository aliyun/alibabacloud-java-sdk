// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to record the source <strong>public IP address</strong> and the <strong>server reception time</strong>. Default value: false.</p>
     * <ul>
     * <li><p>true: Log Service automatically appends the public IP address of the source device and the server reception time to the Tag field of logs.</p>
     * </li>
     * <li><p>false: Log Service does not append the source public IP address or the server reception time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Specifies whether to enable automatic shard splitting. If you set this parameter to true, Log Service automatically splits a shard to increase write throughput when the write traffic to the shard continuously exceeds the service limit. If you enable automatic shard splitting, you must also specify <code>maxSplitShard</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    @NameInMap("enableModify")
    public Boolean enableModify;

    /**
     * <p>Specifies whether to enable WebTracking. The default value is false. This feature lets you collect and analyze user behavior data from browsers or mini programs, such as page views, purchase history, and dwell time.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    /**
     * <p>The encryption configuration. This data structure includes the <code>enable</code>, <code>encrypt_type</code>, and <code>user_cmk_info</code> parameters. For more information, see <a href="https://help.aliyun.com/document_detail/409461.html">EncryptConf</a>.</p>
     * <p>Example 1 (Enable default encryption):</p>
     * <pre><code>{
     *     &quot;enable&quot;: true,
     *     &quot;encrypt_conf&quot;: &quot;default&quot;
     * }
     * </code></pre>
     * <p>Example 2 (Enable BYOK encryption):</p>
     * <pre><code>{
     *     &quot;enable&quot;: true,
     *     &quot;encrypt_conf&quot;: &quot;default&quot;,
     *     &quot;user_cmk_info&quot;: {
     *         &quot;cmk_key_id&quot;: &quot;xxxxx&quot;,
     *         &quot;arn&quot;: &quot;acs:ram::112340000000:role/rolename&quot;,
     *         &quot;region&quot;: &quot;cn-hangzhou&quot;
     *     }
     * }
     * </code></pre>
     */
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    /**
     * <p>The retention period of data in the hot storage tier of the Logstore, in days. The value must be an integer from 7 to the value of <code>ttl</code>. If you do not specify this parameter, data is stored in the hot storage tier for the entire data retention period specified by <code>ttl</code>.</p>
     * <p>After the hot storage retention period expires, data is moved to the Infrequent Access (IA) storage tier. To enable IA storage, you must set the hot storage retention period to at least 7 days. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Smart Tiered Storage</a>.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Scenario 1 (Store data in the hot storage tier for 30 days): <code>{&quot;ttl&quot;: 30}</code> or <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 30}</code></p>
     * </li>
     * <li><p>Scenario 2 (Store data in the hot storage tier for 7 days and in the IA storage tier for 23 days): <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 7}</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The retention period for Infrequent Access (IA) storage, in days. While this parameter has no minimum value, data must remain in the IA storage tier for at least 30 days before it can be moved to archive storage.</p>
     * <p>If the total retention period (<code>ttl</code>) is longer than the sum of the hot storage period (<code>hot_ttl</code>) and the IA storage period (<code>infrequentAccessTTL</code>), the remaining time is the archive storage period.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Scenario 1 (Store data in the hot storage tier for 7 days and in the IA storage tier for 23 days): <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 7}</code></p>
     * </li>
     * <li><p>Scenario 2 (Store data in the hot storage tier for 7 days, in the IA storage tier for 30 days, and in the archive storage tier for 60 days): <code>{&quot;ttl&quot;: 97, &quot;hot_ttl&quot;: 7, &quot;infrequentAccessTTL&quot;: 30}</code></p>
     * </li>
     * <li><p>Scenario 3 (Store data in the hot storage tier for 60 days and in the archive storage tier for 60 days, with the IA storage period being 0 days): <code>{&quot;ttl&quot;: 120, &quot;hot_ttl&quot;: 60, &quot;infrequentAccessTTL&quot;: 0}</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("infrequentAccessTTL")
    public Integer infrequentAccessTTL;

    /**
     * <p>The name of the Logstore. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name must be unique within a project.</p>
     * </li>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 2 to 63 characters long.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The maximum number of shards after an automatic split. The value must be an integer from 1 to 256.</p>
     * <blockquote>
     * <p>This parameter is required if you set <code>autoSplit</code> to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>Log Service provides two types of Logstores: standard and query.</p>
     * <ul>
     * <li><p><strong>standard</strong>: Supports end-to-end data analytics. This mode is suitable for scenarios such as real-time monitoring, interactive analysis, and building a complete observability system.</p>
     * </li>
     * <li><p><strong>query</strong>: Supports high-performance queries. The index traffic cost is approximately half that of the standard mode, but SQL analysis is not supported. This mode is suitable for scenarios that involve large volumes of data, long retention periods such as weeks or months, and do not require SQL-based analysis.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The ID of the IngestProcessor.</p>
     * 
     * <strong>example:</strong>
     * <p>processor-nginx-parser-001</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>The ID of the resource group to which the Logstore belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxxxxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of shards.</p>
     * <blockquote>
     * <p>You cannot update the shard count with this operation. To do so, call the SplitShard or MergeShards operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The configuration for hash-based writes. When you write data, logs are stored in a shard that is selected based on the configured hash-based sharding policy. Before you configure this parameter, make sure that the hash ranges of the shards are evenly distributed. Improper configuration may affect write performance. Configure this parameter with caution.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The type of observable data. Default value: log data. Valid values:</p>
     * <ul>
     * <li><p><strong>None</strong>: log data. This is the default value.</p>
     * </li>
     * <li><p><strong>Metrics</strong>: Metrics data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("telemetryType")
    public String telemetryType;

    /**
     * <p>The data retention period in days. Valid values: 1 to 3,650. If you set this parameter to 3,650, data is stored permanently.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static CreateLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogStoreRequest self = new CreateLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogStoreRequest setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public CreateLogStoreRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public CreateLogStoreRequest setEnableModify(Boolean enableModify) {
        this.enableModify = enableModify;
        return this;
    }
    public Boolean getEnableModify() {
        return this.enableModify;
    }

    public CreateLogStoreRequest setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    public CreateLogStoreRequest setEncryptConf(EncryptConf encryptConf) {
        this.encryptConf = encryptConf;
        return this;
    }
    public EncryptConf getEncryptConf() {
        return this.encryptConf;
    }

    public CreateLogStoreRequest setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public CreateLogStoreRequest setInfrequentAccessTTL(Integer infrequentAccessTTL) {
        this.infrequentAccessTTL = infrequentAccessTTL;
        return this;
    }
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
    }

    public CreateLogStoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateLogStoreRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public CreateLogStoreRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateLogStoreRequest setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public CreateLogStoreRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateLogStoreRequest setShardingPolicy(ShardingPolicy shardingPolicy) {
        this.shardingPolicy = shardingPolicy;
        return this;
    }
    public ShardingPolicy getShardingPolicy() {
        return this.shardingPolicy;
    }

    public CreateLogStoreRequest setTelemetryType(String telemetryType) {
        this.telemetryType = telemetryType;
        return this;
    }
    public String getTelemetryType() {
        return this.telemetryType;
    }

    public CreateLogStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
