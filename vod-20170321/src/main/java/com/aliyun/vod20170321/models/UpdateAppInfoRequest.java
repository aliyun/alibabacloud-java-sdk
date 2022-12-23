// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoRequest extends TeaModel {
    // The ID of the application.
    // 
    // *   Default value: **app-1000000**.
    // *   For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The name of the application.
    // 
    // *   The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).
    // *   The name can contain only UTF-8 characters.
    @NameInMap("AppName")
    public String appName;

    // The description of the application.
    // 
    // *   The description can contain up to 512 characters in length.
    // *   The description can contain only UTF-8 characters.
    @NameInMap("Description")
    public String description;

    // The status of the application. Valid values:
    // 
    // *   **Normal**
    // *   **Disable**
    @NameInMap("Status")
    public String status;

    public static UpdateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoRequest self = new UpdateAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAppInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
