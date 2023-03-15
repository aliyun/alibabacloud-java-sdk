// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcSchema extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("schema")
    public String schema;

    public static PbcSchema build(java.util.Map<String, ?> map) throws Exception {
        PbcSchema self = new PbcSchema();
        return TeaModel.build(map, self);
    }

    public PbcSchema setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcSchema setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public PbcSchema setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcSchema setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
