// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByPackageShrinkRequest extends TeaModel {
    // 行业包信息
    @NameInMap("PackageDTO")
    public String packageDTOShrink;

    // 分页参数
    @NameInMap("PageData")
    public String pageDataShrink;

    public static ListSubscriptionByPackageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByPackageShrinkRequest self = new ListSubscriptionByPackageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByPackageShrinkRequest setPackageDTOShrink(String packageDTOShrink) {
        this.packageDTOShrink = packageDTOShrink;
        return this;
    }
    public String getPackageDTOShrink() {
        return this.packageDTOShrink;
    }

    public ListSubscriptionByPackageShrinkRequest setPageDataShrink(String pageDataShrink) {
        this.pageDataShrink = pageDataShrink;
        return this;
    }
    public String getPageDataShrink() {
        return this.pageDataShrink;
    }

}
