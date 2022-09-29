// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInstruction extends TeaModel {
    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pbcVersion")
    public String pbcVersion;

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

    public PbcInstruction setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcInstruction setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

}
