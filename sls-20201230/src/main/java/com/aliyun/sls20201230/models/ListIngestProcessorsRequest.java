// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListIngestProcessorsRequest extends TeaModel {
    /**
     * <p>The display name of the ingest processor.</p>
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
    public Integer offset;

    /**
     * <p>The identifier of the ingest processor.</p>
     * 
     * <strong>example:</strong>
     * <p>parse-nginx-log</p>
     */
    @NameInMap("processorName")
    public String processorName;

    /**
     * <p>The number of entries. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListIngestProcessorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIngestProcessorsRequest self = new ListIngestProcessorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIngestProcessorsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListIngestProcessorsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListIngestProcessorsRequest setProcessorName(String processorName) {
        this.processorName = processorName;
        return this;
    }
    public String getProcessorName() {
        return this.processorName;
    }

    public ListIngestProcessorsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
