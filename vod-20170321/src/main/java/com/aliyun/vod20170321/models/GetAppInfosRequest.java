// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosRequest extends TeaModel {
    /**
     * <p>The IDs of applications. You can obtain application IDs from the response to the <a href="https://help.aliyun.com/document_detail/113266.html">CreateAppInfo</a> or <a href="https://help.aliyun.com/document_detail/114000.html">ListAppInfo</a> operation.</p>
     * <ul>
     * <li>You can specify a maximum of 10 application IDs.</li>
     * <li>Separate application IDs with commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    public static GetAppInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosRequest self = new GetAppInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInfosRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

}
