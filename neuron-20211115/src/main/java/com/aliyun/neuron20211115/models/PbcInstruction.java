// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInstruction extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("document")
    public String document;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
