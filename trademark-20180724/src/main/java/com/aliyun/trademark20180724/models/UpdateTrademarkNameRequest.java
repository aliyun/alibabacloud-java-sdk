// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkNameRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 业务id
    @NameInMap("BizId")
    public String bizId;

    // 商标名称
    @NameInMap("TmName")
    public String tmName;

    // 商标图片
    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmComment")
    public String tmComment;

    // 商标类型
    @NameInMap("Type")
    public Long type;

    public static UpdateTrademarkNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkNameRequest self = new UpdateTrademarkNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrademarkNameRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateTrademarkNameRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public UpdateTrademarkNameRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public UpdateTrademarkNameRequest setTmComment(String tmComment) {
        this.tmComment = tmComment;
        return this;
    }
    public String getTmComment() {
        return this.tmComment;
    }

    public UpdateTrademarkNameRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
