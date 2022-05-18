// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSlotRequest extends TeaModel {
    // 槽位名称
    @NameInMap("Alias")
    public String alias;

    // 槽位所属分类id
    @NameInMap("CategoryId")
    public Integer categoryId;

    // 槽位中文描述
    @NameInMap("Description")
    public String description;

    // 槽位开启状态
    @NameInMap("OwnStatus")
    public Integer ownStatus;

    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 核心同义词信息
    @NameInMap("SimilarEntryList")
    public java.util.List<AddSlotRequestSimilarEntryList> similarEntryList;

    public static AddSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSlotRequest self = new AddSlotRequest();
        return TeaModel.build(map, self);
    }

    public AddSlotRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddSlotRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddSlotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSlotRequest setOwnStatus(Integer ownStatus) {
        this.ownStatus = ownStatus;
        return this;
    }
    public Integer getOwnStatus() {
        return this.ownStatus;
    }

    public AddSlotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddSlotRequest setSimilarEntryList(java.util.List<AddSlotRequestSimilarEntryList> similarEntryList) {
        this.similarEntryList = similarEntryList;
        return this;
    }
    public java.util.List<AddSlotRequestSimilarEntryList> getSimilarEntryList() {
        return this.similarEntryList;
    }

    public static class AddSlotRequestSimilarEntryList extends TeaModel {
        // 核心词值
        @NameInMap("CoreValue")
        public String coreValue;

        // 同义词信息
        @NameInMap("SimilarValues")
        public java.util.List<String> similarValues;

        public static AddSlotRequestSimilarEntryList build(java.util.Map<String, ?> map) throws Exception {
            AddSlotRequestSimilarEntryList self = new AddSlotRequestSimilarEntryList();
            return TeaModel.build(map, self);
        }

        public AddSlotRequestSimilarEntryList setCoreValue(String coreValue) {
            this.coreValue = coreValue;
            return this;
        }
        public String getCoreValue() {
            return this.coreValue;
        }

        public AddSlotRequestSimilarEntryList setSimilarValues(java.util.List<String> similarValues) {
            this.similarValues = similarValues;
            return this;
        }
        public java.util.List<String> getSimilarValues() {
            return this.similarValues;
        }

    }

}
