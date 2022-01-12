// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DAppRes extends TeaModel {
    // 代码
    @NameInMap("Code")
    public String code;

    // id
    @NameInMap("Id")
    public String id;

    // 名称
    @NameInMap("Name")
    public String name;

    // 子类型
    @NameInMap("SubType")
    public String subType;

    @NameInMap("Type")
    public DPair type;

    public static DAppRes build(java.util.Map<String, ?> map) throws Exception {
        DAppRes self = new DAppRes();
        return TeaModel.build(map, self);
    }

    public DAppRes setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DAppRes setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DAppRes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DAppRes setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DAppRes setType(DPair type) {
        this.type = type;
        return this;
    }
    public DPair getType() {
        return this.type;
    }

}
