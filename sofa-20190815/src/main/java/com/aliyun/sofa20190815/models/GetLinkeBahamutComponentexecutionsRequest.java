// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutComponentexecutionsRequest extends TeaModel {
    @NameInMap("IdList")
    public String idList;

    public static GetLinkeBahamutComponentexecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutComponentexecutionsRequest self = new GetLinkeBahamutComponentexecutionsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutComponentexecutionsRequest setIdList(String idList) {
        this.idList = idList;
        return this;
    }
    public String getIdList() {
        return this.idList;
    }

}
