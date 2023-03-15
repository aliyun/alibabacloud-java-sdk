// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcApiSchemaUpdateCmd extends TeaModel {
    @NameInMap("apiSchema")
    public String apiSchema;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    public static PbcApiSchemaUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcApiSchemaUpdateCmd self = new PbcApiSchemaUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PbcApiSchemaUpdateCmd setApiSchema(String apiSchema) {
        this.apiSchema = apiSchema;
        return this;
    }
    public String getApiSchema() {
        return this.apiSchema;
    }

    public PbcApiSchemaUpdateCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

}
