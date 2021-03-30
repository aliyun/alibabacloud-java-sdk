// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DAppRes extends TeaModel {
    // id
    @NameInMap("Id")
    public String id;

    // 代码
    @NameInMap("Code")
    public String code;

    // 名称
    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public DPair type;

    // 子类型
    @NameInMap("SubType")
    public String subType;

    public static DAppRes build(java.util.Map<String, ?> map) throws Exception {
        DAppRes self = new DAppRes();
        return TeaModel.build(map, self);
    }

    public DAppRes setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DAppRes setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DAppRes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DAppRes setType(DPair type) {
        this.type = type;
        return this;
    }
    public DPair getType() {
        return this.type;
    }

    public DAppRes setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
