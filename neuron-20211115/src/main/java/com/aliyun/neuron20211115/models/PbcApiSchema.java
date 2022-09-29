// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcApiSchema extends TeaModel {
    @NameInMap("apiSchema")
    public String apiSchema;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pbcVersion")
    public String pbcVersion;

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

    public PbcApiSchema setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcApiSchema setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

}
