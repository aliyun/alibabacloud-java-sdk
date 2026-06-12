// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class IngestProcessor extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public IngestProcessorConfiguration configuration;

    /**
     * <strong>example:</strong>
     * <p>1717171200</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>过滤content字段</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>字段过滤处理</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1</p>
     */
    @NameInMap("processorName")
    public String processorName;

    /**
     * <strong>example:</strong>
     * <p>1717171200</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static IngestProcessor build(java.util.Map<String, ?> map) throws Exception {
        IngestProcessor self = new IngestProcessor();
        return TeaModel.build(map, self);
    }

    public IngestProcessor setConfiguration(IngestProcessorConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public IngestProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    public IngestProcessor setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public IngestProcessor setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IngestProcessor setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public IngestProcessor setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }
    public String getProcessorName() {
        return this.processorName;
    }

    public IngestProcessor setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
