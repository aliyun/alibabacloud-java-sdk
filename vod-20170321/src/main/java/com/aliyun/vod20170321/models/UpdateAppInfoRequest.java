// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoRequest extends TeaModel {
    /**
     * <p>The application ID. This is the value of the AppId parameter returned by the <a href="https://help.aliyun.com/document_detail/113266.html">CreateApp</a> or <a href="https://help.aliyun.com/document_detail/114000.html">GetAppInfos</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The new application name.</p>
     * <ul>
     * <li>The name can be up to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), hyphens (-), and at signs (@).</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The new application description.</p>
     * <ul>
     * <li>The description can be up to 512 characters in length.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>my first app.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new application status. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Normal.</li>
     * <li><strong>Disable</strong>: Disabled.</li>
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
