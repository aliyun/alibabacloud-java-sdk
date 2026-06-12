// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsRequest extends TeaModel {
    /**
     * <p>The type of the process-level configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>apm_trace</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>The number of entries to skip. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>The number of entries to return. The default value is 500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListAgentInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceConfigsRequest self = new ListAgentInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListAgentInstanceConfigsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListAgentInstanceConfigsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
