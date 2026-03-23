// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to record the client\&quot;s <strong>public IP address</strong> and the <strong>log reception time</strong>. The default value is false.</p>
     * <ul>
     * <li><p>true: records the public IP address of the client and the time when logs are received. If this feature is enabled, Simple Log Service automatically adds the public IP address of the log source and the server time of log reception to the tag field of the logs.</p>
     * </li>
     * <li><p>false: does not record the public IP address of the client or the time when logs are received.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Specifies whether to automatically split shards.</p>
     * <ul>
     * <li><p>true: automatically splits shards.</p>
     * </li>
     * <li><p>false: does not automatically split shards.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>Specifies whether to enable web tracking. Default value: false.</p>
     * <ul>
     * <li><p>true: enables web tracking.</p>
     * </li>
     * <li><p>false: disables web tracking.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    /**
     * <p>The data structure of the encryption configuration. The parameters include <code>enable</code>, <code>encrypt_type</code>, and <code>user_cmk_info</code>. For more information, see <a href="https://help.aliyun.com/document_detail/409461.html">EncryptConf</a>.</p>
     */
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    /**
     * <p>The retention period of data in the hot storage tier of the Logstore, in days. The minimum value is 7. The value cannot be greater than the value of \<code>ttl\\</code>. If you set this parameter to -1, data is permanently stored in the hot tier.</p>
     * <p>After the hot tier retention period expires, data is moved to the Infrequent Access (IA) storage class. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Automatic Storage Tiering</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The retention period of data in the Infrequent Access (IA) storage class, in days. The value must be 30 or greater.</p>
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
     * <li><p>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>It must be 2 to 63 characters in length.</p>
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
     * <p>The maximum number of shards that can be created by an automatic split. The value must be between 1 and 256.</p>
     * <blockquote>
     * <p>This parameter is required if you set the autoSplit parameter to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>The Logstore mode. Simple Log Service provides two modes: Standard and Query.</p>
     * <ul>
     * <li><p><strong>standard</strong>: Supports comprehensive data analytics. This mode is suitable for use cases such as real-time monitoring, interactive analysis, and building a complete observability system.</p>
     * </li>
     * <li><p><strong>query</strong>: Supports high-performance queries. The index traffic cost for this mode is about half that of the Standard mode. This mode does not support SQL analysis. It is suitable for use cases that involve large amounts of data, long retention periods, and no log analysis requirements.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The ID of the ingest processor.</p>
     * 
     * <strong>example:</strong>
     * <p>processor-nginx-parser-001</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of shards.</p>
     * <blockquote>
     * <p>You cannot change the number of shards with this operation. To change the number of shards, call the \<code>SplitShard\\</code> or \<code>MergeShards\\</code> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The configuration for hash-based writes.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The type of observable data. Valid values:</p>
     * <ul>
     * <li><p><strong>None</strong>: log data. This is the default value.</p>
     * </li>
     * <li><p><strong>Metrics</strong>: metrics.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("telemetryType")
    public String telemetryType;

    /**
     * <p>The data retention period, in days. Valid values: 1 to 3650. If you set the value to 3650, data is stored permanently.</p>
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
