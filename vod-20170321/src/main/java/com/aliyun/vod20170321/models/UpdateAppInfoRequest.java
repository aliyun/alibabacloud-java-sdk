// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>*   Default value: **app-1000000**.</p>
     * <p>*   For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>*   The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).</p>
     * <p>*   The name can contain only UTF-8 characters.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application.</p>
     * <br>
     * <p>*   The description can contain up to 512 characters in length.</p>
     * <p>*   The description can contain only UTF-8 characters.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The status of the application. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **Disable**</p>
     */
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
