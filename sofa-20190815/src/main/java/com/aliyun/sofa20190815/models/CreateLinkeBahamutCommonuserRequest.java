// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCommonuserRequest extends TeaModel {
    @NameInMap("UserCommonUseInfosRepeatList")
    public java.util.List<String> userCommonUseInfosRepeatList;

    public static CreateLinkeBahamutCommonuserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCommonuserRequest self = new CreateLinkeBahamutCommonuserRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCommonuserRequest setUserCommonUseInfosRepeatList(java.util.List<String> userCommonUseInfosRepeatList) {
        this.userCommonUseInfosRepeatList = userCommonUseInfosRepeatList;
        return this;
    }
    public java.util.List<String> getUserCommonUseInfosRepeatList() {
        return this.userCommonUseInfosRepeatList;
    }

}
