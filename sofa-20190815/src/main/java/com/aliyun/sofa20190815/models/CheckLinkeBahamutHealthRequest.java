// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutHealthRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    public static CheckLinkeBahamutHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutHealthRequest self = new CheckLinkeBahamutHealthRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutHealthRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
