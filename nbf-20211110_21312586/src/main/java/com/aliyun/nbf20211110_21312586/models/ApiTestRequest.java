// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class ApiTestRequest extends TeaModel {
    @NameInMap("testCmd")
    public java.io.InputStream testCmd;

    public static ApiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiTestRequest self = new ApiTestRequest();
        return TeaModel.build(map, self);
    }

    public ApiTestRequest setTestCmd(java.io.InputStream testCmd) {
        this.testCmd = testCmd;
        return this;
    }
    public java.io.InputStream getTestCmd() {
        return this.testCmd;
    }

}
