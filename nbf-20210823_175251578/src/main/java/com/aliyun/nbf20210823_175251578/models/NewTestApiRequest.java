// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210823_175251578.models;

import com.aliyun.tea.*;

public class NewTestApiRequest extends TeaModel {
    @NameInMap("input")
    public Integer input;

    public static NewTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        NewTestApiRequest self = new NewTestApiRequest();
        return TeaModel.build(map, self);
    }

    public NewTestApiRequest setInput(Integer input) {
        this.input = input;
        return this;
    }
    public Integer getInput() {
        return this.input;
    }

}
