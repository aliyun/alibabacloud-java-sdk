// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcSubscribe extends TeaModel {
    @NameInMap("developerId")
    public String developerId;

    @NameInMap("id")
    public Long id;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("purpose")
    public String purpose;

    @NameInMap("subPbcName")
    public String subPbcName;

    public static PbcSubscribe build(java.util.Map<String, ?> map) throws Exception {
        PbcSubscribe self = new PbcSubscribe();
        return TeaModel.build(map, self);
    }

    public PbcSubscribe setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public PbcSubscribe setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PbcSubscribe setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcSubscribe setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public PbcSubscribe setSubPbcName(String subPbcName) {
        this.subPbcName = subPbcName;
        return this;
    }
    public String getSubPbcName() {
        return this.subPbcName;
    }

}
