// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumeProcessorsRequest extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("offset")
    public String offset;

    @NameInMap("processorName")
    public String processorName;

    @NameInMap("size")
    public String size;

    public static ListConsumeProcessorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumeProcessorsRequest self = new ListConsumeProcessorsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumeProcessorsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListConsumeProcessorsRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public ListConsumeProcessorsRequest setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }
    public String getProcessorName() {
        return this.processorName;
    }

    public ListConsumeProcessorsRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
