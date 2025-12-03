// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenUploadPictureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0Dxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d76218eb?Expires=1723720214&OSSAccessKeyId=LTAI4G1mgPbjvGQuiV1Xxxxx&Signature=4o3xxxx">http://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d76218eb?Expires=1723720214&amp;OSSAccessKeyId=LTAI4G1mgPbjvGQuiV1Xxxxx&amp;Signature=4o3xxxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeScreenUploadPictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenUploadPictureResponseBody self = new DescribeScreenUploadPictureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenUploadPictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenUploadPictureResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
