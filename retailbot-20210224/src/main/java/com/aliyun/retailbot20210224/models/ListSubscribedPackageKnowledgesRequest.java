// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscribedPackageKnowledgesRequest extends TeaModel {
    // 类目id
    @NameInMap("CategoryId")
    public Long categoryId;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 查询指定包的场景
    @NameInMap("PackageCodes")
    public java.util.List<String> packageCodes;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    public static ListSubscribedPackageKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribedPackageKnowledgesRequest self = new ListSubscribedPackageKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscribedPackageKnowledgesRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public ListSubscribedPackageKnowledgesRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListSubscribedPackageKnowledgesRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ListSubscribedPackageKnowledgesRequest setPackageCodes(java.util.List<String> packageCodes) {
        this.packageCodes = packageCodes;
        return this;
    }
    public java.util.List<String> getPackageCodes() {
        return this.packageCodes;
    }

    public ListSubscribedPackageKnowledgesRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
