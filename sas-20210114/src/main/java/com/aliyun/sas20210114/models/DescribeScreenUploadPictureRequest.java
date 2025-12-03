// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenUploadPictureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d762xxxx">https://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d762xxxx</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    public static DescribeScreenUploadPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenUploadPictureRequest self = new DescribeScreenUploadPictureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenUploadPictureRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

}
