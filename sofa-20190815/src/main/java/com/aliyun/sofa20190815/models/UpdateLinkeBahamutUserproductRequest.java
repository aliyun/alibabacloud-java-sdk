// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutUserproductRequest extends TeaModel {
    @NameInMap("UserEmpId")
    public String userEmpId;

    @NameInMap("UserProductInfosRepeatList")
    public java.util.List<String> userProductInfosRepeatList;

    public static UpdateLinkeBahamutUserproductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutUserproductRequest self = new UpdateLinkeBahamutUserproductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutUserproductRequest setUserEmpId(String userEmpId) {
        this.userEmpId = userEmpId;
        return this;
    }
    public String getUserEmpId() {
        return this.userEmpId;
    }

    public UpdateLinkeBahamutUserproductRequest setUserProductInfosRepeatList(java.util.List<String> userProductInfosRepeatList) {
        this.userProductInfosRepeatList = userProductInfosRepeatList;
        return this;
    }
    public java.util.List<String> getUserProductInfosRepeatList() {
        return this.userProductInfosRepeatList;
    }

}
