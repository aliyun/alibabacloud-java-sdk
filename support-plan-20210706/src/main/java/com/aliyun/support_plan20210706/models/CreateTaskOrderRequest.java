// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>建单人姓名：快手客户</p>
     */
    @NameInMap("CustomerRealName")
    public String customerRealName;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CustomerUserId")
    public String customerUserId;

    /**
     * <strong>example:</strong>
     * <p>重要性描述</p>
     */
    @NameInMap("ImportantDescription")
    public String importantDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>如:normal或者hurry</p>
     */
    @NameInMap("IsImportant")
    public String isImportant;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cid+lUpHxTIXt7DYqJDcpVxlA==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>productType</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3270</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>lc-云享咨询</p>
     */
    @NameInMap("ProductTypeName")
    public String productTypeName;

    /**
     * <p>taskTitle</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>任务单标题：必填</p>
     */
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
