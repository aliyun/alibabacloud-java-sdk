// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusRequest extends TeaModel {
    @NameInMap("Backed")
    public Boolean backed;

    @NameInMap("DealReason")
    public String dealReason;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Status")
    public Integer status;

    public static ModifyEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusRequest self = new ModifyEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusRequest setBacked(Boolean backed) {
        this.backed = backed;
        return this;
    }
    public Boolean getBacked() {
        return this.backed;
    }

    public ModifyEventStatusRequest setDealReason(String dealReason) {
        this.dealReason = dealReason;
        return this;
    }
    public String getDealReason() {
        return this.dealReason;
    }

    public ModifyEventStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyEventStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
