// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetPackageVersionRequest extends TeaModel {
    // 操作人id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作人名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 包code
    @NameInMap("PackageCode")
    public String packageCode;

    public static GetPackageVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPackageVersionRequest self = new GetPackageVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetPackageVersionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public GetPackageVersionRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public GetPackageVersionRequest setPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }
    public String getPackageCode() {
        return this.packageCode;
    }

}
