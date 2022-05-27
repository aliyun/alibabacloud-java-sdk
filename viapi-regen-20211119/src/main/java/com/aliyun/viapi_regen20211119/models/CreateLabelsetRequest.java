// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateLabelsetRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("TagSettings")
    public String tagSettings;

    @NameInMap("TagUserList")
    public String tagUserList;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserOssUrl")
    public String userOssUrl;

    public static CreateLabelsetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelsetRequest self = new CreateLabelsetRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelsetRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public CreateLabelsetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLabelsetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLabelsetRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public CreateLabelsetRequest setTagSettings(String tagSettings) {
        this.tagSettings = tagSettings;
        return this;
    }
    public String getTagSettings() {
        return this.tagSettings;
    }

    public CreateLabelsetRequest setTagUserList(String tagUserList) {
        this.tagUserList = tagUserList;
        return this;
    }
    public String getTagUserList() {
        return this.tagUserList;
    }

    public CreateLabelsetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLabelsetRequest setUserOssUrl(String userOssUrl) {
        this.userOssUrl = userOssUrl;
        return this;
    }
    public String getUserOssUrl() {
        return this.userOssUrl;
    }

}
