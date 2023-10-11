// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListPakRenderExpressionRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("ListStatus")
    public String listStatus;

    @NameInMap("Size")
    public Integer size;

    public static PopListPakRenderExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListPakRenderExpressionRequest self = new PopListPakRenderExpressionRequest();
        return TeaModel.build(map, self);
    }

    public PopListPakRenderExpressionRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListPakRenderExpressionRequest setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }
    public String getListStatus() {
        return this.listStatus;
    }

    public PopListPakRenderExpressionRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
