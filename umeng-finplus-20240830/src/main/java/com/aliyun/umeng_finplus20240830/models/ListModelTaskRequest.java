// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ListModelTaskRequest extends TeaModel {
    @NameInMap("param")
    public ListModelTaskRequestParam param;

    public static ListModelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelTaskRequest self = new ListModelTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListModelTaskRequest setParam(ListModelTaskRequestParam param) {
        this.param = param;
        return this;
    }
    public ListModelTaskRequestParam getParam() {
        return this.param;
    }

    public static class ListModelTaskRequestParam extends TeaModel {
        @NameInMap("reserved")
        public String reserved;

        public static ListModelTaskRequestParam build(java.util.Map<String, ?> map) throws Exception {
            ListModelTaskRequestParam self = new ListModelTaskRequestParam();
            return TeaModel.build(map, self);
        }

        public ListModelTaskRequestParam setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

    }

}
