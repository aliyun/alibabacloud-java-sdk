// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class AreaMapAddrValue extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("name")
    public String name;

    @NameInMap("white")
    public Boolean white;

    @NameInMap("size")
    public String size;

    public static AreaMapAddrValue build(java.util.Map<String, ?> map) throws Exception {
        AreaMapAddrValue self = new AreaMapAddrValue();
        return TeaModel.build(map, self);
    }

    public AreaMapAddrValue setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AreaMapAddrValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AreaMapAddrValue setWhite(Boolean white) {
        this.white = white;
        return this;
    }
    public Boolean getWhite() {
        return this.white;
    }

    public AreaMapAddrValue setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
