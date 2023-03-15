// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcApiSchema extends TeaModel {
    @NameInMap("apiSchema")
    public String apiSchema;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    @NameInMap("requestId")
    public String requestId;

    public static PbcApiSchema build(java.util.Map<String, ?> map) throws Exception {
        PbcApiSchema self = new PbcApiSchema();
        return TeaModel.build(map, self);
    }

    public PbcApiSchema setApiSchema(String apiSchema) {
        this.apiSchema = apiSchema;
        return this;
    }
    public String getApiSchema() {
        return this.apiSchema;
    }

    public PbcApiSchema setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcApiSchema setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public PbcApiSchema setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
