// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSlotShrinkRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnStatus")
    public Integer ownStatus;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SimilarEntryList")
    public String similarEntryListShrink;

    public static AddSlotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSlotShrinkRequest self = new AddSlotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSlotShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddSlotShrinkRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddSlotShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSlotShrinkRequest setOwnStatus(Integer ownStatus) {
        this.ownStatus = ownStatus;
        return this;
    }
    public Integer getOwnStatus() {
        return this.ownStatus;
    }

    public AddSlotShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddSlotShrinkRequest setSimilarEntryListShrink(String similarEntryListShrink) {
        this.similarEntryListShrink = similarEntryListShrink;
        return this;
    }
    public String getSimilarEntryListShrink() {
        return this.similarEntryListShrink;
    }

}
