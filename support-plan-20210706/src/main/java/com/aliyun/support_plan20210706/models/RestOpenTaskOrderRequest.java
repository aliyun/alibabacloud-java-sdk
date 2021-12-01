// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class RestOpenTaskOrderRequest extends TeaModel {
    // 主群关联Id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // 任务单ID
    @NameInMap("OrderId")
    public String orderId;

    // 重开说明
    @NameInMap("ResetContent")
    public String resetContent;

    // 重开类型
    @NameInMap("ResetType")
    public String resetType;

    // 操作人姓名
    @NameInMap("UserName")
    public String userName;

    public static RestOpenTaskOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RestOpenTaskOrderRequest self = new RestOpenTaskOrderRequest();
        return TeaModel.build(map, self);
    }

    public RestOpenTaskOrderRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public RestOpenTaskOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RestOpenTaskOrderRequest setResetContent(String resetContent) {
        this.resetContent = resetContent;
        return this;
    }
    public String getResetContent() {
        return this.resetContent;
    }

    public RestOpenTaskOrderRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

    public RestOpenTaskOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
