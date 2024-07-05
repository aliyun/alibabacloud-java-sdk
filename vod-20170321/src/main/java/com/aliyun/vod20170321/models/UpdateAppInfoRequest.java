// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <ul>
     * <li>Default value: <strong>app-1000000</strong>.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * <ul>
     * <li>The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).</li>
     * <li>The name can contain only UTF-8 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application.</p>
     * <ul>
     * <li>The description can contain up to 512 characters in length.</li>
     * <li>The description can contain only UTF-8 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>my first app.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The status of the application. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
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
