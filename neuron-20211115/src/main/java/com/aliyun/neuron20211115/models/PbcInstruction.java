// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInstruction extends TeaModel {
    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    @NameInMap("requestId")
    public String requestId;

    public static PbcInstruction build(java.util.Map<String, ?> map) throws Exception {
        PbcInstruction self = new PbcInstruction();
        return TeaModel.build(map, self);
    }

    public PbcInstruction setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public PbcInstruction setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcInstruction setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public PbcInstruction setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
