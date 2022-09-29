// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcSchema extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pbcVersion")
    public String pbcVersion;

    @NameInMap("schema")
    public String schema;

    public static PbcSchema build(java.util.Map<String, ?> map) throws Exception {
        PbcSchema self = new PbcSchema();
        return TeaModel.build(map, self);
    }

    public PbcSchema setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcSchema setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcSchema setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    public PbcSchema setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
