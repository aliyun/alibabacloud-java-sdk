// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectObjectRequest extends TeaModel {
    @NameInMap("SelectRequest")
    public SelectRequest selectRequest;

    public static SelectObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectObjectRequest self = new SelectObjectRequest();
        return TeaModel.build(map, self);
    }

    public SelectObjectRequest setSelectRequest(SelectRequest selectRequest) {
        this.selectRequest = selectRequest;
        return this;
    }
    public SelectRequest getSelectRequest() {
        return this.selectRequest;
    }

}
