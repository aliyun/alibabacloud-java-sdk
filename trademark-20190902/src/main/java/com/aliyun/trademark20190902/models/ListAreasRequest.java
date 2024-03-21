// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAreasRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ParentCode")
    public String parentCode;

    public static ListAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAreasRequest self = new ListAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListAreasRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListAreasRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

}
