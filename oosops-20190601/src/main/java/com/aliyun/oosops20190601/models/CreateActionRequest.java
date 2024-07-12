// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreateActionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("Popularity")
    public Integer popularity;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActionRequest self = new CreateActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public CreateActionRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public CreateActionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateActionRequest setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public CreateActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
