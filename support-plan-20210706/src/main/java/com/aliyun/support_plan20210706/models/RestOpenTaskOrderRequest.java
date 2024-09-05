// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class RestOpenTaskOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cidXcezGVQJjiWy2PzXylGwvg==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E21111796147LE</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>重开补充说明</p>
     */
    @NameInMap("ResetContent")
    public String resetContent;

    /**
     * <strong>example:</strong>
     * <p>枚举值：6:解决方案无效；7:当前问题仍有疑问需要咨询；8:问题重复出现</p>
     */
    @NameInMap("ResetType")
    public String resetType;

    /**
     * <strong>example:</strong>
     * <p>操作人姓名</p>
     */
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
