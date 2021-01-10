// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetcoverageRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    public static GetLinkeBahamutQualitygetcoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetcoverageRequest self = new GetLinkeBahamutQualitygetcoverageRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetcoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
