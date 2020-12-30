// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppDescription")
    public String appDescription;

    @NameInMap("CategoryName")
    public String categoryName;

    @NameInMap("UsingSharedStorage")
    public Boolean usingSharedStorage;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateApplicationRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public CreateApplicationRequest setUsingSharedStorage(Boolean usingSharedStorage) {
        this.usingSharedStorage = usingSharedStorage;
        return this;
    }
    public Boolean getUsingSharedStorage() {
        return this.usingSharedStorage;
    }

}
