// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcVersionCmd extends TeaModel {
    @NameInMap("apiSchema")
    public String apiSchema;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("developerId")
    public Long developerId;

    @NameInMap("document")
    public String document;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("name")
    public String name;

    @NameInMap("schema")
    public String schema;

    @NameInMap("version")
    public String version;

    public static PbcVersionCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcVersionCmd self = new PbcVersionCmd();
        return TeaModel.build(map, self);
    }

    public PbcVersionCmd setApiSchema(String apiSchema) {
        this.apiSchema = apiSchema;
        return this;
    }
    public String getApiSchema() {
        return this.apiSchema;
    }

    public PbcVersionCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcVersionCmd setDeveloperId(Long developerId) {
        this.developerId = developerId;
        return this;
    }
    public Long getDeveloperId() {
        return this.developerId;
    }

    public PbcVersionCmd setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public PbcVersionCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcVersionCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PbcVersionCmd setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public PbcVersionCmd setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
