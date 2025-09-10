// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumeProcessorsRequest extends TeaModel {
    /**
     * <p>The display name of the consumption processor.</p>
     * 
     * <strong>example:</strong>
     * <p>filter-get-request</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The offset. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public String offset;

    /**
     * <p>The identifier of the consumption processor.</p>
     * 
     * <strong>example:</strong>
     * <p>consume-processor-1</p>
     */
    @NameInMap("processorName")
    public String processorName;

    /**
     * <p>The number of entries. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
