// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogtailPipelineConfigRequest extends TeaModel {
    /**
     * <p>The name of the Logtail pipeline configuration.</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The line from which the query starts.</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>The number of Logtail pipeline configurations per page.</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListLogtailPipelineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogtailPipelineConfigRequest self = new ListLogtailPipelineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListLogtailPipelineConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ListLogtailPipelineConfigRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ListLogtailPipelineConfigRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListLogtailPipelineConfigRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
