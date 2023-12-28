// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetActionResponseBody extends TeaModel {
    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Content")
    public byte[] content;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Popularity")
    public String popularity;

    @NameInMap("RequestId")
    public String requestId;

    public static GetActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActionResponseBody self = new GetActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActionResponseBody setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public GetActionResponseBody setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public GetActionResponseBody setContent(byte[] content) {
        this.content = content;
        return this;
    }
    public byte[] getContent() {
        return this.content;
    }

    public GetActionResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetActionResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public GetActionResponseBody setPopularity(String popularity) {
        this.popularity = popularity;
        return this;
    }
    public String getPopularity() {
        return this.popularity;
    }

    public GetActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
