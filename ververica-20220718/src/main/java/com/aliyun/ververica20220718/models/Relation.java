// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Relation extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TableB</p>
     */
    @NameInMap("destination")
    public String destination;

    /**
     * <strong>example:</strong>
     * <p>664cc64d-5dea-4ad3-9ee4-8432a874****</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>TableA</p>
     */
    @NameInMap("source")
    public String source;

    public static Relation build(java.util.Map<String, ?> map) throws Exception {
        Relation self = new Relation();
        return TeaModel.build(map, self);
    }

    public Relation setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public Relation setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public Relation setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
