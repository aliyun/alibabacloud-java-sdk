// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInstructionCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Long id;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    public static PbcInstructionCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcInstructionCreateCmd self = new PbcInstructionCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcInstructionCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcInstructionCreateCmd setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public PbcInstructionCreateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcInstructionCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcInstructionCreateCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

}
