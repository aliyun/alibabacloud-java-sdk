// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcApiSchemaCreateCmd extends TeaModel {
    @NameInMap("apiSchema")
    public String apiSchema;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    public static PbcApiSchemaCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcApiSchemaCreateCmd self = new PbcApiSchemaCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcApiSchemaCreateCmd setApiSchema(String apiSchema) {
        this.apiSchema = apiSchema;
        return this;
    }
    public String getApiSchema() {
        return this.apiSchema;
    }

    public PbcApiSchemaCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcApiSchemaCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcApiSchemaCreateCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

}
