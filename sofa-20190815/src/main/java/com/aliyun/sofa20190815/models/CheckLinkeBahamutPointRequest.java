// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutPointRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    public static CheckLinkeBahamutPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutPointRequest self = new CheckLinkeBahamutPointRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutPointRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
