// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetOdpsResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("Success")
    public Boolean success;

    public static GetOdpsResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOdpsResultResponseBody self = new GetOdpsResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOdpsResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOdpsResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
