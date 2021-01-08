// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class JoinCompanyRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    public static JoinCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinCompanyRequest self = new JoinCompanyRequest();
        return TeaModel.build(map, self);
    }

    public JoinCompanyRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
