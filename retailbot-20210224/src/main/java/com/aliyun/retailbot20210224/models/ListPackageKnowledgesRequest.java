// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesRequest extends TeaModel {
    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 包code
    @NameInMap("PackageCode")
    public String packageCode;

    // 包version
    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("RobotCode")
    public String robotCode;

    public static ListPackageKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesRequest self = new ListPackageKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPackageKnowledgesRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ListPackageKnowledgesRequest setPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }
    public String getPackageCode() {
        return this.packageCode;
    }

    public ListPackageKnowledgesRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public ListPackageKnowledgesRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
