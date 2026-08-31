// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListJobInstancesRequest extends TeaModel {
    /**
     * <p>The owner of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("callerOwner")
    public String callerOwner;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784237598</p>
     */
    @NameInMap("end")
    public Long end;

    /**
     * <p>The start row of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of rows per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784151198</p>
     */
    @NameInMap("start")
    public Long start;

    /**
     * <p>The current execution status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("state")
    public String state;

    public static ListJobInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstancesRequest self = new ListJobInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListJobInstancesRequest setCallerOwner(String callerOwner) {
        this.callerOwner = callerOwner;
        return this;
    }
    public String getCallerOwner() {
        return this.callerOwner;
    }

    public ListJobInstancesRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListJobInstancesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListJobInstancesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListJobInstancesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListJobInstancesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
