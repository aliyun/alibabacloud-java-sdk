// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstallCodeForUuidRequest extends TeaModel {
    /**
     * <p>The UUID of the server for which the client installation code is to be queried.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> API to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eae0b46e-2155-422e-9565-ecc52c69****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetInstallCodeForUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstallCodeForUuidRequest self = new GetInstallCodeForUuidRequest();
        return TeaModel.build(map, self);
    }

    public GetInstallCodeForUuidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
