// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
    /**
     * <p>Creates an application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>## Common errors</p>
     * <br>
     * <p>The following table describes the common errors that this operation can return. </p>
     * <br>
     * <p>| Error code | Error message | HTTP status code | Description |</p>
     * <p>| ---------- | ------------- | ---------------- | ----------- |</p>
     * <p>| OperationDenied.NotOpenAppService | The app service is not open. | 403 | The error message returned because the multi-application service has not been activated. |</p>
     * <p>| Forbidden.OperateApp | User not authorized to operate app. | 403 | The error message returned because you are not authorized to manage the application. |</p>
     * <p>| AlreadyExist.AppName | The specified AppName has already exist. | 409 | The error message returned because the name of the application already exists. |</p>
     * <p>| LimitExceeded.AppCount | App Count has exceeded 10. | 400 | The error message returned because the number of applications that can be created exceeds the upper limit. |</p>
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
