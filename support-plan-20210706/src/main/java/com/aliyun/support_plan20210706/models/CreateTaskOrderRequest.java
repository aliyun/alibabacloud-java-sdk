// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderRequest extends TeaModel {
    // 建单人姓名：快手客户
    @NameInMap("CustomerRealName")
    public String customerRealName;

    // 建单人：固定值
    @NameInMap("CustomerUserId")
    public String customerUserId;

    // 重要性描述
    @NameInMap("ImportantDescription")
    public String importantDescription;

    // 是否紧急
    @NameInMap("IsImportant")
    public String isImportant;

    // 主群关联Id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // productType
    @NameInMap("ProductType")
    public String productType;

    // 问题分类名称
    @NameInMap("ProductTypeName")
    public String productTypeName;

    // 任务单标题
    @NameInMap("TaskTitle")
    public String taskTitle;

    public static CreateTaskOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderRequest self = new CreateTaskOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderRequest setCustomerRealName(String customerRealName) {
        this.customerRealName = customerRealName;
        return this;
    }
    public String getCustomerRealName() {
        return this.customerRealName;
    }

    public CreateTaskOrderRequest setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
        return this;
    }
    public String getCustomerUserId() {
        return this.customerUserId;
    }

    public CreateTaskOrderRequest setImportantDescription(String importantDescription) {
        this.importantDescription = importantDescription;
        return this;
    }
    public String getImportantDescription() {
        return this.importantDescription;
    }

    public CreateTaskOrderRequest setIsImportant(String isImportant) {
        this.isImportant = isImportant;
        return this;
    }
    public String getIsImportant() {
        return this.isImportant;
    }

    public CreateTaskOrderRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public CreateTaskOrderRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateTaskOrderRequest setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
        return this;
    }
    public String getProductTypeName() {
        return this.productTypeName;
    }

    public CreateTaskOrderRequest setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
        return this;
    }
    public String getTaskTitle() {
        return this.taskTitle;
    }

}
