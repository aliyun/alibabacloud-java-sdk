// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
    // The name of the application, which must be unique. 
    // 
    // - The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).
    // - The name can contain only UTF-8 characters.
    @NameInMap("AppName")
    public String appName;

    // The description of the application. 
    // - The description can contain up to 512 characters in length.
    // - The description can contain only UTF-8 characters.
    @NameInMap("Description")
    public String description;

    public static CreateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoRequest self = new CreateAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
