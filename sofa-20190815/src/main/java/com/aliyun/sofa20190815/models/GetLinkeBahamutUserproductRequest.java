// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUserproductRequest extends TeaModel {
    @NameInMap("UserEmpId")
    public String userEmpId;

    public static GetLinkeBahamutUserproductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUserproductRequest self = new GetLinkeBahamutUserproductRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUserproductRequest setUserEmpId(String userEmpId) {
        this.userEmpId = userEmpId;
        return this;
    }
    public String getUserEmpId() {
        return this.userEmpId;
    }

}
