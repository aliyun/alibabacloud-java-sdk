// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupNotificationSettingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F70D09B-0EE5-54A6-A09A-1EBDB9297172</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the group event notification is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceGroupNotificationEnableStatus")
    public Boolean resourceGroupNotificationEnableStatus;

    public static GetResourceGroupNotificationSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupNotificationSettingResponseBody self = new GetResourceGroupNotificationSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupNotificationSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupNotificationSettingResponseBody setResourceGroupNotificationEnableStatus(Boolean resourceGroupNotificationEnableStatus) {
        this.resourceGroupNotificationEnableStatus = resourceGroupNotificationEnableStatus;
        return this;
    }
    public Boolean getResourceGroupNotificationEnableStatus() {
        return this.resourceGroupNotificationEnableStatus;
    }

}
