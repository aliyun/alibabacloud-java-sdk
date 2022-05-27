// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateLabelsetRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("UserOssUrl")
    public String userOssUrl;

    public static UpdateLabelsetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelsetRequest self = new UpdateLabelsetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLabelsetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLabelsetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLabelsetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLabelsetRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public UpdateLabelsetRequest setUserOssUrl(String userOssUrl) {
        this.userOssUrl = userOssUrl;
        return this;
    }
    public String getUserOssUrl() {
        return this.userOssUrl;
    }

}
