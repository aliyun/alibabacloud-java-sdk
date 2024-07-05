// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>.</p>
     * <p>If you have activated the multi-application service, specify the ID of the application to query all image and text watermark templates in the specified application. If you leave this parameter empty, image and text watermark templates in all applications are queried. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkRequest self = new ListWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public ListWatermarkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
