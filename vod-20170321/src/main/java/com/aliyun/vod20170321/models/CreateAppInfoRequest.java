// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
    /**
     * <p>The name of the application. The application name must be unique.</p>
     * <br>
     * <p>*   The name can contain letters, digits, periods (.), hyphens (-), and at signs (@). The name can be up to 128 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application.</p>
     * <br>
     * <p>*   The description can contain up to 512 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
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
