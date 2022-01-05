// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetAlinkAlgoInfoRequest extends TeaModel {
    @NameInMap("AlgoName")
    public String algoName;

    @NameInMap("UserNumber")
    public String userNumber;

    public static GetAlinkAlgoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlinkAlgoInfoRequest self = new GetAlinkAlgoInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAlinkAlgoInfoRequest setAlgoName(String algoName) {
        this.algoName = algoName;
        return this;
    }
    public String getAlgoName() {
        return this.algoName;
    }

    public GetAlinkAlgoInfoRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
