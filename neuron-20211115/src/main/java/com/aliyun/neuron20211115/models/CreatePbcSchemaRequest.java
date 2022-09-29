// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcSchemaRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pbcVersion")
    public String pbcVersion;

    @NameInMap("schema")
    public String schema;

    public static CreatePbcSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcSchemaRequest self = new CreatePbcSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcSchemaRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CreatePbcSchemaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreatePbcSchemaRequest setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public CreatePbcSchemaRequest setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    public CreatePbcSchemaRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
