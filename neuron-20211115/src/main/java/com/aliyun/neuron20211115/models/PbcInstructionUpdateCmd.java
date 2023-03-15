// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInstructionUpdateCmd extends TeaModel {
    @NameInMap("document")
    public String document;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    public static PbcInstructionUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcInstructionUpdateCmd self = new PbcInstructionUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PbcInstructionUpdateCmd setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public PbcInstructionUpdateCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

}
