// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdateActionRequest extends TeaModel {
    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Content")
    public String content;

    @NameInMap("Popularity")
    public Integer popularity;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionRequest self = new UpdateActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public UpdateActionRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public UpdateActionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateActionRequest setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public UpdateActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
