// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsRequest extends TeaModel {
    @NameInMap("attributes")
    public String attributes;

    @NameInMap("configType")
    public String configType;

    @NameInMap("offset")
    public Long offset;

    @NameInMap("size")
    public Long size;

    public static ListAgentInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceConfigsRequest self = new ListAgentInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceConfigsRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
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
