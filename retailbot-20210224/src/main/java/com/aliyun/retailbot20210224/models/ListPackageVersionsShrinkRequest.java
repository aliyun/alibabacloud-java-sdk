// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageVersionsShrinkRequest extends TeaModel {
    // 操作人id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作人名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 包code集合
    @NameInMap("PackageCodes")
    public String packageCodesShrink;

    public static ListPackageVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPackageVersionsShrinkRequest self = new ListPackageVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPackageVersionsShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPackageVersionsShrinkRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ListPackageVersionsShrinkRequest setPackageCodesShrink(String packageCodesShrink) {
        this.packageCodesShrink = packageCodesShrink;
        return this;
    }
    public String getPackageCodesShrink() {
        return this.packageCodesShrink;
    }

}
