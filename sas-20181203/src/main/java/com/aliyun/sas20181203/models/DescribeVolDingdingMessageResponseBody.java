// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVolDingdingMessageResponseBody extends TeaModel {
    /**
     * <p>The QR code address of the DingTalk group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.wikihow.com/images_en/thumb/4/48/Get-the-URL-for-Pictures-Step-4-Version-4.jpg/v4-728px-Get-the-URL-for-Pictures-Step-4-Version-4.jpg.webp">https://www.wikihow.com/images_en/thumb/4/48/Get-the-URL-for-Pictures-Step-4-Version-4.jpg/v4-728px-Get-the-URL-for-Pictures-Step-4-Version-4.jpg.webp</a></p>
     */
    @NameInMap("DingdingUrl")
    public String dingdingUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A437E93-47EE-548F-ABCE-13F89AA85585</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVolDingdingMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVolDingdingMessageResponseBody self = new DescribeVolDingdingMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVolDingdingMessageResponseBody setDingdingUrl(String dingdingUrl) {
        this.dingdingUrl = dingdingUrl;
        return this;
    }
    public String getDingdingUrl() {
        return this.dingdingUrl;
    }

    public DescribeVolDingdingMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
