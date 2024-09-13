// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("IsUrgent")
    public Boolean isUrgent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cid+lUpHxTIXt7DYqJDcpVxlA==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>任务单标题：必填</p>
     */
    @NameInMap("Overview")
    public String overview;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>重要性描述</p>
     */
    @NameInMap("UrgentDescription")
    public String urgentDescription;

    public static CreateTaskOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderRequest self = new CreateTaskOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateTaskOrderRequest setIsUrgent(Boolean isUrgent) {
        this.isUrgent = isUrgent;
        return this;
    }
    public Boolean getIsUrgent() {
        return this.isUrgent;
    }

    public CreateTaskOrderRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public CreateTaskOrderRequest setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public CreateTaskOrderRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateTaskOrderRequest setUrgentDescription(String urgentDescription) {
        this.urgentDescription = urgentDescription;
        return this;
    }
    public String getUrgentDescription() {
        return this.urgentDescription;
    }

}
