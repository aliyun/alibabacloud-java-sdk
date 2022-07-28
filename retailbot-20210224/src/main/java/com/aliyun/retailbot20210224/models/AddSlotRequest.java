// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSlotRequest extends TeaModel {
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
        @NameInMap("CoreValue")
        public String coreValue;

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
