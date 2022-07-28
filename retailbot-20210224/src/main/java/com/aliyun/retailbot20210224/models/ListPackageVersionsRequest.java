// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageVersionsRequest extends TeaModel {
    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("PackageCodes")
    public java.util.List<String> packageCodes;

    public static ListPackageVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPackageVersionsRequest self = new ListPackageVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPackageVersionsRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPackageVersionsRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ListPackageVersionsRequest setPackageCodes(java.util.List<String> packageCodes) {
        this.packageCodes = packageCodes;
        return this;
    }
    public java.util.List<String> getPackageCodes() {
        return this.packageCodes;
    }

}
